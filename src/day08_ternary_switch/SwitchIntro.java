package day08_ternary_switch;

public class SwitchIntro {


    public static void main(String[] args) {
        char grade = 'Y';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("Goob");
                break;
            case 'D':
                System.out.println("Need improve");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                System.out.println("bye");
        }
    }
}

