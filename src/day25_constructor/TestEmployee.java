package day25_constructor;

import java.time.LocalDate;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jama", 37, 'F', "SDET", 150000, LocalDate.of(2023,01,01));
        System.out.println(emp1);
        Employee emp2 = new Employee("Mark", 40, 'M', "VP", 300000, LocalDate.of(2022,02,02));
        System.out.println(emp2);
    }
}
