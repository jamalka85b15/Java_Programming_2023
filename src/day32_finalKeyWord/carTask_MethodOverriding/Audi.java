package day32_finalKeyWord.carTask_MethodOverriding;

public class Audi extends Car{
    public Audi( String model, String color, double price, int year) {
        super( model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Press the start button "+getMake()+" "+getModel());
    }
}
