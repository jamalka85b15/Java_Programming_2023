package day36_polimorphismContinue;

import day30_inharitanceContinue.phoneTask.Iphone;
import day30_inharitanceContinue.phoneTask.Nokia;
import day30_inharitanceContinue.phoneTask.Phone;
import day30_inharitanceContinue.phoneTask.Samsung;

public class PolyPractice {
    public static void main(String[] args) {

        Phone[] phones = {
                new Iphone("XS", "Pink", "64GB", 1000),
                new Iphone("XR", "White", "128GB", 1999),
                new Iphone("Iphone 11", "Pink", "256GB", 999),
                new Samsung("Galaxy", "White", "258GB", 750),
                new Samsung("Galaxy", "White", "526GB", 800),
                new Samsung("Galaxy", "White", "64GB", 950),
                new Nokia("Nokia", "LP", "Black", "64GB", 150),
                new Nokia("Nokia", "BN", "White", "528GB", 150),
                new Nokia("Nokia", "AT", "Black", "128GB", 150),
                new Iphone("Iphone 14", "White", "128GB", 2999),
                new Iphone("Iphone 12", "Black", "528GB", 1999),
                new Samsung("Galaxy", "White", "32GB", 750),
                new Samsung("Galaxy", "Black", "128GB", 650),
                new Nokia("Nokia", "SM", "Black", "128GB", 150),
                new Iphone("Iphone 13", "Black", "256GB", 1000),
                new Iphone("Iphone 14", "White", "256GB", 899)
        };
        for (Phone each : phones) {
            System.out.println(each.getModel()+ " - "+ each.getColor()+" - "+ each.getPrice());

        }
        System.out.println("---------------------");
        int countIphone =0;
        int countSamsung=0;
        int countNokia=0;
        for (Phone each :phones) {
            if(each  instanceof Iphone){
                countIphone++;
            }
            if(each  instanceof Iphone){
                countSamsung++;
        }
            if(each instanceof Nokia){
                countNokia++;
            }
            System.out.println("Iphone: "+countIphone);
            System.out.println("Samsung: "+countSamsung);
            System.out.println("Nokia: "+countNokia);
    }
}}
