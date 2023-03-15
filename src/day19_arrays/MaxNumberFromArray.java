package day19_arrays;

public class MaxNumberFromArray {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 75;
        numbers[1] = 10;
        numbers[2] = 90;
        numbers[3] = 20;
        numbers[4] = 5;
        int max = -numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }System.out.println("Max= "+max);


    }


}
