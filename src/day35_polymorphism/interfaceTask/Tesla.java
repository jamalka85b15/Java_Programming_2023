package day35_polymorphism.interfaceTask;

public class Tesla extends Car implements AutoPark, Electric{
    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getClass().getSimpleName()+" can autoPark");
    }



    @Override
    public void transportPeople() {
        System.out.println(getClass().getSimpleName()+" transport 4 people");
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName()+" starts itself");
    }

    @Override
    public void charge() {
        System.out.println(getClass().getSimpleName()+" is electric");
    }
}
