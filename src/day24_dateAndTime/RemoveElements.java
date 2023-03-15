package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<= 4){
                list.remove(i);

            }
        }
        System.out.println(list);
        System.out.println("------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,1,-2,3,4,5,6,7));
        System.out.println(list2);
        list2.removeIf( p  -> p < 4);
        System.out.println(list2);


        System.out.println("----------------");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "C#", "Java", "Ruby"));
        System.out.println(names);
        names.removeIf( each -> each.startsWith("J"));
        System.out.println(names);

        System.out.println("------------------------");
        ArrayList<Employee> employees =new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));
        employees.get(0).setInfo("Josh", 34, 100000, 'M',  "A01","Java Developer");
        employees.get(1).setInfo("Emily", 40, 90000, 'F',  "A02","SDET");
        employees.get(2).setInfo("Conor", 38, 130000, 'M',  "A03","Project Manager");
        employees.get(3).setInfo("Bella", 29, 95000, 'F',  "A04","Java Developer");
        employees.get(4).setInfo("Jimmy", 54, 105000, 'M',  "A05","Data Analyst");
        System.out.println(employees);
        employees.removeIf( p-> p.salary > 100000);
        System.out.println(employees);
        for (Employee each : employees) {
            System.out.println(each.name+ " : "+ each.salary);
        }
    }
}
