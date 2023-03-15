package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch =input.next().charAt(0);
        System.out.println("Would you like to continue?");
        String answer = input.next();
        System.out.println(answer);
    }


}
