package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeva");
        names.add("Sumeva");
        names.add("Ali");
        names.add("Sumeva");

        ArrayList<String> nonDupe=new ArrayList<>();
        for (String each : names) {
            if (nonDupe.contains(each)){
                continue;
            }
            nonDupe.add(each);
        }
         names=nonDupe;
        System.out.println(names);
        System.out.println(nonDupe);

        System.out.println("------------------");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 =list1;
        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l1.add(10);
        System.out.println(l1==l2); // false because not same abject
        System.out.println(l1.equals(l2)); // true because has same element

    }
}
