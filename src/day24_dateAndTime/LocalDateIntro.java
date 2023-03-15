package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {


    public static void main(String[] args) {
        LocalDate  today = LocalDate.now();
        System.out.println(today);
        LocalDate birthday = LocalDate.of(1985,07,30);
        System.out.println(birthday);
        System.out.println(today.getYear());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(birthday.getDayOfWeek());
        System.out.println(today.plusYears(1));
        System.out.println(today.plusYears(1).isLeapYear());



    }
}
