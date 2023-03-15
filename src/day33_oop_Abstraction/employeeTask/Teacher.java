package day33_oop_Abstraction.employeeTask;

import java.time.LocalDate;

public class Teacher extends Employee {

    public Teacher(String name, String jobTitle, String id, int age, double salary, char gender) {
        super(name, jobTitle, id, age, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching in HS");

    }


}
