package day14_forLoop;

public class StringReverse {


    public static void main(String[] args) {


        System.out.println("Hi");
        String name ="Nurzhamal";
        System.out.println(reverse(name));
        /*String name = "Sultan";
        String reversed="";
        for (int i = name.length()-1; i >= 0; i--) {
            System.out.println(name.charAt(i));
            reversed += name.charAt(i);
        }
        System.out.println(reversed);*/


    }


    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

}
