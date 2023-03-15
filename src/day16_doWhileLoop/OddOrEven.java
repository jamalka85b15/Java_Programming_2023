package day16_doWhileLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);




  while (true){
      System.out.println("Eneter a number");
      int number=input.nextInt();
      if(number %2 ==0){
          System.out.println(number+" Even");
      }else{
          System.out.println(number+" Odd");
      }
      System.out.println("Would you like to enter another number");
      String answer =input.next().toLowerCase();

      while (!(answer.equals("yes") || answer.equals("no")) ){
          System.out.println("Invalid entry");
          answer=input.next().toLowerCase();

      }

      if(answer.equals("no"));{
          break;
      }

  }

    }

}
