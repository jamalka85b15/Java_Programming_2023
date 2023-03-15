package day25_constructor;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(start);

        LocalDateTime ends = LocalDateTime.of(2023,5,23,16,25,19);
        System.out.println(ends);
        System.out.println("MY "+ "\'");
    }
}
