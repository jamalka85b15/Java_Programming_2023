package day06_ifStatements;

import com.sun.tools.javac.Main;

public class GradeLevel {

    public static void main(String[] args) {
        int gradeLevel = 8;
        String result =""; //temp value
        if(gradeLevel >=1 && gradeLevel <=5 ){
            result= "Elementary school";
        }
        if(gradeLevel >=6 && gradeLevel <=8 ){
            result= "Middle  school";
        }
        if(gradeLevel >=9 && gradeLevel <=12 ){
            result= "High school";
        }
        if(gradeLevel >=13 && gradeLevel <=16 ){
            result= "College";
        }
        if(gradeLevel >=17 && gradeLevel <=18 ){
            result= "Grad school";
        }
        System.out.println(result);
    }
}
