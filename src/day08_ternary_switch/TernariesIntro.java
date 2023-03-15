package day08_ternary_switch;

public class TernariesIntro {

    public static void main(String[] args) {
        int score =60;
        String result;
         if(score >=65){
             result = "Passed";
         }else{
             result="Failed";
         }
        System.out.println(result);



      String result2  = (score >=65)? "Passed" : "Failed";
        System.out.println(result2);

        int age =15;
        String r = (age >= 21)? "Eligible" : "Not eligible";
        System.out.println(r);


    }


}
