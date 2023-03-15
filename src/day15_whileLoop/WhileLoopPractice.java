package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();

        while (! (age >=1 && age <=150)){ //while age invalid will keep asking
            System.out.println("Please re-enter your age");
            age=input.nextInt();
        }

        if (age <21 ){
            System.out.println("Not eligible");
        }else{
            System.out.println("Eligible");
        }
        input.close();
    }


}
