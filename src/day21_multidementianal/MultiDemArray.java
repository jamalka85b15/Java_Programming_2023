package day21_multidementianal;

import java.util.Arrays;

public class MultiDemArray {

    public static void main(String[] args) {
        int[][] num1= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] num2= {{10,20,30},{40,50,60},{70,80,90}};
        int[][] num3={{15,16,17}};

        int[][][] num3D={{{1,2,3},{4,5,6},{7,8,9}}, {{10,20,30},{40,50,60},{70,80,90}}, {{15,16,17}}};
        System.out.println(Arrays.deepToString(num3D));
        System.out.println(Arrays.deepToString(num3D[1]));
        System.out.println((num3D[1][1][2]));

        System.out.println( "--------------------------");

        for (int i = 0; i <num3D.length ; i++) {
            int[][] each2DArray = num3D[i];
           System.out.println("2D "+Arrays.deepToString(each2DArray));
            System.out.println("__________________________");
            for (int j = 0; j <each2DArray.length ; j++) {
                int [] each1DArray = each2DArray[j];
                System.out.println("1D "+Arrays.toString(each1DArray));
                System.out.println("_----------------------");
                for (int k = 0; k <each1DArray.length ; k++) {
                    int eachElement =each1DArray[k];
                    System.out.println("Each element "+eachElement);
                }
            }
        }


    }
}
