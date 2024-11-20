package org.pluralsight;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Welcome to Cash Register!");
        System.out.println("Please enter a purchase price (int):");
        String purchasePrice = inputObj.nextLine();
        System.out.println("Please enter a cash amount (int):");
        String cashAmount = inputObj.nextLine();
        System.out.println("Please enter cash in drawer (9 int values separate by spaces, corresponding to penny, nickel, dime, quarter, dollar, 5 dollar, 10 dollar, 20 dollar, 100 dollar amounts):");

        String[] cashInDrawer = inputObj.nextLine().split(" ");
        Register register = new Register();
        Drawer drawer = new Drawer();
        drawer.setCashInDrawer(cashInDrawer);
        System.out.printf("Purchase Price: %s Cash Amount: %s Cash in Drawer: %s%n",
                purchasePrice,
                cashAmount,
                Arrays.deepToString(drawer.getCashInDrawer()));



    }
}