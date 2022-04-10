package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //input: herhangi bir anlamli kelime olabilir
        System.out.println("Enter an integer:");
        int num1= input.nextInt(); // burada input u reusable bir variable haline getirmis oluyoruz

        System.out.println("enter a decimal number: ");
        double num2 = input.nextDouble();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1*num2);

        input.close(); //closes the scanner. code un performansinin dusmemesi icin
        // boyle kapat ama bunu yazinca artik scanner method kapanir

      /*
      int num3 = input.nextInt();
        System.out.println(num3);

       */





    }
}
