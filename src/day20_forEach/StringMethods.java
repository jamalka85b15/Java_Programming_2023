package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str ="Jama Hall";
        char[] str2 =str.replace(" ", "").toCharArray();
        System.out.println(Arrays.toString(str2));
        System.out.println("----------------");

        String str3 = "Today is a great day";
        String[] str4 =str3.split(" ");
        System.out.println(Arrays.toString(str4));
        String[] str5=ArraysUtility.reverse(str4);
        System.out.println(Arrays.toString(str5));

    }
}
