package day23_arrayList;

import java.util.ArrayList;

public class FindUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(5);
        num.add(6);
        System.out.println(num);

        for (Integer element : num) {
            int frequency = 0;
            for (Integer each : num) {
                if (each == element) {
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println("Unigue element "+element);
            }
        }
    }
}
