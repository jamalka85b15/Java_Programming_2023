package day06_ifStatements;

public class EvenNumberOrNot {

    public static void main(String[] args) {
        int number = 95;
        boolean EvenResult = number % 2==0; //When we divide a number by 2   reminder is 0, means number is even
        //boolean OddResult = number % 2 !=0; //When we divide a number by 2   reminder is not 0, means number is odd
        boolean OddResult = !EvenResult;

        System.out.println(number + " is an even number "+ EvenResult);
        System.out.println(number + " is an odd number "+ OddResult);
    }
}
