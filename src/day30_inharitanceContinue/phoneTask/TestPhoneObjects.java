package day30_inharitanceContinue.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {
        Iphone iphone= new Iphone("XR", "Pink", "256GB", 999);
        Samsung samsung=new Samsung("Galaxy", "White", "126GB", 1000);
        Nokia nokia=new Nokia("Nokia", "TR", "Black", "528GB", 150);
        iphone.call(911);
        samsung.call(212);
        nokia.call(313);

        samsung.freeze();
        iphone.faceTime(313);
        nokia.selfDefence();


    }
}
