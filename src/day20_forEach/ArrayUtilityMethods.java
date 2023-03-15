package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score ={ 65,70,85,90};
        int[] score2 ={ 65,70,85,90};
        System.out.println(Arrays.toString(score));
        System.out.println(score.equals(85));
        boolean b1=Arrays.equals(score,score2);
        System.out.println(b1);

    }
}
