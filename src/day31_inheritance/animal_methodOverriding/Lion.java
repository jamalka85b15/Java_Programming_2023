package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion = true;

    public Lion(String name, String breed, String size, String color, char gender, int age, boolean isAfricanLion) {
        super(name, breed, size, color, gender, age);
       setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("Dog "+ getName()+ " is eating dog food");

    }

    @Override
    public void sleep() {
        System.out.println("Dog "+ getName()+ " is sleeping 10 hours");
    }

    @Override
    public String toString() {
       return super.toString().replace("}", "")+
               ", isAfricanLion" + isAfricanLion+'\'' +
               '}';

       /* return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isAfricanLion" + isAfricanLion+'\'' +
                '}';*/
    }
}
