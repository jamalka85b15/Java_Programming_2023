package day21_multidementianal;

import java.util.Arrays;

public class RemoveExtraSpace {


    public static void main(String[] args) {
        String str = "   hello world    I    love    jama";
        str=str.trim();
        System.out.println(str);
        String[] words =str.split(" ");
        System.out.println(Arrays.toString(words));
        str="";
        for (String each : words) {
            if(!each.isEmpty()){
                str+=each+" ";
            }
        }System.out.println(str);

    }

}
