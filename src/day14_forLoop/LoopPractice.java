package day14_forLoop;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String star = "* * * * * *";
        for (int i = 1; i <= 8; i++) {
            System.out.println(star);
        }

        /*
Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
output:    1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
         */
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.print("FINRA ");
            } else if (j % 3 == 0) {
                System.out.print("FIN ");
            } else if (j % 5 == 0) {
                System.out.print("RA ");
            }
            System.out.print(j + " ");
        }
        System.out.println();

/*
        write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
        input: 100
        output: 5050
        input: 50
        output: 1275


        int sum = 0;
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("Enter your number");
        int num1 =input.nextInt();
        int factorial=1;
        for (int i = num1; i >=1; i--) {
            factorial*=i;

        }
        System.out.println(factorial);
        */


        System.out.println("-----------------------");

        String str = "mn@#123Ab!";


        String numbers = "";
        String letters = "";
        String characters = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            char chr = str.charAt(i);
            if (chr >= 65 && chr <= 90 || chr >= 97 && chr <= 122) {
                letters += chr;
            } else if (chr >= 48 && chr <= 57) {
                numbers += chr;
            }else{
                characters+=chr;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Characters: "+characters);
        System.out.println("------------------------");

        /*String str2= "A1B2C3";
        String chr3="";
        char chr2;
        for (int i = 0; i <str2.length()-1 ; i++) {
          chr2 =str2.charAt(i);
            System.out.println(chr2);
            if(chr2 >= 48 && chr2 <= 57){
                chr3 +=chr2;
                for (int j = 0; j < chr3.length()-1; j++) {
                    int sum =chr3.charAt(j)+chr3.charAt(j);
                    System.out.println("Sum: "+sum);*/





        }
    }










