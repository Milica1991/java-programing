package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShiping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price:");
        double totalPrice = scan.nextDouble();

        if(totalPrice >= 25.0) {
            System.out.println("FREE SHIPPING ELIGIBALE. YOUR ORDER TOTAL: $ " + totalPrice);
        }else {
                System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. YOUR order total: $" +totalPrice);
            }
                System.out.println("THANKS FOR SHOPPING AMAZAN");

            }
        }


