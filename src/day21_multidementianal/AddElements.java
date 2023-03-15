package day21_multidementianal;

import utilities.ArraysUtility;

import java.sql.SQLOutput;
import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
        int element =6;
        //int[] newArray =new int[array.length+1]; size of new array
       int[] newArray= Arrays.copyOf(array, array.length+1); // first array copy of--> next is size of new array
        newArray[newArray.length-1]= element; // here index of last char equal to element
        System.out.println(Arrays.toString(newArray));
        System.out.println("--------------");

        int[]numbers = {10,20,30,40};
        numbers= ArraysUtility.addElement(numbers, 70);
        System.out.println(Arrays.toString(numbers));

      double[] numbers1 = {10.5,20.5,30.5,40.5};
        numbers1= ArraysUtility.addElement(numbers1, 70.5);
        System.out.println(Arrays.toString(numbers1));

        String[] arr = {"Jama", "Mark", "Sultan", "Sophia"};
        arr=ArraysUtility.addElement(arr,"Sarah");
        System.out.println(Arrays.toString(arr));
    }
}
