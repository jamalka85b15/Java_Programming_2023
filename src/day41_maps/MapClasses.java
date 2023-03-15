package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {


        Map<String, Integer> map=new HashMap<>();
        map.put(null, null);
        map.put("Jama", 15000);
        map.put("Olya", 95000);
        map.put("Tim", 10000);
        map.put("Tim", 10000);
        System.out.println(map);
        Map<String, Integer> map2=new LinkedHashMap<>();
        map2.put(null, null);
        map2.put("Jama", 15000);
        map2.put("Olya", 95000);
        map2.put("Olya", 95000);
        map2.put("Tim", 10000);
        System.out.println(map2);
        Map<String ,Integer> map3=new Hashtable<>();
        map3.put("Max", 150200);
        map3.put("Jama", 15000);
        map3.put("Jama", 15000);
        map3.put("Olya", 95000);
        map3.put("Tim", 10000);
        System.out.println(map3);
        Map<String, Integer> map4= new TreeMap<>();
        map4.put("Mark", 25000);
        map4.put("Mark", 25000);
        map4.put("Max", null);
        map4.put("Olya", 95000);
        map4.put("Tim", 10000);
        System.out.println(map4);


    }
}
