package day10_string;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your building number");
        String buildingNumber =input.next();
        input.nextLine();
        System.out.println("Enter your street name");
        String streetName = input.nextLine();
        System.out.println("Enter your city name");
        String cityName = input.nextLine();
        System.out.println("Enter your zip number");
        String zipNumber = input.next();

        System.out.println("Your shipping addres is: ");
        System.out.println("\t "+ fullName);
        System.out.println("\t "+ zipNumber + " "+ streetName);
        System.out.println("\t "+ cityName+ " "+ zipNumber);
    }


}
