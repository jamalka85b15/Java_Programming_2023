package day11_string2;

import java.util.Scanner;

public class CombineWord {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first word");
        String first = input.next();
        System.out.println("Enter your second word");
        String second = input.next();
        String lastLetter = first.substring(first.length()-1);
        boolean isSame = second.startsWith(lastLetter);
        if(isSame==true){
            String first2=first.substring(0,first.length()-1);
            System.out.println(first2+second);
        }else{
            System.out.println(first+second);
        }

        //one
        // boolean firstAndLast = first.startsWith(first.equals(second.endsWith()));

        /*
 Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight

         */
    }

}
