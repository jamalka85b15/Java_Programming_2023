package day07_ifStatements;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class NetIncomeCal {


    public static void main(String[] args) {
        int salary = 140000;
        boolean isMarried =false;
        double tax = 0;

        if(salary >= 130000){
            tax =0.35;
        }
        if(salary>=100000 && salary <=129000){
            tax=0.3;
        }
        if(salary>=80000 && salary <=99000){
            tax=0.25;

        }
        if(salary >=35000 && salary<=79000){
            tax= 0.2;
        }
        if(isMarried==true){
            tax-=0.05;
        }
        double totalTax= salary* tax;
        double netIncome =salary -totalTax;
        System.out.println("Tax rate is "+tax);
        System.out.println("Net income is "+netIncome);
    }

}
