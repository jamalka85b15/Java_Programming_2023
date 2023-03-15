package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {
        double salary = 65000;
        int screditScore = 590;
        boolean eligible = salary >= 55000 && screditScore >= 600;
                            //true              false === False
                            //true              true ===True
                            //false             true ===False
                            //true              true ===True
        System.out.println(eligible);

        //String answer ="Maybe";
        String answer = "Yes";
        boolean validAnswer = answer == "Yes" || answer == "No";
        System.out.println(validAnswer);


        char grade = 'E';
        boolean passingGrade = grade=='A' || grade =='B';
        System.out.println(passingGrade);

    }
}
