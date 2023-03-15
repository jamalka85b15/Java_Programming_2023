package day21_multidementianal;

import java.util.Arrays;

public class IteratingMultiDemensianalArray {

    public static void main(String[] args) {
 int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}};

        for (int i = 0; i <arr2D.length ; i++) {  // i is index of 1D array
            System.out.println(Arrays.toString(arr2D[i]));
            for (int each :   arr2D[i]) {
                System.out.println("Each "+each);
            }
        }

    }
}
