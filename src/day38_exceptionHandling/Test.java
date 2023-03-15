package day38_exceptionHandling;

import utilities.Library;

import javax.swing.text.Utilities;
import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {


        System.out.println("Hello Cydeo");
       // Thread.sleep(3500);
        Library.sleep(3.5);
        System.out.println("How are you?");
        System.out.println("---------------------");

        if(LocalTime.now().equals(LocalTime.of(4,32))){
            throw new BreakTimeException();
        }
        throw new BreakTimeException("Go home!!!!!!!!!!!!!!!");


    }
}
