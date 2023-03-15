package day27_accessModifier;

public class InstanceBlock {

        {
        System.out.println("Instance block");
    }
    public InstanceBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();

        InstanceInitialBlock s1 = new InstanceInitialBlock("Mark", 40);
        InstanceInitialBlock s2 = new InstanceInitialBlock("MAry", 40);
        System.out.println(s1);
        System.out.println(s2);

    }



}
