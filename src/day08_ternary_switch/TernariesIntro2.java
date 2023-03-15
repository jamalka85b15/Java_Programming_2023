package day08_ternary_switch;

public class TernariesIntro2 {

    public static void main(String[] args) {
        int number = 0;
       // String result ="Positive";

        String result =(number < 0 )? "Negative" :(number >0)? "Positive":  "Zero";
        System.out.println(result);


        System.out.println("----------------");
        int n1 =0;

        String day = (n1 >= 1 && n1 <= 7)?
                (n1 ==1)? "Monday": (n1==2)? "Tuesday" : (n1 ==3)? "Wednesday"
                : (n1 ==4)? "Thursday": (n1 ==5)? "Friday": (n1 ==6)? "Saturday":  "Sunday"
                :"Invalid";
        System.out.println(day);
    }






}
