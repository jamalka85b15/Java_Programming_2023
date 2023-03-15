package day40_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PalindromeRemove {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("ama","ark","jAma","racecar","madam","Sultan","Car", "civic","Level","Kayak"));
        System.out.println("Before removal : "+names);

        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext()){
            String each=iterator.next();

            String reverse="";
        for (int i = each.length()-1; i >=0 ; i--) {
            reverse+=each.charAt(i);
        }
            if(each.equalsIgnoreCase(reverse)){
                iterator.remove();
            }
        }
        System.out.println("After removal "+names);
    }
}
