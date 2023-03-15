package day21_multidementianal;

import java.util.Arrays;

public class MultiDemPractice {

    public static void main(String[] args) {

        String[] group1 ={"Jama", "Mark", "Sutan","Damal"};
        String[] group2 ={"Yvette", "Jane", "Jullie"};
        String[] group3 ={"Rita", "Rimma", "Bella","Vanessa", "Alex"};
        String[] group4 ={"Dave", "Jake"};

        String[][] groupOfStudents ={{"Jama","Mark","Sutan","Damal"}, {"Yvette","Jane","Jullie"}
                , {"Rita","Rimma","Bella","Vanessa","Alex"}, {"Dave", "Jake"} };

        for (String[] eachGroup : groupOfStudents) {
            System.out.println("Each Group "+Arrays.toString(eachGroup));
            for (String eachStudent: eachGroup) {
                System.out.println("Each student "+eachStudent);
            }
        }
        System.out.println("-----------------");
        for (int i = groupOfStudents.length-1; i >=0 ; i--) {
            System.out.println(Arrays.toString(groupOfStudents[i]));
            for (String eachStudent: groupOfStudents[i]) {
                System.out.println(eachStudent);
            }
        }
    }
}
