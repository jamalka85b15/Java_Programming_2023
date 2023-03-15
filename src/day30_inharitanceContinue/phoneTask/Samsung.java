package day30_inharitanceContinue.phoneTask;

public class Samsung extends Phone {

    public Samsung(String model, String color, String size, double price) {
        super("Samsung", model, color, size, price);
    }
    public void freeze(){
        System.out.println(getBrand()+ " "+ getBrand()+ " freezes a lot");

    }

}
