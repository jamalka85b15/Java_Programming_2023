package day39_collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
//arrayList.get(0);
arrayList.add(25);
arrayList.add(15);
arrayList.add(21);
        System.out.println("Before "+arrayList);
arrayList.remove(1);

        System.out.println("After "+arrayList);
        LinkedList<Integer> linkedList=new LinkedList<>();
        //linkedList.get(0);
        linkedList.add(35);
        linkedList.add(25);
        linkedList.add(31);
        System.out.println("Before "+linkedList);
        linkedList.remove(1);
        System.out.println("After "+linkedList);

        Vector<Integer> vector =new Vector<>();
        vector.add(5);
        vector.add(10);
        vector.add(15);
        System.out.println(vector);
        Stack<Integer> stack=new Stack();
        stack.add(5);
        stack.add(66);
        stack.add(77);
        System.out.println(stack);
        stack.push(55);
        System.out.println(stack);
        stack.push(100);
        System.out.println(stack);
    }
}
