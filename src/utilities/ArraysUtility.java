package utilities;

import java.util.Arrays;

public class ArraysUtility {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }


    public static double[] merge(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }


    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = numbers[i];
        }
        return reversed;
    }

    public static double[] reverse(double[] numbers) {

        double[] reversed = new double[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        return reversed;
    }

    public static char[] reverse(char[] numbers) {

        char[] reversed = new char[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        return reversed;
    }

    public static String[] reverse(String[] numbers) {

        String[] reversed = new String[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        return reversed;
    }

    public static int[] addElement(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static double[] addElement(double[] array, double element) {
        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }
    public static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }
    public static boolean[] addElement(boolean[] array, boolean element) {
        boolean[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static boolean contains(int[]array, int element){
        for (int each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(double[]array, double element){
        for (double each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(char[]array, char element){
        for (char each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(String[]array, String element){
        for (String each : array) {
            if(each.equals(element)){
                return true;
            }
        }
        return false;
    }

    public static int[] remove(int[] array, int index){
        int[] newArray = new int[array.length-1];
        int k=0;
        for (int i = 0; i <= array.length-1; i++, k++) {
            if((i!=2) && (i!=array.length-1)){
                newArray[k]=array[i];
            }
            if(i==array.length-1){
                newArray[k-1]=array[i];}
        }
return newArray;


    }
}



