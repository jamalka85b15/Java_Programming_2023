package day27_accessModifier;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public static String schoolName;
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    static {
       schoolName ="Cydeo";
        secretCode ="Cydeo123";
    }
        }
