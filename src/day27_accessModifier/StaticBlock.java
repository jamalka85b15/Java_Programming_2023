package day27_accessModifier;

public class StaticBlock {
    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new StaticBlock();
        new StaticBlock();
        new StaticBlock();


    }
    static {
        System.out.println("Static Block");
    }
}
