package day30_inharitanceContinue.phoneTask;

public class Iphone extends Phone {


    public static boolean hasApplePay =true;

    public Iphone( String model, String color, String size, double price) {
        super("Apple", model, color, size, price); //must have in sub class to call super class constructor
    }

    public void faceTime(long phoneNumber){
        System.out.println(getModel()+ " is faceTiming with "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel()+ " is faceTiming with "+email);

    }


}
