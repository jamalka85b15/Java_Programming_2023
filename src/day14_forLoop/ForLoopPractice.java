package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i =5; i <=10; i--){ //will execute endless since i never will be false

        }

        for(char c =65; c <= 90; c++ ){
            System.out.print(c);
        }
        System.out.println("-------------------");
        for (char c =90; c >= 65; c--){
            System.out.print(c);
        }
        System.out.println("-----------------------");
        int total=0;
        for(int i =1; i <= 100; i++){
            total+=i;


        }
        System.out.println(total);

    }



}
