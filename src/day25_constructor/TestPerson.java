package day25_constructor;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 =new Person("Katya", 35, 'F', LocalDate.of(1995, 5,15), false, true);
        System.out.println(p1);
    }
}
