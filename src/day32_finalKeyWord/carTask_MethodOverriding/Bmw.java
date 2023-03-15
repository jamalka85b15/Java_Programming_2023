package day32_finalKeyWord.carTask_MethodOverriding;

public class Bmw extends Car{
    public Bmw( String model, String color, double price, int year) {
        super( model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanic or jump start "+getMake()+" "+getModel());
    }
}
