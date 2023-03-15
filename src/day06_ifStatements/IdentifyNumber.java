package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 0;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        //boolean isZero = number == 0;
        boolean isZero =!isPositive && !isNegative;
        System.out.println(number + " is Positive "+ isPositive);
        System.out.println(number + " is Negative "+ isNegative);
        System.out.println(number + " is Zero "+ isZero);

    }


}
