package day32_finalKeyWord.carTask_MethodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{
    public Tesla( String model, String color, double price, int year) {
        super( model, color, price, year);
    }
    public void autoPilot(){
        System.out.println("Tesla drive on auto pilot");
    }

    @Override
    public void setModel(String model) {
        ArrayList<String> models=new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model X", "Model 3"));
        if(!(models).contains(model)) {
            System.out.println("Invalid model "+ model);
            System.exit(1);
        }
        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors=new ArrayList<>();
        colors.addAll(Arrays.asList("White ", "Red", "Green","Silver", "Black","Blue", "Brown"));
        if(!colors.contains(color)){
            System.out.println("Invalid model "+color);
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setPrice(double price) {
        if(price < 50000){
            System.out.println("Invalid price");
            System.exit(1);
        }
        super.setPrice(price);
    }

    @Override
    public void setYear(int year) {
        if(year< 2008){
            System.out.println("Invalid year");
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void start() {
        System.out.println("Start "+getMake()+" "+getModel());
    }



}
