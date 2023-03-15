package day11_string2;

public class StringMethods2 {

    public static void main(String[] args) {

        String s ="Hello Python, I love Python";
        String s2 =s.replace("Python", "Java");
        System.out.println(s2);
        String word ="java";
        word=word.replace("a", "e");
        System.out.println(word);


        String sen4 ="I love Java Programming";
        sen4=sen4.substring(7,10+1);
        System.out.println(sen4);

        String sen5 = "Today is Sunday tomorrow is Monday";
        sen5=sen5.substring(9,15);
        System.out.println(sen5);

        String email ="CydeoSchoolJavaProgrammimg@gmail.com";
        int beginning =email.indexOf('@')+1;
        int lastIndex =email.lastIndexOf('.');
        System.out.println(beginning + " "+lastIndex);
        String domain =email.substring(27);
        System.out.println(domain);

        String sen6 ="I love Java Programming";
        int begin1 = sen6.indexOf('J');
        System.out.println(begin1);
        String sen7 =sen6.substring(7);
        System.out.println(sen7);

        String sen8 ="I study at Cydeo School";
        String sen9 =sen8.substring(11);
        System.out.println(sen9);


        String sen10 ="Java";
        sen10=(sen10+"\n").repeat(5);
        System.out.println(sen10);
;
    }


}
