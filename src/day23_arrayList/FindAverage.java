package day23_arrayList;

import java.util.ArrayList;

public class FindAverage {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        double average =0;
        int sum=0;
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        System.out.println(num);
        System.out.println("---------------");
        for (int i = 0; i <num.size() ; i++) {
            sum+=num.get(i);
             average =sum/num.size();


        }
        System.out.println(sum);
        System.out.println("average = " + average);
    }
}
