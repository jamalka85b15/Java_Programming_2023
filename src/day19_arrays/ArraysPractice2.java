package day19_arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {
        int[] numbers =new int[100];
        int[] numbers2 =new int[100];


            for (int i = 0, j=1; i < numbers.length; i++,j++) {
               numbers[i]=j;
            }
            System.out.println("numbers = "+ Arrays.toString(numbers));

        System.out.println("----------------------------------");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;
        }
        System.out.println("numbers = "+ Arrays.toString(numbers));

        System.out.println("=========================================");
        for (int i= 0, j=100;  i< numbers2.length; i++, j--) {
            numbers2[i] = j;
        }
        System.out.println(Arrays.toString(numbers2));
        }




    }
