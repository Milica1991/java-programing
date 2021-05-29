package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomersObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString()); //print with defult values are set in no args constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2); //create object and assign value in same statement
        Customer cs3 = new Customer ("John Ward III", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] todayCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of Customer object
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 449));
        customerList.add(new Customer("Suleyman", 9763));

        //Print info of first customer object in array and arraylist
        System.out.println(todayCustomers[0].toString());
        System.out.println(customerList.get(0).toString());

        System.out.println(customerList);//print toString info of all customer object
        System.out.println("----- FOR LOOP----");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        System.out.println("-----FOR EACH LOOP-----");
        for (Customer eachCustomer : customerList) {
            System.out.println(eachCustomer);

        }

        // print all names of Customer in the list
        System.out.println("----NAMES OF CUSTOMERS----");
        customerList.forEach(each -> System.out.println(each.getName()));
        for (Customer eachCustomer : customerList) {
            System.out.println(eachCustomer.getName());
        }





    }
}
