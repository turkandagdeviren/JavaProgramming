package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner ( System.in);
        System.out.println("enter your age:");
        int age = input.nextInt();
        System.out.println("enter your gender:");
        String gender = input.next();
        input.nextLine();
        System.out.println("enter your full name:");
        String fullName= input.nextLine();
        System.out.println("enter your phone number:");
        long phoneNum= input.nextLong();
        System.out.println("enter your zip code:");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("enter your school name:");
        String schoolName = input.nextLine();
        System.out.println("enter your city name:");
        String cityName = input.nextLine ();
        System.out.println("enter your state name:");
        String stateName = input. next();
        System.out.println("enter your building number:");
        int buildNum= input.nextInt();
        input.nextLine();
        System.out.println("Enter your Street name");
        String streetName = input.nextLine();
        input.close();
        System.out.println("fullName = " + fullName);
        System.out.println("Adress: \n\t" + buildNum + " "+ streetName + "\n\t" + cityName +
                ", "+ stateName + " " + zipCode);





    }


}
