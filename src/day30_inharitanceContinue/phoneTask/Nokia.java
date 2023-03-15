package day30_inharitanceContinue.phoneTask;

public class Nokia extends Phone {
    public Nokia(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void selfDefence(){
        System.out.println(getBrand()+ " "+ getModel()+ " can be used for self defense");
    }
}
