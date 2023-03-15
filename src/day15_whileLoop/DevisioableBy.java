package day15_whileLoop;

public class DevisioableBy {


    public static void main(String[] args) {
        int number = 1;
        String dev15 = "";
        String dev5 = "";
        String dev3 = "";
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i % 3 == 0 || i % 5 == 0) {
                dev15 += i;


            }
        /*while (!(number >100)){

            System.out.print( " test");

            if (number % 3==0 || number % 5 ==0 || number % 15==0){
                dev15+=number;

            }
            System.out.print("here"+dev15);*/
        }System.out.print(dev15+" ");

    }}

