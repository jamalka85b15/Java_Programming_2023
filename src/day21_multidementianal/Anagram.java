package day21_multidementianal;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 ="earth";
        String str2 ="heart";
        boolean result;
       // String[] str11 =str1.split("");   //Split String into c array
       // String[] str22 =str2.split("");

        char[] str11 =str1.toCharArray();
        char[] str22 =str2.toCharArray(); // to char array
        Arrays.sort(str11);
        Arrays.sort(str22);
        System.out.println(Arrays.toString(str11));
        System.out.println(Arrays.toString(str22));
        result=Arrays.equals(str11,str22);
        System.out.println("Anagram is: "+result);

    }

}
