package day09_scanner;

import java.util.Scanner;

public class NextLineVsNext {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("What is your age?");
        int age =input.nextInt();
        input.nextLine();
        System.out.println("Whats is your full name?");
        String fullName =input.nextLine();
        System.out.println("Your age is: "+age);
        System.out.println("your name is: "+fullName);
    }

}
