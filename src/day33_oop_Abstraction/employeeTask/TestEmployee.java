package day33_oop_Abstraction.employeeTask;

public class TestEmployee {
    public static void main(String[] args) {
     Teacher teacher= new Teacher("Jama", "SDET", "A1", 37,18000, 'F');
        System.out.println(teacher);
        teacher.work();
        Dancer dancer=new Dancer("Maya", "HipHop", "J1", 40, 50000, 'F');
        System.out.println(dancer);
        dancer.work();
        Driver driver=new Driver("ABC", "XYZ", "HT", 41, 6000,'M');
        System.out.println(driver);
        driver.work();

    }
}
