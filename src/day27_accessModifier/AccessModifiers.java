package day27_accessModifier;

public class AccessModifiers {

    public static int publicDate =200;
    protected static int protectedDate =300;
     static  int defaultDate=400;
     private static int privateDate =500;


    public static void main(String[] args) {
        System.out.println(publicDate);
        System.out.println(protectedDate);
        System.out.println(defaultDate);
        System.out.println(privateDate);
    }

}
