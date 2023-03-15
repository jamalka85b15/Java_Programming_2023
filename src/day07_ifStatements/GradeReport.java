package day07_ifStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score =90;
        char grade ='A';

        if(score >=90){
            grade ='A';
        }else if(score >=80 && score < 90) {
            grade = 'B';
        }else if (score >= 70 && score < 80){
            grade = 'C';
        }else{
            grade ='F';
        }
        System.out.println(grade);
    }
}
