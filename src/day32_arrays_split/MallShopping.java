package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("----FIND THE INDEX OF 'Gloves' in items array ----");
        //use for loop with condition
       for (int i = 0;i < items.length;i++) {
           if (items[i].equals("Gloves")) {
               System.out.println("Gloves found at index " + i);
               break;
           }
       }
        System.out.println("----Set boolean to true if 'iPad' is found");
       boolean iPadExists = false;
       for (String item : items) {
           iPadExists = true;
           break;
       }

        System.out.println("iPadExists = " + iPadExists);

        System.out.println("----Print a report-----");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]+" - #"+itemIDs[i]);
        }

        System.out.println("---Loop for 'Jacket' in items and print all details ");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break;
            }
        }



    }
}
