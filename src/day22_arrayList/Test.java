package day22_arrayList;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers ={ 1,5,9,15,25,100};
       int[] num2=ArraysUtility.remove(numbers,3);
        System.out.println(Arrays.toString(num2));

        int[] array ={ 10,20,30,40};
        int[] newArray=ArraysUtility.remove(array,1);
        System.out.println(Arrays.toString(newArray));


    }
}
