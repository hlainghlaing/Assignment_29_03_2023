package scm.com.operators;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declare & Instantiate Person Object
        Person person = new Person();

        // Use Scanner to get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        // Insert user input to person object
        person.setPersonAge(sc.nextInt());
        ;

        int age = person.getPersonAge();

        if (age > 0 && age < 18) {
            System.out.println("You are young!");
        } else if (age >= 18 && age <= 30) {
            System.out.println("You are adult!");
        } else if (age > 30 && age <= 40) {
            System.out.println("Travel & Stay be happy in your youth");
        } else {
            System.out.println("Take care yourself!");
        }
        
        int runTime=0;
        while(runTime<=5) {
            if(runTime<5) {
                System.out.println("You ran "+runTime+"m");
                System.out.println("Fighting, You still need to run");
            }else {
                System.out.println("You passed"+runTime+"m running mission");
                System.out.println("Congratulation!");
            }
            runTime++;
        }
    }

}
