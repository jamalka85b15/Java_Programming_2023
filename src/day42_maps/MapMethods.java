package day42_maps;

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
        map.put("B4", "Lee");
        Map<String, String> employees=new LinkedHashMap<>();
        employees.putAll(map);
        System.out.println(employees);





            }
        }





