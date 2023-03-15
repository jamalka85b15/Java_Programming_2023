package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemovePersonAge55 {
    public static void main(String[] args) {
        Person[] people= {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2, 25));
        people[1].setInfo("Jama", 'F', LocalDate.of(1985,7, 30));
        people[2].setInfo("Burul", 'F', LocalDate.of(1954,4, 21));
        people[3].setInfo("Tuke", 'M', LocalDate.of(1955,1, 18));
        people[4].setInfo("Mark", 'M', LocalDate.of(1982,5, 7));
        System.out.println(Arrays.toString(people));

        ArrayList<Person> list =new ArrayList<>();
        list.addAll(Arrays.asList(people));
        System.out.println(list);
        list.removeIf( p -> p.age > 55);
        System.out.println(list);
        for (Person each : list) {
            System.out.println(each.name+ " : "+ each.age);

        }

        }

    }

