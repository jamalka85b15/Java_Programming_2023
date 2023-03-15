package day17_customClass;

public class TestEmnployee {

    public static void main(String[] args) {

        Employee emp1 =new Employee();
        emp1.setInfo("Jama", 37, 15000, 'F',"2107690", "CEO");
        emp1.work();
        System.out.println(emp1);
    }


}
