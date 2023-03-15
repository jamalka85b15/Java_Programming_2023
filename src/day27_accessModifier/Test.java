package day27_accessModifier;

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticInitialBlock.c);
        System.out.println(StaticInitialBlock.b);
        System.out.println(StaticInitialBlock.a);

        System.out.println("-------------------");
        System.out.println(AccessModifiers.publicDate);
        System.out.println(AccessModifiers.protectedDate);
        System.out.println(AccessModifiers.defaultDate);
        System.out.println();

    }
}
