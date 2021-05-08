package day32_arrays_split;

import java.util.Arrays;

public class MinMaxPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        //print aray values as String in same line with no loop
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        //find amd print details of most expencive item
        System.out.println("find amd print details of most expencive item");
        double maxPrice= prices[0];//assume first price is max
        int indexOfMaxPrice = 0; //assume max price is at index 0

        for (int i = 0;i < prices.length;i++){
            System.out.println(prices[i]);
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }

        }
        System.out.println("MaxPrice = " + maxPrice);
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" +itemIDs[indexOfMaxPrice]);


        //find and print details of least expencive item
    }
}
