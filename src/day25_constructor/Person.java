package day25_constructor;

import java.time.LocalDate;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;
    public boolean isMarried;
    public boolean isEmplyed;

    public Person(String name, int age, char gender, LocalDate DOB, boolean isMarried, boolean isEmplyed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
        this.isMarried = isMarried;
        this.isEmplyed = isEmplyed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", isMarried=" + isMarried +
                ", isEmplyed=" + isEmplyed +
                '}';
    }
}
