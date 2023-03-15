package day15_whileLoop;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int positive =0;
        int negative =0;
        for (int i = 0; i <=5 ; i++) {
            System.out.println("Enter number:");
            int num =input.nextInt();
            if(num >=1){
                positive++;
            }else if (num < 0){
                negative++;
            }

        }
        System.out.println(positive+ " positive and "+ negative+ " negative");
    }

}
