package day28_oopIncapsulation.Encapsulation;

public class Employee {
    private double salary;
    private String name;
    private String jobTitle;
    private int age;

    public Employee(String name,int age, String jobTitle, double salary) {
       setSalary(salary);
        setName(name);
        setJobTitle(jobTitle);
        setAge(age);
    }

    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Invalid salary");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getName() {
        if(name==null){
            System.err.println("Name is not given");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Name cannot be empty or blank");
        }
        this.name = name;
    }

    public String getJobTitle() {
        if(jobTitle==null){
            System.err.println("Invalid job title");
            System.exit(1);
        }
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Invalid job title");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        if(age < 16){
            System.err.println("Invalid age");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
