package day20_forEach;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] numbers ={80,20,30,40,50};
        for (int each : numbers){
            System.out.println(each);
            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));
        }
    }

}
