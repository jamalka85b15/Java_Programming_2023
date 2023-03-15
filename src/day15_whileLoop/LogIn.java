package day15_whileLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctLogin = "Cydeo";
        String correctPsw = "Cydeo123";


        System.out.println("Username");
        String login = input.next();
        System.out.println("Password");
        String psw = input.next();
        if (login.equals(correctLogin) && psw.equals(correctPsw)) { //Happy path
            System.out.println("Logged in");

        } else {
            for (int i = 0; i < 3; i++) {    //will try 3 times
                if(i!=2){                     //when less than 2 attepmt getting message
                    System.err.println("Incorrect, Try again");
                }else{                         // on 3rd attepmt last mmessage
                    System.err.println("Last attempt");
                }

                System.out.println("Username");
                login = input.next();
                System.out.println("Password");
                psw = input.next();
                if (login.equals(correctLogin) && psw.equals(correctPsw)) { //Happy path if you re enteerd correct during 3 times try
                    System.out.println("Logged in");
                    break;

                }


            }
            if (!(login.equals(correctLogin) && psw.equals(correctPsw))) { //locked if all 3 times entered wrong
                System.out.println("You are locked");
            }

        }
    }
}

