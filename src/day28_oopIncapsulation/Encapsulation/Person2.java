package day28_oopIncapsulation.Encapsulation;

import java.time.LocalDate;

public class Person2 {
    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;


    public Person2(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
       setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public String getName() {
        if(name==null ){
            System.err.println("Invalid name");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if(name.isBlank() || name.isEmpty()){
            System.err.println("Invalid");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 120){
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender!='M' && gender!='F'){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Invalid DOB");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }



}
