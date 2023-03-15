package day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number:");
        int num = input.nextByte();
        if (num % 2 == 0) {
            System.out.println("your number is even");
        }else{
            System.out.println("your number is odd");
        }
    }


}
