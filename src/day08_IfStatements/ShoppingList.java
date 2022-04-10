package day08_IfStatement;

import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        //declare 4 string variables
        String item1, item2, item3, report;

        //declare 4 double variables
        double price1, price2, price3, totalPrice;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item1 and it's price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter item2 and it's price:");
        item2 = scan.next();
        price2 = scan.nextDouble();

        System.out.println("Enter item3 and it's price:");
        item3 = scan.next();
        price3 = scan.nextDouble();

        totalPrice = price1 + price2 + price3;

        report = "Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3 + "\nTotal price: " + totalPrice;
        System.out.println(report);
    }

}