package day15_whileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=input.nextLine();
        System.out.println("Enter a char");
        char ch =input.next().charAt(0);
int count=0;
        for (int i = 0; i <str.length() ; i++) {
            char chr2 =str.charAt(i);
            if(chr2==ch){
               count ++;
            }
        }
        System.out.println(count);

    }
}
