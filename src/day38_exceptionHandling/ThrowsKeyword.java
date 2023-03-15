package day38_exceptionHandling;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{


        System.out.println("Started1");
        //System.out.println(100/0);
        System.out.println("Ended1");

        System.out.println("-------------------------");
        System.out.println("Started2");
        Thread.sleep(3000);
        System.out.println("Ended2");
    }
}
