package day25_constructor;

import java.time.LocalDate;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public  String jobTitle;
    public double salary;
    public LocalDate hiredDate;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hiredDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    ; // this to set all instance as soon object is created


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hiredDate='" + hiredDate + '\'' +
                '}'; // to print
    }
}
