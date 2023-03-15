package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Employees {

    public static void main(String[] args) {

        ArrayList<Employee> employees =new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));
employees.get(0).setInfo("Josh", 34, 100000, 'M',  "A01","Java Developer");
        employees.get(1).setInfo("Emily", 40, 90000, 'F',  "A02","SDET");
        employees.get(2).setInfo("Conor", 38, 130000, 'M',  "A03","Project Manager");
        employees.get(3).setInfo("Bella", 29, 95000, 'F',  "A04","Java Developer");
        employees.get(4).setInfo("Jimmy", 54, 105000, 'M',  "A05","Data Analyst");

        for (Employee each : employees) {
            System.out.println(each.name+ " : "+ each.jobTitle);
            }
        System.out.println("---------------------");
            for (Employee each : employees) {
            if(each.jobTitle.equals("Java Developer")){
                System.out.println("Java devs: "+each.name);
            }}
            double max=employees.get(0).salary;
        double min=employees.get(0).salary;
                for (Employee each : employees) {
                    if(each.salary>max){
                        max=each.salary;

                }
                    if(each.salary<min){
                        min=each.salary;
                    }
        }
        System.out.println("Max "+max);
        System.out.println("Min "+min);
    }

}
