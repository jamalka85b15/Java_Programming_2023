package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a =100;
        int b = 200;
        System.out.println(a > b);
        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);

        int score =75;
        boolean passed = score >= 60;
        System.out.println(passed);

        int age = 21;
        boolean isEligibaleToBuy = age >= 21;
        System.out.println("Is Eligibale = " + isEligibaleToBuy);
    }

}
