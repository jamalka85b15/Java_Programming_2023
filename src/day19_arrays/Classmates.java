package day19_arrays;

import java.util.Arrays;

public class Classmates {

    public static void main(String[] args) {

        /* create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
       */

        String[] classmates = {"Alex Kim", "Bika Chon", "Chaki Tan", "Danya Song", "Eva Lee",
                "Franki Pak", "Gulya Chan", "Hector Nom", "Lola Kim", "Mika Suk"};
        String initials = "";
        for (int i = 0; i < classmates.length; i++) {
            //System.out.println(classmates[i]);
            initials = classmates[i].substring(0, 1)
                    + classmates[i].substring(classmates[i].indexOf(' ') + 1, classmates[i].indexOf(' ') + 2);
            System.out.println(initials);
        }
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
        System.out.println("-------------------------------------");
        String[] classmates2 = {"Alex", "Bika", "Chaki", "Danya", "Eva",
                "Franki", "Gulya", "Hector", "Lola", "Mika"};

        for (int i = 0; i < classmates2.length; i++) {
            String reverse = "";
            String each = classmates2[i];


            for (int j = each.length(); j != 0; j--) {
                char ch = each.charAt(j-1);
               // reverse=reverse+ch;
                reverse+=ch;


            }System.out.println(reverse);

        }
    }
}

