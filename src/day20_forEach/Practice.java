package day20_forEach;

public class Practice {

    public static void main(String[] args) {

       int[] numbers ={1,5,4,8,10,13,11,18,21,33,50,67,80,99,100};
        int evenCount=0;
        int oddCount =0;
        for (int each : numbers) {
            if(each%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even number count is: "+evenCount);
        System.out.println("Odd number count is: "+oddCount);

        System.out.println("----------------------------");
        
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        for (int each : arr1) {

        }

    }
}
