package day32_finalKeyWord.personTask;

import java.time.LocalDate;

public class Person {
    private String name;
    private final int age;
    private final char gender;
    private final LocalDate dob;
    public static final int numberOfHead;

    static {
        numberOfHead = 1;
    }

    public Person(String name, char gender, LocalDate dob) {
        setName(name);
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender " + gender);
            System.exit(1);
        }
        this.gender = gender;
        this.age = LocalDate.now().getYear()- dob.getYear();
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dob=" + dob +
                '}';
    }

    public void eat() {
        System.out.println(name+" is Eating");
    }

    public void drink() {
        System.out.println(name+" is Drinking");
    }
     public final void breath(){
         System.out.println(name+ " is Breathing");
    }
}
