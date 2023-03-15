package day16_doWhileLoop;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "yes";

        while (answer.equals("yes")) {//if yes repeat this
            System.out.println("Enter your first number");
            double number1 = input.nextDouble();
            System.out.println("Enter your math operator ");
            char operator = input.next().charAt(0);
            while (!(operator == '+' || operator == '-' || operator == '/' || operator == '*')) {
                System.err.println("Invalid math operator, try again");
                operator = input.next().charAt(0);
            }
            System.out.println("Enter your second number");
            double number2 = input.nextDouble();
            double result = (operator == '+') ? number1 + number2 : (operator == '-') ? number1 - number2
                    : (operator == '/') ? number1 / number2 : number1 * number2;
            System.out.println("Resul: " + result);
            System.out.println("Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid answer, would you like to continue");
                answer = input.next().toLowerCase();
            }
        }
    }
}
