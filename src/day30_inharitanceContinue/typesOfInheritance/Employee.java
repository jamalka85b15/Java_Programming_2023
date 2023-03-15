package day30_inharitanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person {

    private String jobTitle;
    private String employeeId;
    private double salary;

    public Employee(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);
        setSalary(salary);
        setJobTitle(jobTitle);
       setEmployeeId(employeeId);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        if(salary<=0){
            System.out.println("Salary cannot be less than zero");
            System.exit(1);
        }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }
}
