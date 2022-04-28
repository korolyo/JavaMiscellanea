package school21.spring.service.models;

import school21.spring.service.interfaces.Printer;

import java.time.LocalDateTime;

public class PrinterWithDateTimeImpl implements Printer {
    @Override
    public void print() {
        LocalDateTime time = new LocalDate;
        System.out.println(time);
    }
}
