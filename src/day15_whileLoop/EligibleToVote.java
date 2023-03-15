package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your age");
        int age =input.nextInt();

        while (!(age >= 1 && age <= 120)){
            System.out.println("Re enter valid age");
            age=input.nextInt();


        }
        System.out.println("Are you US citizen?");
        String isCitizen =input.next().toLowerCase();

        while (!(isCitizen.equals("yes")) || isCitizen.equals("no")){
            System.out.println("Invalid answer, re enter");
            System.out.println("Are you US citizen?");
            isCitizen=input.next().toLowerCase();
        }

        if (age >= 21 && isCitizen.equals("yes") ){
            System.out.println("Eligible");
        }else  {
            System.out.println("Not eligible");
        }
    }

}
