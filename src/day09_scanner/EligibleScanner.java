package day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EligibleScanner {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String result ="";
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age >= 21 && age <= 100){
            System.out.println("Eligible to buy");
        }else {
            System.out.println("Not eligible");
        }
    }

}
