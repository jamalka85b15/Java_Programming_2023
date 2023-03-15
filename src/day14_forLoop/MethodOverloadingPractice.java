package day14_forLoop;

public class MethodOverloadingPractice {
    public static void main(String[] args) {

    }

    public static int sum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static int sum
            (int n1, int n2, int n3) {
        int sum = sum(n1, n2) + n3;
        return sum;
    }

    public static int sum(int n1, int n2, int n3, int n4) {
        int sum = sum(n1, n2, n3) + n4;
        return sum;

    }
}
