package utilities;

import day27_accessModifier.AccessModifiers;
import day27_accessModifier.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println(Date.f);
        System.out.println(Date.d);

        Date.method3();
        Date.method4();

        Date o1=new Date();
        o1.method1();
        System.out.println("------------------------");
        System.out.println(AccessModifiers.publicDate);
        System.out.println();



    }
        }
