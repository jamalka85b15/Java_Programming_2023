package day07_ifStatements;

public class MonthName {

    public static void main(String[] args) {

        int n = 100;
        String month ="";
        if(n >=1 && n<=12){
            if(n == 1) month= "Jan";
            else if (n ==2) month= "Feb";
            else if (n ==3) month= "Mar";
            else if (n ==4) month= "Apr";
            else if (n ==5) month= "May";
            else if (n ==6) month= "Jun";
            else if (n ==7) month= "Jul";
            else if (n ==8) month= "Aug";
            else if (n ==9) month= "Sep";
            else if (n ==10) month= "Oct";
            else if (n ==11) month= "Nov";
            else month= "Dec";
        }else{
            System.out.println("Invalid month");
        }
        System.out.println(month);
    }
}
