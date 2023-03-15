package day09_scanner;

import java.util.Scanner;

public class DaysAndWeek {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);  //if you going to use scanner only once then no need to create object
        System.out.println("Enter the day number: ");
        int num = input.nextByte();
        String day = "Invalid";
        if(num >=1 && num <= 7){
            day = (num ==1)? "Monday" : (num ==2)? "Tuesday" : (num ==3)? "Wednesday" : (num ==4)? "Thursday" :
                    (num ==5)? "Friday" : (num ==6)? "Satirday" : "Sunday";
        }
        System.out.println(day);


    }

}
