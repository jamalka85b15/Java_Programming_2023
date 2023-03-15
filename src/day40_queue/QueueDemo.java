package day40_queue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> q1= new PriorityQueue<>();
        q1.addAll(Arrays.asList(10,200,300,40,90));
        q1.addAll(Arrays.asList(10,200,300,40,90));
        q1.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("Q1 "+q1);
        int num1 =q1.poll(); //FIFO
        System.out.println(num1);
        System.out.println("---------------------");
        Queue<Integer> q2= new ArrayDeque<>();
        q2.addAll(Arrays.asList(30,200,300,40,90));
        q2.addAll(Arrays.asList(30,200,300,40,90));
        q2.addAll(Arrays.asList(30,200,300,40,90));
        System.out.println("Q2 "+q2);
        System.out.println("---------------------");
        Queue<Integer> q3= new LinkedList<>();
        q3.addAll(Arrays.asList(20,200,300,40,90));
        q3.addAll(Arrays.asList(20,200,300,40,90));
        q3.addAll(Arrays.asList(20,200,300,40,90));
        System.out.println("Q3 "+q3);
        System.out.println("--------------------");
        List<Integer> l1= new LinkedList<>();
        l1.addAll(Arrays.asList(20,200,300,40,90));
        l1.addAll(Arrays.asList(20,200,300,40,90));
        l1.addAll(Arrays.asList(20,200,300,40,90));
        System.out.println(l1);


    }
}
