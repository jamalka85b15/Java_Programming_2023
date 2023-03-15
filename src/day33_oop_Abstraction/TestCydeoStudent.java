package day33_oop_Abstraction;

import day27_accessModifier.CydeoStudent;

import java.time.LocalDate;

public class TestCydeoStudent {
    public static void main(String[] args) {
        CydeoDevStudent cydeoDevStudent=new CydeoDevStudent("Jama", 'F', LocalDate.of(1985,7,30), "132","Alumni dev", 10);
        System.out.println(cydeoDevStudent);
        cydeoDevStudent.eat();
        cydeoDevStudent.drink();
        cydeoDevStudent.breath();
    }
}
