package day16_doWhileLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition=false;
        for (; condition;) {
            System.out.println("HEllo");

        }
        while (condition){
            System.out.println("HEllo again");
        }
        do {
            System.out.println("Hello Do while");
        }while (condition);


    }

}
