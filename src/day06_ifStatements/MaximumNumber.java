package day06_ifStatements;

public class MaximumNumber {

    public static void main(String[] args) {
        int num1 = 200,
                num2 = 200;
        if(num1 > num2){
            System.out.println(num1+ " is max number");
        }
        if(num2 > num1){
            System.out.println(num2 + " is max number");

        }
        if(num2==num1){
            System.out.println("Equal");
        }
    }
}
