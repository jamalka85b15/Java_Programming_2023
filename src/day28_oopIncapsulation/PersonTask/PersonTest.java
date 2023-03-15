package day28_oopIncapsulation.PersonTask;

public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person("Jama", 37);
        Person p2=new Person("Mark", 37, 'M');
        Person p3=new Person("Lia", 35, 'F', "Spanish");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.drink("Latte");
        p1.eat("Shashlyk");

    }
}
