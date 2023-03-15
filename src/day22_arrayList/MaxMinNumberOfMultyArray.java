package day22_arrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxMinNumberOfMultyArray {
    public static void main(String[] args) {
        int[][] array = {{100,20,300}, {10,1000,50}, {-200,400,0}};
        int max =array[0][0];
        int min =array[0][0];

        for (int[] each1Darray : array) {
            for (int eachElement : each1Darray) {
                if(eachElement > max){
                    max=eachElement;
                }
                if(eachElement < min){
                    min=eachElement;
                }
            }
        }
        System.out.println("Max number is: "+ max);
        System.out.println("Min number is: "+ min);

    }
}
