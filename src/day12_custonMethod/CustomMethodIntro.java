package day12_custonMethod;

public class CustomMethodIntro {
    public static void main(String[] args) {
        System.out.println("begin");
    greetingMessage();
        System.out.println("end");

        System.out.println("second method starts here");
        helloJava();
        System.out.println("second method ends here");

        System.out.println("eligibility method starts");
        eligibility(5);
        System.out.println("eligibility method ends");
    }

    public static void greetingMessage(){
        System.out.println("Hello everyone");
        System.out.println("How are you doing?");
    }

    public static void helloJava(){
        System.out.println("Hello Java");
        System.out.println("I love Java");
    }

    public static void eligibility(int num){

       if(num >=21){
           System.out.println("Eligible");
       }else{
           System.out.println("Not eligible");
       }
    }
}
