package day09_scanner;
import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  //created object for reading user inputs
      /* System.out.println("Enter your number:");
       byte num1= input.nextByte();
        System.out.println("you entered: "+num1);
        System.out.println("Whats your name?");
        String name = input.next();
        System.out.println("Welcome "+ name);
        */

        System.out.println("Tell me about yourself");
        String bio = input.nextLine();
        System.out.println(bio);


        input.close(); //Scanner is closed and cannot read inputs it again
    }

}
