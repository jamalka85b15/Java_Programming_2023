package day38_exceptionHandling;

public class TestPerson {
    public static void main(String[] args) {
        Person person=new Person("Jama",25 , 'F');
        System.out.println(person);

        try {
            person.setAge(-10);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(person);
    }
}
