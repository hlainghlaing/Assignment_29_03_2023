package scm.com.data.types;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declare & Instantiate Customer Object
        Customer customer = new Customer();

        // Insert customer information using setter
        customer.setCustomerID(000001);
        customer.setCustomerName("Su Su");
        customer.setCustomerPh("09-777666444");
        customer.setCustomerAddress("Yangon");

        // To get user input from command line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ItemID");

        // Insert static variable value from user input
        Item.itemID = sc.nextLine();

        System.out.println("Enter Item name");
        Item.itemName = sc.nextLine();
        System.out.println("Enter Amount");
        Item.itemAmount = sc.nextLine();

        // Output
        System.out.println("Thanks for your order!");
        System.out.println("Your order will be arrived within 3-5 days");
        System.out.print(Item.itemID + " " + Item.itemName);
        System.out.println(" " + Item.itemAmount);

    }

    public static void testingDataSize() {

    }

}
