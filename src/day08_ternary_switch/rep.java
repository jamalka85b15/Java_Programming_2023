package day08_ternary_switch;

import java.util.Scanner;

public class rep {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item=input.nextLine();
        int total =100;
        if(item.equals("Blanket") || item.equals("Charger") || item.equals("Hat")
                || item.equals("Headphones") || item.equals("Pants") || item.equals("Pillow")
                || item.equals("Socks") || item.equals("USB cable") || item.equals("Laptop")
                || item.equals("Smartphone"))
            switch(item) {
                case "Blanket":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+ (total-60)+"$");
                    break;
                case "Charger":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+ (total-5)+"$");
                    break;
                case "Hat":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+ (total-25)+"$");
                    break;
                case "Headphones":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+ (total-30)+"$");
                    break;
                case "Pants":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+ (total-50)+"$");
                    break;
                case "Pillow":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+ (total-40)+"$");
                    break;
                case "Socks":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+ (total-5)+"$");
                    break;
                case "USB cable":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+ (total-10)+"$");
                    break;
                case "Laptop":
                    System.out.println("Sorry, not enough funds on your gift card");
                    break;
                case "Smartphone":
                    System.out.println("Sorry, not enough funds on your gift card");
                    break;
        }
    else{
                    System.out.println("Sorry, that is an invalid item");
            }
    }
}




