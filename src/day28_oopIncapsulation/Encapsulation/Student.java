package day28_oopIncapsulation.Encapsulation;

public class Student {
    private int age;
    private String name;

    public int getAge() {  //READ ONLY
        if (age == 0) {
            System.err.println("Age not given");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age) {  //WRITE ONLY
        if (age < 1 || age > 100) {
            System.err.println("Invalid age " + age);
            //return; //exiting the method
            System.exit(1);
        }
        this.age = age;

    }

    public String getName(){
        if(name ==null){
            System.err.println("Name is not given");
            System.exit(1);
        }
        return name;
    }
    public void setName(String name) {
        boolean hasDigit = false;

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }

        if(hasDigit){
            System.err.println("Invalid name "+name);
            System.exit(1);
        }
        this.name = name;
    }


}
