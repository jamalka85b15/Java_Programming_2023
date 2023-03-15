package day41_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Object> map=new LinkedHashMap<>();
        map.put("Name", "Jama");
        map.put("Gender", 'F');
        map.put("Age", 37);
        map.put("Job_Title", "SDET");
        map.put("Salary", 160000);
        map.put("Married", true);
        System.out.println(map);
        System.out.println(map.get("Name"));



    }
}
