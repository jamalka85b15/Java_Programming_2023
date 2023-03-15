package day12_custonMethod;

public class CustomMethosWithParameter {

    public static void main(String[] args) {

        checkOddOrEven(8);
        initialsMaker("nurzhamal", "crutchfield");

    }
    public static void checkOddOrEven (int num){
        if(num % 2 ==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");

        }

    }

    public static void initialsMaker(String fName, String lName){

       fName=fName.substring(0,1).toUpperCase();
       lName=lName.substring(0,1).toUpperCase();;
        System.out.println(fName+lName);
        //String initial =fName.charAt(0)+ "."+ lName.charAt(0);
       // System.out.println(initial);
    }

        }


