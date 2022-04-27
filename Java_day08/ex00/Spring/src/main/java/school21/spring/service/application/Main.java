package school21.spring.service.application;

import school21.spring.service.interfaces.PreProcessor;
import school21.spring.service.interfaces.Renderer;
import school21.spring.service.models.PreProcessorToUpperImpl;
import school21.spring.service.models.PrinterWithPrefixImpl;
import school21.spring.service.models.RendererErrImpl;

public class Main {
    public static void main(String[] args) {
        PreProcessor preProcessor = new PreProcessorToUpperImpl();
        Renderer renderer = new RendererErrImpl(preProcessor);
        PrinterWithPrefixImpl printer = new PrinterWithPrefixImpl(renderer);
        printer.setPrefix("Prefix");
        printer.print("Hello!");
    }
}
