package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("enter your full name:");
        String fullName = input.nextLine();

        System.out.println("enter your building number:");
        String buildingNum = input.next();
        input.nextLine(); //next ten sonra nextline olacagi icin

        System.out.println("enter your street name:");
        String streetName = input.nextLine ();

        System.out.println("enter your city name:");
        String cityName = input.nextLine();

        System.out.println("enter your state name:");
        String state= input.next();

        System.out.println("enter your zip code:");
        String zipCode = input.next ();
        System.out.println( fullName +"\n" +buildingNum+ " " + streetName + "\n" +cityName +", " +state +" "+ zipCode);

        input.close();





    }
}
/*
1. enter your full name nextline
2. enter your building number next
3. enter your street name nextline
4. enter your city name nextline
5. enter your state next
6. enter you zip code next
display the shipping address
 */