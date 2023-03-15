package day11_string2;

import java.util.Scanner;

public class StartWithX {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your word");
        String word =input.nextLine();
        if(word.startsWith("x")){
            word=word.replaceFirst("x", "a");
            System.out.println(word);
        }
/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */

    }
}
