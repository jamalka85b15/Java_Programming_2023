package day19_arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        String[] myGroup =new String[5];
        myGroup[0]="Jama";
        myGroup[myGroup.length-1]="Mark";
        myGroup[1]="Sultan";
        myGroup[2]="Damal";
        myGroup[3]="Danur";
        System.out.println(Arrays.toString(myGroup));
        for (int i = myGroup.length-1; i >=0 ; i--) {
            System.out.println(myGroup[i]);

            System.out.println("---------------------");

            //for (int i1 = 0; i1 < myGroup.length; i1++) { //shortcut for for Loop

           // for (int i1 = myGroup.length - 1; i1 >= 0; i1--) { //shortcut for reverse for Loop



            }


        }


    }
