package Chat.SocketServer.src.main.java.edu.school21.sockets.repositories;

import edu.school21.sockets.models.User;
import edu.school21.sockets.repositories.CrudRepository;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<User> {
    Optional<User> findByUsername(String email);
}
