package day07_ifStatements;

public class GradeLevel2 {

    public static void main(String[] args) {
        int gradeLevel = 20;
        String result =""; //temp value

        if(gradeLevel <=5 ){
            result= "Elementary school";
        }else if(gradeLevel  <=8 ){
            result= "Middle  school";
        }else if(gradeLevel <=12 ){
            result= "High school";
        }else if(gradeLevel <=16 ){
            result= "College";
        }else {
            result= "Grad school";
        }
        System.out.println(result);
    }
    }


