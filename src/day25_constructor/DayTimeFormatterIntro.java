package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-y, EEEE");
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));
    }
}
