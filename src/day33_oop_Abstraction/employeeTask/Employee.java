package day33_oop_Abstraction.employeeTask;

public abstract class Employee {
    private String name, jobTitle, id;
    private int age;
    private double salary;
    private char gender;

    public Employee(String name, String jobTitle, String id, int age, double salary, char gender) {
        setName(name);
        setJobTitle(jobTitle);
        setId(id);
        setAge(age);
        setSalary(salary);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
