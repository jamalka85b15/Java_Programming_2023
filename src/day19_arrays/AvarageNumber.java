package day19_arrays;

import java.util.Scanner;

public class AvarageNumber {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("How many numbers you want to enter?");
        int total =input.nextInt();
        int[] numbers = new int[total];
        for (int i = 0; i <total ; i++) {
            System.out.println("Enter a number");
            numbers[i]=input.nextInt();
        }
    }
}
