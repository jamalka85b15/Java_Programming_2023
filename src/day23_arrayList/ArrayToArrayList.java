package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
}
