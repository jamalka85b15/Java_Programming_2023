package day11_string2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TripCalculator {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Split or not split");
        String splitOrNot =input.next();

        System.out.println("Enter the number of people");
        int numberOfPeople=input.nextInt();

        System.out.println("Enter the check amount ");
        int checkAmount =input.nextInt();
        input.nextLine();

        System.out.println("Service quality");
        String serviceQuality =input.nextLine();
        double tipValue = 0;
        switch (serviceQuality) {
            case "Poor":
                tipValue = 0.05;
                break;
            case "Fair":
                tipValue = .10;
                break;
            case "Good":
                tipValue = .15;
                break;
            case "Great":
                tipValue = .20;
                break;
            case "Excellent":
                tipValue = .25;
                break;
        }
        double totalPerPerson =((checkAmount*tipValue)+checkAmount)/numberOfPeople;
        double totalToPay =(checkAmount*tipValue)+checkAmount;
        double totalTip =checkAmount*tipValue;
        double tipPerPerson =totalTip/numberOfPeople;

        if(splitOrNot.equalsIgnoreCase("yes")){
            System.out.println("Number of people: "+ numberOfPeople);
            System.out.println("Total to pay: "+totalToPay);
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person "+totalPerPerson);
            System.out.println("Tip per person "+tipPerPerson);
        }else{
            System.out.println("Number of people: "+ numberOfPeople);
            System.out.println("Total to pay: "+totalToPay);
            System.out.println("Total tip: "+totalTip);
        }

    }

}
