package day14_forLoop;

public class OverloadingMainMethod {


    public static void main(String[] args) {
        System.out.println("A");//only this will be executed
    }
    public static void main(int[] args) {
        System.out.println("B");//will not be called
    }
    public static void main(double[] args) {
        System.out.println("C");//will not be called
    }
    public static void main(boolean [] args) {
        System.out.println("D");//will not be called
    }
}
