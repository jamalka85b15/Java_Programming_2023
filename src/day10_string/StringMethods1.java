package day10_string;

public class StringMethods1 {

    public static void main(String[] args) {
        String str = "Jama";
        char ch1 = str.charAt(2);
        System.out.println(ch1);

        String sentence ="My name is Jama";
        int sentenceLength =sentence.length()-1;
        char last =sentence.charAt(sentenceLength);
        System.out.println(sentenceLength);
        System.out.println(last);

        String name ="Marc";
        String name2=new String("Mark");
        System.out.println(name2.equals(name));


    }

}
