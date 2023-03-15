package day17_customClass;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public int age;
    public String color;


    public void eat() {
        System.out.println(name + " is eating");
    }

    public void dring() {
        System.out.println(name + " is drinking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }


    public void setInfo(String name, String breed, String size, String color, int age) {
        this.name = name; // this keywqord used for calling instance variable name
        this.color = color;
        this.age = age;
        this.size = size;
        this.breed = breed;
    }
}
