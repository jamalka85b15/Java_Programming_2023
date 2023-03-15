package day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {
        int score = 95;

        if (score >= 0 && score <= 100) {   //if the score is valid
            if (score >= 60) {            //if score is greater or equal to 60
                System.out.println("Passed");
            } else {                      //if score is less than 60
                System.out.println("Failed");
            }
        } else {                          //if score invalid
            System.out.println("Invalid score");
        }


        System.out.println("----------------------------------------");


        int age = -200;
        if (age >= 1 && age <= 120) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        } else {
            System.out.println("Invalid age");
        }

        System.out.println("------------------------------------");

        int day = 0;
        String dayName = "";
        if (day >= 1 && day <= 7) {
            if (day == 1) {
                dayName = "Monday";
            } else if (day == 2) {
                dayName = "Tuesday";
            } else if (day == 3) {
                dayName = "Wednesday";
            } else if (day == 4) {
                dayName = "Thursday";
            } else if (day == 5) {
                dayName = "Friday";
            } else if (day == 6) {
                dayName = "Saturday";
            } else {
                dayName = "Sunday";
            }

        } else {
            System.out.println("Invalid day");
        }
        System.out.println(dayName);

    }}
