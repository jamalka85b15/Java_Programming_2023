package day08_ternary_switch;

public class Elevetor {
    public static void main(String[] args) {
        int floor =4;
        String companyName = "Invalid floor";

        if(floor >=1 && floor <=3){


            if(floor ==1){
                companyName= "Lobby, Verizon, Starbucks";
            } else if (floor == 2) {
                companyName = "Cydeo, NASA, Intelsat";
            }else{
                companyName ="Bek, Sun, Tur";
            }


        }else {
            companyName = "Invalid floor";
        }
        System.out.println(companyName);


    }

}
