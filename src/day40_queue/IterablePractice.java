package day40_queue;

import java.util.*;

public class IterablePractice {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Jama", "Mark","jAma", "Sultan", "Damal","JAMA", "Danur","jama", "Sophia"));
        System.out.println(names);
        Iterator<String> it=names.iterator();
   while (it.hasNext()){
      String each =it.next();
      if(each.equalsIgnoreCase("jama")){
           it.remove();
       }
   }
        System.out.println(names);

        System.out.println("----------------------------------");
        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Jama", "Mark","jAma", "Sultan", "Damal","JAMA", "Danur","jama", "Sophia"));
    names2.removeIf(p-> p.equalsIgnoreCase("jama"));
        System.out.println(names2);
        System.out.println("---------------------");
        List<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));
        int n= 5;
        //int max=0;

        for (int i = 0; i <n-1 ; i++) {
            numbers.removeIf(p-> Collections.max(numbers)==p);
        }
        int max =Collections.max(numbers);
        System.out.println(max);

        }
    }

