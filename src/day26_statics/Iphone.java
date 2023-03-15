package day26_statics;

public class Iphone {

    public static  String brand = "Apple";  //its static because all Iphone brand is Apple for all object
    public String model;
    public String color;
    public double price;
    public static String OS= "iOS";
    public static  String madeIn= "China";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;
    public static boolean isExpensiveToFix=true;


    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }




    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    public void call(){
        System.out.println("Iphone making calls");

    }
    public  void printPhoneInfo(){
        System.out.println("Model "+ model);
        System.out.println("Color "+color);

    }

    public static void printInfo(){
        System.out.println("Brand "+brand);
        System.out.println("Made in "+ madeIn);
    }
}
