package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp = 0;
        int min = 2147483647;                 //max value for int
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter your number: ");
            temp = input.nextInt();          // temp holding value of entered number

            if (temp < min ) {
                min=temp;
            }
        }
        System.out.println("Your min number " + min);
    }
}
