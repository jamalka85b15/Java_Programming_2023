package day15_whileLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {

            if(i==5){
                break;
            }

            System.out.println(i);
        }
        System.out.println("------------------");
        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.println(i);
            if(i=='J'){
                break;
            }



        }
        for (;;){
            System.out.println("Hi");
            break;

        }



    }

}
