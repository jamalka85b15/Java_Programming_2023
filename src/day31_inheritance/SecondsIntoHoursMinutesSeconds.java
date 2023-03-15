package day31_inheritance;
import java.util.Scanner;
public class SecondsIntoHoursMinutesSeconds {



            public static void main(String[] args) {
                //WRITE YOUR CODE BELOW:

                int inputSeconds, hours, minutes, seconds;

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter seconds:");
                inputSeconds = scan.nextInt();
                hours = inputSeconds / 3600;
                minutes = (inputSeconds % 3600) / 60;
                seconds = inputSeconds % 60;
                System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");

            }}





