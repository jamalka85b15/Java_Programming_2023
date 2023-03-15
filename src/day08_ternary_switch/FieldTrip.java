package day08_ternary_switch;

public class FieldTrip {

    public static void main(String[] args) {
        int grade =50;
        String location = "Unknown";
        int numberOfGroup =0;
        String teacherName ="Unknown";


        if(grade >=1 && grade<=6){

            if(grade ==1){
                location="Apple orchard"; numberOfGroup= 3; teacherName ="Smith";
            }else if(grade==2){
                location="Movie"; numberOfGroup= 7; teacherName ="Lee";
            }else if(grade==3) {
                location = "Theatre"; numberOfGroup= 5;  teacherName = "Kim";
            }else if(grade==4) {
                location = "Six Flag"; numberOfGroup= 2; teacherName = "Tomson";
            }else if(grade==5) {
                location = "Concert"; numberOfGroup= 4; teacherName = "Young";
            }else{
                location = "TBD"; numberOfGroup= 8; teacherName = "TBD";
            }

        }
        System.out.println("Going to: "+location+ " with teacher: "+ teacherName+ " , your group number is: "+numberOfGroup);

}}
