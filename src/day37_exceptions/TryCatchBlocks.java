package day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Program started");
        try {
            System.out.println(9 / 0);
            System.out.println("Try block");
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
        }
        System.out.println("Program ended");

        System.out.println("----------------------------");
        String str = null;
        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try block");
        } catch (RuntimeException e) {
            System.out.println("String program ended");
            System.out.println("----------------------");
            System.out.println("Program 3 started");
            try{
                Thread.sleep(3000);
                System.out.println("try block3");
            }catch(InterruptedException ee){
                System.out.println("Program 3 ended");
            }



        }

    }
}
