package day08_ternary_switch;

public class IfSatatementAndTernariyPractice {

    public static void main(String[] args) {
        int score =87;
        //String result ="";
        String result = (score >= 0 && score <=100)?
                (score >= 90)?  "A" : (score >= 80)?  "B" :(score >= 70)?  "C": (score >= 60)?  "D" : "F"
                        : "Invalid score";
        System.out.println(result);
    }

}
