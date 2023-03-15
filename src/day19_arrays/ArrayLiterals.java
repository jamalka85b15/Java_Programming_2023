package day19_arrays;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] num = new int[5]; // default value
        //line 7 and 8 are equal
        int[] num2 ={5,9,5,3,6}; // exact value
        System.out.println(num.length);
        System.out.println(num2.length);
        System.out.println("Num = "+ Arrays.toString(num));
        System.out.println("Num2 = "+Arrays.toString(num2));

        String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int n =1;
        System.out.println(days[n-1]); // Monday

        System.out.println("-------------------");

        String[] months ={"Jan", "Feb", "Mar", "Apr","May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(Arrays.toString(months));
        int element =8;
        System.out.println(months[element-1]);

    }
}
