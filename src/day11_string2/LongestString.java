package day11_string2;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter your first String");
        String st1 =input.nextLine();
                System.out.println("enter your second String");
                String st2 = input.nextLine();
        if (st1.length()> st2.length()){
            System.out.println("First String longer");
        }else if(st1.length()<st2.length()){
            System.out.println("Second String longer");
        }else {
            System.out.println("Equal");
        };
        }
    }


