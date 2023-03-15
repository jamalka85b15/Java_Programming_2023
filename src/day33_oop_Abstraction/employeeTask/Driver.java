package day33_oop_Abstraction.employeeTask;

import java.time.LocalDate;

public class Driver extends Employee {
    public Driver(String name, String jobTitle, String id, int age, double salary, char gender) {
        super(name, jobTitle, id, age, salary, gender);
    }


    @Override
    public void work() {

    }
}
