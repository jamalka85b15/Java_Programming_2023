package day38_exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
            if (age < 0) {
                throw new InputMismatchException("Age of the person cannot be negative " + age);
            } else {
                throw new InputMismatchException("Age of the person cannot be higher than 150  " + age);
                //Above throw keyword does same funstionality from below code
                // System.err.println("Invalid age");
                // System.exit(1);
            }
        }
        if (age >=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }
}

