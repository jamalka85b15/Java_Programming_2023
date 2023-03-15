package day15_whileLoop;

public class RemoveDublicate {
    public static void main(String[] args) {

        String abc = "aaabbbcccc";
        String result ="";
        for (int i = 0; i < abc.length() ; i++) {

           char each =abc.charAt(i);
           if( !result.contains(""+each)){
               result+=each;
           }


        }System.out.print(result);

    }
}
