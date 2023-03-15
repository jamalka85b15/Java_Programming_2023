package day28_oopIncapsulation.Encapsulation;

import day28_oopIncapsulation.PersonTask.Person;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {

        Person2 p1 = new Person2("J", 15, 'F', LocalDate.of(2022,7,30));
        System.out.println(p1);


    }
}
