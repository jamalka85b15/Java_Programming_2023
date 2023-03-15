package day15_whileLoop;

import java.util.Scanner;

public class MaxaAndMinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp = 0;
        int max=-2147483648 ;
        int min = 2147483647;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter your number");
            temp = input.nextInt();

            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }

            System.out.println("your Max is: "+ max);
            System.out.println("your Min is: "+ min);

    }
}
