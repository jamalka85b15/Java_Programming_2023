package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class CollectionesUtility {
    public static void main(String[] args) {


        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(9,1,5,3,4,2,6,7,8,11,15));
        int max =Collections.max(list);
        int min= Collections.min(list);
        System.out.println(max);
        System.out.println(min);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.swap(list, 0,list.size()-2);
        System.out.println(list);

    }
        }
