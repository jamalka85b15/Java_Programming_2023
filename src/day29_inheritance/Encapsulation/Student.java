package day29_inheritance.Encapsulation;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private  String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
       setAge(age);
        setGender(gender);
        setGrade(grade);
        this.name = name;
        this.schoolName=schoolName;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 5 || age > 90){
            System.out.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender== 'M' || gender=='F'){
            this.gender = gender;
        }
        else{
            System.out.println("Invalid gender");
            System.exit(1);
        }

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(grade!='A' && grade!='B' && grade!='C' && grade!='D' && grade!='F'){
            System.out.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+ " studying in grade "+grade);
    }


}
