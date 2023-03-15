package day30_inharitanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee {
    public Teacher(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth, jobTitle, salary);
    }

    public void teach(){
        System.out.println(getName()+ " is teaching");
    }
}
