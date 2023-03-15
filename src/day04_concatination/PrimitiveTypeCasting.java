package day04_concatination;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {
        //----Implicit Casting----
        byte a = 15;
        short b = a;
        //short b = (byte) a;
        System.out.println(b);
        int c = a; //implicit casting
        long d =3000L;
        float f = d; //implicit casting

        // ---Explicit Casting ---
        int x =100;
        byte y = (byte)x; //explicit casting

        float z = 20.8F;
        short w = (short) z;  //explicit casting ----shortcut for casting alt+Enter
        System.out.println(w);
        System.out.println(z);





    }


}
