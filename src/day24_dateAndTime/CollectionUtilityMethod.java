package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","C#","C#","Ruby","Swift","Swift","Java"));
        System.out.println(names);
        Collections.replaceAll(names, "Java", "Python");
        System.out.println(names);
        System.out.println("-----------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,50,50,60,70,50,80,60,50));
        int countJava =Collections.frequency(list,50);
        System.out.println(countJava);

        for (Integer each : list) {
            if(Collections.frequency(list, each) ==1){
                System.out.println("Each "+each);
            }
        }


    }
}
