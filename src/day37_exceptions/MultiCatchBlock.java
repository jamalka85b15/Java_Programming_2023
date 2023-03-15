package day37_exceptions;

import day35_polymorphism.interfaceTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {

        System.out.println("Starts");
        Car car = null;
        try {
            car.drive();
        } catch (ArithmeticException e) {
            System.out.println("First catch");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Second catch");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Third");
            e.printStackTrace();
        }
    }
}
