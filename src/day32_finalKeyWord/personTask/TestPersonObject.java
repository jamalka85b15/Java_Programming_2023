package day32_finalKeyWord.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person=new Person("Jama", 'F', LocalDate.of(1985,7,30));
        System.out.println(person);
        person.setName("Nurzha");
        System.out.println(person);
        Employee employee=new Employee("Mark", 'M', LocalDate.of(1982,5,7),"Dev", 250000);
        System.out.println(employee);
        employee.breath();
        person.breath();
    }
}
