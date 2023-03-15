package day17_customClass;

public class Employee {

    public String name;
    public int age;
    public double salary;
    public char gender;
    public String id;
    public String jobTitle;


    public void setInfo(String name, int age, double salary, char gender, String id, String jobTitle) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public void work(){
        System.out.println(name+ " is working very hard");
    }
}
