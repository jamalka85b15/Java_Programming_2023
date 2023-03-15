package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 6 ; i++) {
            if(i==4){                    //when this condition==true, will skip it
                continue;
            }
            System.out.println(i);
        }

        System.out.println("------------------");
        for (int i = 10; i <21 ; i++) {
            if(i % 2==0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---------------");

        for (char i = 'A'; i <='G' ; i++) {
            if(i=='B' || i=='E'){
                continue;

            }
            System.out.println(i);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println("Hello");
        }

        int sum =0 ;
        for (int i = 50; i <=100 ; i++) { //another way for even number i+=2
            if(i % 2==1)
                continue;

            sum+=i;
        }
        System.out.println(sum);

    }
}
