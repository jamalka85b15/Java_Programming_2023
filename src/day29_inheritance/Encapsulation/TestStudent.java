package day29_inheritance.Encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student s1=new Student("Jama", 37, 'F', 'C',"Cydeo");
        System.out.println(s1);
        s1.setGrade('B');
        System.out.println(s1);

    }
}
