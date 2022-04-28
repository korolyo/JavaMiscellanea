package school21.spring.service.models;

import school21.spring.service.interfaces.Renderer;
import school21.spring.service.interfaces.PreProcessor;

public class RendererStandardImpl implements Renderer {
    PreProcessor preProcessor;

    @Override
    public void render(String text) {
        System.out.println(text);
    }
}