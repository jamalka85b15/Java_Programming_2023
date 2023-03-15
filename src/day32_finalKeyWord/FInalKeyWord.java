package day32_finalKeyWord;

import java.time.LocalDate;

public class FInalKeyWord {

    public static void main(String[] args) {
        final char  gender ='F';
        System.out.println(gender);
        // gender='M'; //unchangeble
        System.out.println(gender);

        final LocalDate dob=LocalDate.now();
        System.out.println(dob);
        //dob = dob.plusYears(1); //unchangeble
        System.out.println(dob);
        }
    }

