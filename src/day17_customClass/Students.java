package day17_customClass;

public class Students {

    public String name;
    public char gender;
    public int age;
    public String sutendId;
    public String grade;
    public boolean isFulltime;

    public void setInfo(String name, char gender, int age, String sutendId, String grade, boolean isFulltime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.sutendId = sutendId;
        this.grade = grade;
        this.isFulltime = isFulltime;
    }

    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", sutendId='" + sutendId + '\'' +
                ", grade='" + grade + '\'' +
                ", isFulltime=" + isFulltime +
                '}';
    }

    public void study(){
        System.out.println(name+ " is the best student because he studying very hard");
    }
}
