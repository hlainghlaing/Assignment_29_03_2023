package scm.com.data.types;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

        // Output using getter method
        System.out.println("Customer ID : " + customer.getCustomerID());
        System.out.println("Customer Name : " + customer.getCustomerName());
        System.out.println("Customer Ph-No : " + customer.getCustomerPh());
        System.out.println("Customer Adderss : " + customer.getCustomerAddress());

        // Creating ArrayList Object
        ArrayList<String> itemArrObj = new ArrayList<>();
        // insert values to array Object
        itemArrObj.add("Facial Form");
        itemArrObj.add("Suncreen");
        itemArrObj.add("Lotion");
        itemArrObj.add("Foundation");
        itemArrObj.add("Face Mask");
        itemArrObj.add("Hair Coat");
        itemArrObj.add("Serum");
        itemArrObj.add("Lipsticks");
        itemArrObj.add("Eyeshadow");

        System.out.println("List of Items in this Shop \n");
        // Output Array using for loop
        for (String i : itemArrObj) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        // To get user input from command line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ItemID");

        // Insert static variable value from user input
        Item.itemID = sc.nextLine();

        System.out.println("Enter Item name");
        Item.itemName = sc.nextLine();
        System.out.println("Enter Amount");
        Item.itemAmount = sc.nextLine();

        System.out.println("Thanks for your order!");
        System.out.println("Your order will be arrived within 3-5 days");
        System.out.print(Item.itemID + " " + Item.itemName);
        System.out.println(" " + Item.itemAmount);

    }

}
