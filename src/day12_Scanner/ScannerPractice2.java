package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        //System.out.println("enter true or false:");
       // boolean result= input.nextBoolean(); //sadece true veya false kabul eder



        System.out.println("enter your name:");
        String name= input.next(); //next() ilk space e kadar okur, ikinci kelimeyi okumaz.
        System.out.println("name: " + name);



    }
}
