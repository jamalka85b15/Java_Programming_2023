package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();
        map.put("A001", "Aaron");
        map.put("A002", "Max");
        map.put("A003", "Tim");
        map.put("A004", "Olya");
        map.put("A005", "Kim");
        System.out.println(map.size());
        System.out.println(map);
        map.put("A004", "Lucy");
        System.out.println(map);
        map.remove("A005");
        System.out.println(map);

        /*size(); --->returns total number of pairs
          put(); ---->add or update a value
          remove(); ----> delete key and value
          replace(); ---> update
          et(); ----> returns the value of the specific key
          containsKey(); ---> returns boolean to verify if map contains key
          containsValue(); ---> returns boolean to verify if map contains Value
          equals(); --->compare for same pairs
           clear(); ---->to clear map}
         */
}}
