package day15_whileLoop;

import java.util.Scanner;

public class Purposal {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer =input.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer, try again");
            answer=input.nextLine().toLowerCase();
        }
        if( answer.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }


    }
}
