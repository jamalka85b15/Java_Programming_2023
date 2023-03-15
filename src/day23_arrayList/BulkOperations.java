package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        ArrayList<Integer> num  =new ArrayList<>();
        num.add(50);
        num.add(60);
        num.add(70);

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.addAll(num);
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);
        System.out.println("------------------");

        ArrayList<Integer> scores =new ArrayList<>();
        scores.addAll(Arrays.asList(70,80,75,90,85));
        System.out.println(scores);
        ArrayList<Integer> num3 =new ArrayList<>();
        num3.addAll(Arrays.asList(10,10,10,20,20,30,40,50,10,20,10));
        System.out.println(num3);
        num3.removeAll(Arrays.asList(10,20));
        System.out.println(num3);


    }
}
