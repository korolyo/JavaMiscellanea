package recipes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RestControllerRecipes {
    int id = 0;
    Recipe recipe = new Recipe();

    Map<Integer, Recipe> recipeBook = new HashMap<>();

    @PostMapping(path = "/recipe/new", consumes = "application/json", produces = "application/json")
    public Integer postRecipes(@RequestBody Recipe recipe) {
        if (!recipeBook.containsValue(recipe))
            recipeBook.put(++id, recipe);
        return id;
    }

    @GetMapping(path = "/recipe/{id}", consumes = "application/json", produces = "application/json")
    public Recipe getRecipes(@PathVariable int id) {
        Recipe recipe = recipeBook.get(id);
        if (recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found");
        }
        return recipe;
    }
}
