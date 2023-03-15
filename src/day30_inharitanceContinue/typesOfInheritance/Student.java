package day30_inharitanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person {

    private char grade;
    private String studentID;
    public Student(String name, char gender, LocalDate dateOfBirth) {
        super(name, gender, dateOfBirth);
       setGrade(grade);
       setStudentID(studentID);

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }



    public void study(){
        System.out.println(getName()+" is studying");
    }



}
