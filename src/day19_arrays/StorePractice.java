package day19_arrays;

public class StorePractice {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150, 9.99, 250, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println(items[2].indexOf('G'));
        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("ipad")){
            }
        }  System.out.println("List has an iPad");


        String report="";
        report= "Item: "+items[0]+", price is: "+ prices[0]+ ", itemID: "+ itemIDs[0]+
               "\nItem: "+items[1]+", price is: "+ prices[1]+ ", itemID: "+ itemIDs[1]+
                "\nItem: "+items[2]+", price is: "+ prices[2]+ ", itemID: "+ itemIDs[2]+
                "\nItem: "+items[3]+", price is: "+ prices[3]+ ", itemID: "+ itemIDs[3]+
                "\nItem: "+items[4]+", price is: "+ prices[4]+ ", itemID: "+ itemIDs[4]+
                "\nItem: "+items[5]+", price is: "+ prices[5]+ ", itemID: "+ itemIDs[5];
        System.out.println(report);
    }
}
