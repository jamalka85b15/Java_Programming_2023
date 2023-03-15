package day09_scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your full name");
        String fullName = input.nextLine();

        System.out.println("Schol name?");
        String schoolName = input.nextLine();

        System.out.println("Your gender");
        String gender= input.next();

        System.out.println("your age");
        int age =input.nextInt();

        input.nextLine(); // Must provide extra nextLine only if nextLine used after other next methods

        System.out.println("Street name");
        String streetName=input.nextLine();



        System.out.println(fullName);
        System.out.println(schoolName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(streetName);
    }

}
