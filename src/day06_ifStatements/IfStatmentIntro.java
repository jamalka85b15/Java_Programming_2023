package day06_ifStatements;

public class IfStatmentIntro {

    public static void main(String[] args) {
        int number = 0;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero =!isPositive && !isNegative;
        if (isPositive) {
            System.out.println(number +" is Positive"); //this will be printed only if statement is true
        }
        if(isNegative){
            System.out.println(number + " is Negative "+ isNegative);
        }
       if(isZero){
           System.out.println(number + " is Zero "+ isZero);
       }


    }

}
