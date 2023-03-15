package day35_polymorphism;

import day33_oop_Abstraction.employeeTask.Dancer;
import day33_oop_Abstraction.employeeTask.Driver;
import day33_oop_Abstraction.employeeTask.Employee;
import day33_oop_Abstraction.employeeTask.Teacher;

public class PolyPractice3 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Teacher("Hamza", "QA", "A01", 32, 110000, 'M'),
                new Driver("Lucy", "Java", "A28", 27, 128000, 'F'),
                new Teacher("Max", "QA", "A01", 32, 110000, 'M'),
                new Driver("Stasya", "Java", "A28", 27, 128000, 'F'),
                new Teacher("Tia", "QA", "A01", 32, 110000, 'M'),
                new Driver("Lena", "Java", "A28", 27, 128000, 'F'),
                new Teacher("Hector", "QA", "A01", 32, 110000, 'M'),
                new Dancer("Rita", "Java", "A28", 27, 128000, 'F'),
                new Driver("Rimma", "Java", "A28", 27, 128000, 'F'),
                new Teacher("Lupe", "QA", "A01", 32, 110000, 'M'),
                new Dancer("Angie", "Java", "A28", 27, 128000, 'F'),
                new Teacher("Roxy", "QA", "A01", 32, 110000, 'M'),
                new Teacher("James", "QA", "A01", 32, 110000, 'M'),

        };

        for (Employee each : employees) {
            System.out.println(each.getName() + " : " + each.getJobTitle());

        }
        System.out.println("--------------------");
        int countTeacher=0, coundtDriver=0, countDancer=0;
        for (Employee each: employees) {
            if(each instanceof  Dancer){
                countDancer++;
            } else if (each instanceof Driver) {
                coundtDriver++;
            }else{
                countTeacher++;
            }
        }
        System.out.println("Number of Teachers: "+countTeacher);
        System.out.println("Number of Drivers: "+coundtDriver);
        System.out.println("Number of Dancers: "+countDancer);

        for (Employee each : employees){
            if(each instanceof Teacher){
                System.out.println(each.getName());
            }

        }


    }}
    /*

1. Print the name and Job Title of every employee
2. How many developers do we have?
3. How many testers do we have?
4. How many teachers do we have?
5. How many Drivers do we have?
6. Display the names of employees who are not developers
*/

