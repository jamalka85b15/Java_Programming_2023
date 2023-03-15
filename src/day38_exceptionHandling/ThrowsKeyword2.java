package day38_exceptionHandling;

import java.io.FileInputStream;

public class ThrowsKeyword2 {
    public static void main(String[] args) {

    }

    public static void  pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void method2() throws InterruptedException {
        System.out.println("Hello");
        pauseFor5Seconds();
        System.out.println("Bye");
    }

    public static void method3() throws Exception{
        System.out.println("Starts");
        Thread.sleep(3000);
        System.out.println("Ends1");
        new FileInputStream("");
        Thread.sleep(2000);
    }
}
