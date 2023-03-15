package day39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 =new LinkedHashSet<>();
        Set<Integer> set3=new TreeSet<>();
        set1.addAll(Arrays.asList(10,200,45,90,10));
        System.out.println(set1);
        Set<String> str=new HashSet<>();
        str.addAll(Arrays.asList("Jama", "MArk", "Tim", "Jama", "Mark"));
        System.out.println(str);
        set3.addAll(Arrays.asList(10,50,60,50,70,20,55));
        System.out.println(set3);
        set2.addAll(Arrays.asList(10,50,60,50,70,20,55));
        System.out.println(set2);

        String[] words ={ "Java", "Python", "C++", "Java", "Python", "C++", "Ruby"};
        System.out.println(Arrays.toString(words));
        LinkedHashSet<String> str2 = new LinkedHashSet<>();
        HashSet<String> hash =new HashSet<>();
        hash.addAll(Arrays.asList(words));
        str2.addAll(Arrays.asList(words));
        System.out.println(str2);
        System.out.println(hash);
        System.out.println(new ArrayList<>(str2).get(1));
        ArrayList<String> arr= new ArrayList<>(hash);


    }
}
