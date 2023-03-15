package day34_interface.carTask;

import day34_interface.carTask.Audi;
import day34_interface.carTask.Honda;
import day34_interface.carTask.Tesla;

public class TestCarObject {
    public static void main(String[] args) {
        Audi audi=new Audi("AB", 2020,26000,"White");
        System.out.println(audi);
        audi.stop();
        audi.start();
        Honda honda=new Honda("DT", 1560, 15000, "Black");
        System.out.println(honda);
        honda.stop();
        honda.start();
        Tesla tesla=new Tesla("TT", 2022, 50000,"Red");
        tesla.start();
        tesla.stop();
        tesla.autoPilot();
    }
}
