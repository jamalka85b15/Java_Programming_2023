package day11_string2;

public class EmailTask2 {


    public static void main(String[] args) {
        String email ="craig_federighi@apple.com";
        String fName=email.substring(0,email.indexOf('_'));
        fName=fName.substring(0,1).toUpperCase()+fName.substring(1).toLowerCase();
        String lName =email.substring(email.indexOf('_')+1,email.indexOf('@'));
        lName=lName.substring(0,1).toUpperCase()+lName.substring(1).toLowerCase();
        String domain =email.substring(email.indexOf('@')+1,email.indexOf('.'));
        System.out.println("First name: "+fName);
        System.out.println("Last name "+lName);
        System.out.println("Domain: "+domain);
    }
}
