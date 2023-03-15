package day16_doWhileLoop;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {

        for (int i = 1; i <6 ; i++) {
            System.out.println("Hello "+i);
        }
        int i=0;
        while (i < 5){
            System.out.println("Hello while loop");
            i++;
        }
        int j= 0;
        do {
            System.out.println("Hello Do Loop");
            j++;
        }while (j < 5);

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score");
        int score=input.nextInt();

        while (score>100 || score <0){
            System.out.println("Invalid, re enter");
            score=input.nextInt();
        }
        if(score >=60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}
