package day10_string;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fulll name");
        String fullName =input.nextLine();
        System.out.println("Your age");
        byte age =input.nextByte();
        System.out.println("Your gender");
        char gender =input.next().charAt(0);
        input.nextLine();
        System.out.println("Company name");
        String companyName =input.nextLine();
        System.out.println("Job title");
        String title =input.nextLine();
        System.out.println("Salary");
        double salary =input.nextDouble();
        input.close();
        System.out.println("Emplayee name: "+fullName);
        System.out.println("Emplayee age: "+ age);
        System.out.println("Employee gender: "+ gender);
        System.out.println("Company name: "+ companyName);
        System.out.println("Job title: "+title);
        System.out.println("Employee salary: "+ salary);
    }


}
