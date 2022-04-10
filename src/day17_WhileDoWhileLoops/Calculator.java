package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter your first number:");
        int num1= scan.nextInt();
        System.out.println("enter your second number:");
        int num2= scan.nextInt();
        System.out.println("enter a math operator:");
        char ch = scan.next().charAt(0); // char i nextte yazdirabilmek icin ilk yazdigi karakteri almasi icin boyle yazdik
        while (!(ch =='+'|| ch == '-')) {
            System.err.println("invalid operator, please re-enter:");
            ch= scan.next().charAt(0);
        }

        System.out.println((ch=='+')? num1+num2 : num1-num2);

        scan.close();







    }
}
