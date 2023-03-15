package day13_customMethod2;

public class ReturnMethosPractice {
    public static void main(String[] args) {
        boolean isOdd =isOdd(5);
        System.out.println("isOdd "+ isOdd);

        boolean isEven =isEven(5);
        System.out.println("isEven "+ isEven);

        int max =max(25,30);
        System.out.println("Your max number is "+ max);
        int min =min(10,60);
        System.out.println("Your min number is "+min);


    }

    public static boolean isOdd(int num) {
        boolean odd =false;
        if (num % 2 != 0) {
            odd = true;
        }
            return odd;

    }

    public static boolean isEven(int num){
        boolean even =false;
        if(isOdd(num) !=true){

        }
        return even;
    }

    public static int max (int num1, int num2){

        if (num1 > num2 ){
            return num1;
        }else {
            return num2;
        }
    }

    public static int min (int num1, int num2){
        int min =0;
        if(num1<num2){
            min=num1;
        }else{
            min=num2;
        }
        return min;
    }

}

