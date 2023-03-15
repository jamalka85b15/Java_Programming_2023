package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(80);
        System.out.println("--------------------");
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jama");
        studentList.add("MArk");
        studentList.add("Sophia");
        studentList.add("Sultan");
        System.out.println(studentList);
        System.out.println(studentList.get(2));

        for (int i = 0; i <studentList.size() ; i++) {
            System.out.println(studentList.get(i));
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }



    }
}
