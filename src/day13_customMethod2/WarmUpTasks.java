package day13_customMethod2;

public class WarmUpTasks {
    public static void main(String[] args) {
        calculator(10, 50, ')');
        ageGroup(21);


    }

    public static void calculator(double num1, double num2, char mathOperator) {
        double result = 0;
        switch (mathOperator) {
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.err.println("Invalid operator");
        }

//

    }

    public static void ageGroup (double age){

        if(age >=0 ||age <=100) {
            if (age < 21){
                System.out.println("Teenager");
            }else if(age >=21 && age <= 55){
                System.out.println("Adult");
            }else if(age > 55){
                System.out.println("Senior");
            }

        }else{
        System.err.println("Invalid age");

        }
    }}


