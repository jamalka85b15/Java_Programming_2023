package day16_doWhileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "";
        do {                                           //if yes repeat this
            System.out.println("Enter your first number");
            double number1 = input.nextDouble();
            System.out.println("Enter your math operator ");
            char operator = input.next().charAt(0);
            System.out.println("Enter your second number");
            double number2 = input.nextDouble();

            if((operator=='+' || operator=='-' || operator== '/' || operator== '*')){
                if (operator == '+') {
                    System.out.println(number1 + number2);
                } else if (operator == '-') {
                    System.out.println(number1 - number2);
                } else if (operator == '/') {
                    System.out.println(number1 / number2);
                }else {
                    System.out.println(number1 * number2);
                }

            }else {

                System.err.println("Invalid math operator, try again");
                System.out.println("Enter your first number");
                number1 = input.nextDouble();
                System.out.println("Enter your math operator ");
                operator = input.next().charAt(0);
                System.out.println("Enter your second number");
                number2 = input.nextDouble();
            }
            System.out.println("Would you like to continue? Yes/No");
             answer = input.next().toLowerCase();

        }while (answer.equals("yes"));
    }
}
