package day11_Switch_Scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        System.out.println("enter your score:");
        int score= input.nextInt();
        input.nextLine(); //bu nextLine metodu bir baska tur metoddan sonra
        // kullandigimizda enter yazmamizi saglar.
        System.out.println("enter your full name:");
        String fullName = input.nextLine();

        System.out.println("score = " + score);
        System.out.println("fullName = " + fullName);
        input.close();

    }
}
