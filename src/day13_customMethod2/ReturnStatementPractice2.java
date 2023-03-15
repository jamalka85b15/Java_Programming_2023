package day13_customMethod2;

import java.util.Scanner;

public class ReturnStatementPractice2 {

    public static void main(String[] args) {

        int number =new Scanner(System.in).nextInt();
        if(number < 1 || number > 7){
            System.out.println("Invalid number " + number);
            return; //exit main method
        }
        switch (number){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
        }

    }

}
