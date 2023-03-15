package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;
public class MergeToArray {

    public static void main(String[] args) {

        int[] arr1 ={1,2,3,4};
        int[] arr2 ={5,6,7};
        int[] arr3 =new int[arr1.length+arr2.length];
        int k=0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("-------------------------");


        int[] a1 ={10,20,30,40};
        int[] a2 ={50,60,70};
        int[] a3 =ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));


        System.out.println("-----------------------");

        double[]d1 ={20.5,30.5,50.5};
        double[]d2 ={21.5,31.5,51.5};
        double[]d3=ArraysUtility.merge(d1,d2);
        System.out.println(Arrays.toString(d3));

        System.out.println("---------------");

        String[] str1 ={"Mama", "Papa", "Sultan"};
        String[] str2 ={"Damal", "Danur", "Sophia"};
        String[] str3 =ArraysUtility.merge(str1, str2);
        System.out.println(Arrays.toString(str3));


        int[] num1 ={50,40,30,20,10};
        int[] reversed =ArraysUtility.reverse(num1);
        System.out.println(Arrays.toString(reversed));


    }
}
