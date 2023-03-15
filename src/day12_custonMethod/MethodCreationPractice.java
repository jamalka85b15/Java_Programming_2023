package day12_custonMethod;

public class MethodCreationPractice {

    public static void main(String[] args) {
       String email ="jamal_d@google.ru";
       emailDomain(email);
      // --------------------------------
       String fName ="jaMa";
       String lName ="crutcHffowD";
       capitalization(fName,lName);
       //---------------------------

        monthName(5);
        //------------------
        int day=0;
        day(day);
        // --------------
        String month ="MaRcH";
        daysInMonth(month);
        //------------------
        eligibleToVote(20,true);
        //------------------
        salaryCounter(47,40);

    }


    public static void emailDomain(String email){
        String domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));
        System.out.println("Domain is: "+domain);
    }

    public static void capitalization(String fName, String lName){
        fName=fName.substring(0,1).toUpperCase()+fName.substring(1).toLowerCase();
        lName=lName.substring(0,1).toUpperCase()+lName.substring(1).toLowerCase();
        System.out.println("Full name: "+fName+ " "+lName);


    }

    public static void monthName(int month){
        if (month>=1 && month <=12){
            switch (month){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                    case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
            }else{
            System.out.println("Invalid month");
        }
    }

    public static void day(int day){
        if(day >=1  && day <=7){
            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }

            }else{
            System.out.println("Invalid number");
        }
    }
    public static void daysInMonth(String month){
        if(month.equalsIgnoreCase("january") || month.equalsIgnoreCase("march")
        || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("july")
        || month.equalsIgnoreCase("august") || month.equalsIgnoreCase("october")
        || month.equalsIgnoreCase("december")){
            System.out.println(month.substring(0,1).toUpperCase()+ month.substring(1).toLowerCase()+
                    " has 31 days");
        } else if ( month.equalsIgnoreCase("april")
        || month.equalsIgnoreCase("june") || month.equalsIgnoreCase("september")
        || month.equalsIgnoreCase("november")) {
            System.out.println(month.substring(0,1).toUpperCase()+ month.substring(1).toLowerCase()+
                    " has 30 days");
        } else if (month.equalsIgnoreCase("february")) {
            System.out.println(month.substring(0,1).toUpperCase()+ month.substring(1).toLowerCase()+
                    " has 28 days");

        }else{
            System.out.println("Invalid month");
        }
    }


    public static void eligibleToVote(int age, boolean isAmerican){
        if(age >=21 && isAmerican ==true){
            System.out.println("Eligile to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void salaryCounter(double hourlyRate, int weeklyHours){
        double grossIncome = hourlyRate* weeklyHours * 52;
        System.out.println("You make "+ hourlyRate+ " per hour");
        System.out.println("You work "+ weeklyHours+ " hours a week");
        System.out.println("Your gross income is "+grossIncome);
    }

}
