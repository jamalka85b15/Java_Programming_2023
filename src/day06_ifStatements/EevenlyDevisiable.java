package day06_ifStatements;

public class EevenlyDevisiable {

    public static void main(String[] args) {
        int number = 65;
        boolean isDevisiableBy2 = number %2 ==0;
        boolean isDevisiableBy3 = number %3 ==0;
        boolean isDevisiableBy5 = number %5 ==0;
        System.out.println(number + " is devisiable by 2 "+isDevisiableBy2 );
        System.out.println(number + " is devisiable by 3 "+isDevisiableBy3 );
        System.out.println(number + " is devisiable by 5 "+isDevisiableBy5 );
    }
}
