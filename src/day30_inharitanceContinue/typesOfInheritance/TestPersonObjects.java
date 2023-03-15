package day30_inharitanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student=new Student("Jama", 'F', LocalDate.of(1985,7,30));
        System.out.println(student);
        student.study();


        Employee employee=new Employee("Mark", 'M', LocalDate.of(1982,5,7), "Dev", 250000);
        System.out.println(employee);
        employee.work();


        President president=new President("Jo", 'M', LocalDate.of(1954, 5,5), LocalDate.of(2021,6,6));
        System.out.println(president);
        president.lie();
        System.out.println("-------------------");

        president.eat();
        student.eat();
        employee.eat();
    }
}
