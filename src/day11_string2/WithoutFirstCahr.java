package day11_string2;

import java.util.Scanner;

public class WithoutFirstCahr {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first word");
        String first = input.next();
        System.out.println("Enter your second word");
        String second = input.next();
        first=first.substring(1);
        second=second.substring(1);
        System.out.println(first+second);

        }
    }


