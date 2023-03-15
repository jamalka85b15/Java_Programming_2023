package day11_string2;

public class WebsiteAddress {

    public static void main(String[] args) {

       String websiteName ="www.gmail.gov";
       boolean checkWeb = ((websiteName.startsWith("www") && (websiteName.endsWith(".com"))
               || (websiteName.endsWith(".edu"))|| (websiteName.endsWith(".gov"))));
        System.out.println(checkWeb);


        /*
        Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
         */
    }

}
