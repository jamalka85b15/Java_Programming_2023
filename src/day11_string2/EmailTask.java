package day11_string2;

public class EmailTask {

    public static void main(String[] args) {

        String email ="mike_tyson@gmail.com";

        String fName=email.substring(0,email.indexOf("_"));
        String lName =email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain =email.substring(email.indexOf("@"));
        email =lName+"_"+fName+domain;
        System.out.println(email);
    }

}
