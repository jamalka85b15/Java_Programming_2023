package day19_arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int[] scores= new int[5];
        scores [0]= 78;
        scores [1]= 54;
        scores [2]= 60;
        scores [3]= 54;
        scores [4]= 10;
        scores [2]= 65; // to change value have to reassign
        System.out.println(Arrays.toString(scores));
       // System.out.println(scores[2]);

        for (int i = 0; i <scores.length ; i++) {
            System.out.println(scores[i]);

        }
        System.out.println("----------------------------");

        System.out.println(scores[scores.length-1]); // last element

    }


}
