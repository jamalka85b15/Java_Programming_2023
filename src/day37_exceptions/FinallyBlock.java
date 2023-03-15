package day37_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        try{
            System.out.println(9/0);
        }catch (NullPointerException e){
            System.out.println("Run time caught");
            e.printStackTrace();
        }finally {
            System.out.println("Finally block");
        }
    }
}
