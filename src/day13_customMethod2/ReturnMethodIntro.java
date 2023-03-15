package day13_customMethod2;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        //int total = sum(20,40);// sum in void method,  doesn't return any data

        int result = addition(50,50);
        System.out.println(result);
        int squareResult = squarOfNumber(5);
        System.out.println(squareResult);
    }


    public static int addition(int n1, int n2) { // here int before addition means should return int data
        int result = n1 + n2;
        return result;
    }

    public static int squarOfNumber ( int number){
       int result= number*number;
        return result;
    }

}
