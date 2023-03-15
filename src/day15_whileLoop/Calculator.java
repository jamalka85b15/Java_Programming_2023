package day15_whileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 =input.nextDouble();
        System.out.println("Enter second number");
        double num2 =input.nextDouble();
        System.out.println("Enter your calculator character");
        char ch =input.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch== '*' || ch== '/')){
            System.out.println("Invalid operator, re enter");
            ch=input.next().charAt(0);
        }
        if (ch == '+'){
            System.out.println(num1+num2);
        }else if (ch =='-'){
            System.out.println(num1-num2);
        } else if (ch=='*') {
            System.out.println(num1*num2);
        }else {
            System.out.println(num1/num2);
        }


    }
}
