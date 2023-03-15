package day11_string2;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your username");
        String username =input.next();
        System.out.println("Enter your password");
        String password =input.next();
        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You are logged in");
        }else{
            System.err.println("Username is invalid");
        }
    }

}
