package day27_accessModifier;

public class InstanceInitialBlock {
    public String name;
    public int age;

    {
        name="Jama";
        age=37;
    }

    public InstanceInitialBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "InstanceInitialBlock{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
