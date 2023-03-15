package day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter your number");
        int number =input.nextInt();
        while (!(number < 0)){
            number=input.nextInt();
        if(number>0){
            sum+=number;
        }
            System.out.println(sum);
        }


    }
}
