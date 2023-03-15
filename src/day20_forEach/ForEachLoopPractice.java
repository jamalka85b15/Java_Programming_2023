package day20_forEach;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6,7,8,9,10,11};
        for(int each : numbers){
            if(each%2==1){
                System.out.println(each);
            }
        }
        System.out.println("---------------------");

        int[] nums ={10,20,30,40,50,6,7,8,9,1000,1150};
        int max =nums[0];
        for (int each : nums) {
            if(each >max){
                max =each;
            }
        }

    }
}
