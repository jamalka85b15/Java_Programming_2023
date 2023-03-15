package day32_finalKeyWord.carTask_MethodOverriding;

public class TestCarObject {
    public static void main(String[] args) {
        Bmw bmw=new Bmw("X3", "Blue", 25000, 2019);
        Audi audi=new Audi("Q6", "White", 150000, 2011);
        Honda honda= new Honda("CR", "Red", 20000, 2016);
       Tesla tesla= new Tesla("Model Y", "Black", 200000, 2022);
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(honda);
        bmw.start();
        audi.start();
        honda.start();
       tesla.start();

        tesla.setModel("YY");
        System.out.println(tesla);
    }
}
