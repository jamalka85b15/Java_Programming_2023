package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array ={1,2,3,4,5};
        array[0] =100;
        System.out.println(Arrays.toString(array));

        ArrayList<String> groceryList= new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Oil");
        groceryList.add("Flour");
        System.out.println(groceryList);

        groceryList.set(3, "Sugar");
        System.out.println(groceryList);
        System.out.println("---------------------");
        ArrayList<Integer> num =new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(20);
        System.out.println(num);
        num.remove(Integer.valueOf(20));
        System.out.println(num);
        num.clear();
        System.out.println(num);
        System.out.println("----------------");
        ArrayList<String> names= new ArrayList<>();
        names.add("Ali");
        names.add("Ali");
        names.add("Olya");
        names.add("Sasha");
        names.add("Ali");
        names.add("Mark");
        names.add("Mark");
        System.out.println(names.indexOf("Sasha"));
        System.out.println(names.indexOf("Ali"));
        System.out.println(names.lastIndexOf("Ali"));



    }
}
