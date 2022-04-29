package school21.spring.service.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import school21.spring.service.models.PrinterWithPrefixImpl;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        PrinterWithPrefixImpl printer = applicationContext.getBean("printerWithPrefix", PrinterWithPrefixImpl.class);

        printer.setPrefix("Prefix");
        printer.print("Hello!");

    }
}
