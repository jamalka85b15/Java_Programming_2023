package day22_arrayList;

public class WrapperClassMethod {

    public static void main(String[] args) {
        String str ="20";
        System.out.println(str+1);//will be 201
        int num = Integer.parseInt(str); // converted to primitive
        Integer num2 =Integer.valueOf(str); // converted to wrapper class

    }
}
