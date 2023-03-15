package day40_queue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("Jama", "Mark","jAma","racecar", "madam","Sultan","Car", "civic","Level" ));
        System.out.println(names);
        Iterator<String> it=names.iterator(); //Iterate list of String

        while (it.hasNext()){      //if this returns true that has next element
            String each=it.next();    //will get element

            String reverse="";
            for (int i = each.length()-1; i >=0 ; i--) {  //another look to reverse from last index to index 0
                reverse+=each.charAt(i);                  //than adding each character to reverse string

            }
            if(each.equalsIgnoreCase(reverse)){           //if each element is equal to reverse
                it.remove();                              //than remove that from list
            }
        }
        System.out.println(names);
        System.out.println("-------------------------");

        List<String> names2 =new ArrayList<>();
        names2.addAll(Arrays.asList("Jama", "Mark","jAma","racecar", "madam","Sultan","Car", "civic","Level"));
        System.out.println("Names2 before: "+names2);
        names2.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));
        System.out.println("Names2 after: "+names2);
    }
}
