package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        /*
        write a program that asks the user to enter a number for 5 times
        return the maximum number
         */
        Scanner scan= new Scanner (System.in);
        int max= -2147483648; //int da olabilecek en kucuk sayi

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number:");
            int num=scan.nextInt();

            if(num> max){
                max=num;
            }

        }
        System.out.println("max = " + max);
        scan.close();



    }
}
