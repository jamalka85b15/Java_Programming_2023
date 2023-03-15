package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int sum=0;
        for (int i = 1; i < 11 ; i++) {
            System.out.println("Enter your number");
            sum +=input.nextInt();
        }
        System.out.println("Your sum is: "+sum);
    }

}
