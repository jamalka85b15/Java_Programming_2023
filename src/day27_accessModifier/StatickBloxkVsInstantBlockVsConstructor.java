package day27_accessModifier;

public class StatickBloxkVsInstantBlockVsConstructor {

    public StatickBloxkVsInstantBlockVsConstructor(){
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instant Blcok");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        new StatickBloxkVsInstantBlockVsConstructor();
        new StatickBloxkVsInstantBlockVsConstructor();

    }
}
