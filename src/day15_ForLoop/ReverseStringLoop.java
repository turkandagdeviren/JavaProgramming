package day15_ForLoop;


import java.util.Scanner;

public class ReverseStringLoop {
    public static void main(String[] args) {
        /*
        Write a program that can reverse any given string

         */
        Scanner scan=new Scanner (System.in);
        System.out.println("enter a word:");
        String str= scan.next();
        scan.close();
        String result ="";
        for (int i = str.length()-1 ; i >=0; i--) {
                result+= str.charAt(i);
        }

        System.out.println(result);







    }
}
