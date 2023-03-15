package day40_queue;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 3, 4, 1, 5, 4, 8, 9, 8, 5, 6, 10, 112, 555));
       /* for (Integer each : list) {
            if(each< 5){
                list.remove(each);
        }

    }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<5){
                list.remove(i);
            }
        }*/
        System.out.println("list "+list);
        System.out.println("------------------------------");


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10, 1, 3, 10, 4, 1, 5, 10, 4, 10, 8, 9, 8, 5, 6, 10, 112, 10, 555, 10));
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            if (it.next() <=5) {
                it.remove();
            }
        }
        System.out.println("list2 "+list2);
        System.out.println("-------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 1, 3, 10, 4, 1, 5, 10, 4, 10, 8, 9, 8, 5, 6, 10, 112, 10, 555, 10));
        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) {
          // Integer each = i.next();
            if (i.next() <= 5) {
                i.remove();
            }
        }
        System.out.println("list3 "+list3);

        System.out.println("-----------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10, 1, 3, 10, 4, 1, 5, 10, 4, 10, 8, 9, 8, 5, 6, 10, 112, 10, 555, 10));
        list4.removeIf(each -> each <=5);
        System.out.println("list4 "+list4);
        System.out.println("--------------------------");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(10, 1, 3, 10, 4, 1, 5, 10, 4, 10, 8, 9, 8, 5, 6, 10, 112, 10, 555, 10));
    list5.removeIf(p->p<=5);
        System.out.println("list5 "+list5);
    }
}
