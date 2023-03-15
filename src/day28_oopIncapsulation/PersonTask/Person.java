package day28_oopIncapsulation.PersonTask;

public class Person {
    public String name;
    public int age;
    public char gender;
    public  String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWing, numberOfHead;


    public Person(String name) {
        this.name = name;

    } // Allows to create object just by setting the name of person

    public Person(String name, int age) {
        this(name);
        this.age = age;
    } //Allows to create object just by setting the name of person and age

    public Person(String name, String language) {
        this(name);
        this.language = language;
    } //Allows to create object just by setting the name and language of person

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    } //Allows to create object just by setting the name and gender of person

    public Person(String name, int age, char gender) {
        this(name, age);
        this.gender = gender;
    }  // Allows to create object just by setting the name, age and gender of person

    public Person(String name, int age, char gender, String language) {
        this(name, age,gender);
        this.language = language;
    } //  Allows to create object just by setting the name, age, gender and language of person

    static {
        planet ="Earth";
        isHuman=true;
        hasNose=true;
        numberOfHead= 1;
        numberOfWing= 0;
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='"+planet+'\''+
                '}';
    }

    public static void printPlanetName(){
        System.out.println("Planet name is "+planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating "+ food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking "+ drink);
    }


}
