package day42_maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="bbcccaaaa";
        Map<String, Integer> map= new LinkedHashMap<>();
        for (String each : str.split("")) {
            int frequency= Collections.frequency(Arrays.asList(str.split("")), each);

            map.put(each,frequency);

        } System.out.println(map);
    }
}
