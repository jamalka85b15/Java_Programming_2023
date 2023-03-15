package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp = 0;
        int max=-2147483648 ;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter your number");
            temp = input.nextInt();                    // temp holding entered value

            if (temp>max)                              //if temp larger than max
                 max=temp;                              //setting max with temp value
        }

        System.out.println("your Max is: "+ max);
    }

}







