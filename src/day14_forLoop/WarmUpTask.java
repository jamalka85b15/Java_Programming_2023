package day14_forLoop;

public class WarmUpTask {

    public static void main(String[] args) {

        System.out.println(combine("Alle","Elki"));
        System.out.println(sumOf2Numbers(55,45));
        System.out.println(sumOf3Numbers(10,50,5));
        System.out.println(sumOf4Numbers(30,30,30,10));

    }

    public static String combine(String str1, String str2) {
        String combinedWord;

        String lastsChar =str1.substring(str1.length() - 1);
        boolean isSame =str2.startsWith(lastsChar);
        if(isSame==true){
            str1= str1.substring(0,str1.length()-1);
            combinedWord=str1+str2;

        }else {
            combinedWord =str1+str2;
        }


        return combinedWord;
    }


    public static int sumOf2Numbers( int num1, int num2){
        int sum= num1+num2;
        return sum;
    }
    public static int sumOf3Numbers (int num1, int num2, int num3){
        int sum =sumOf2Numbers(num1,num2)+num3;
        return sum;
    }
    public static int sumOf4Numbers(int num1, int num2, int num3, int num4){
        int sum = sumOf3Numbers(num1,num2,num3)+num4;
        return sum;
    }
}
