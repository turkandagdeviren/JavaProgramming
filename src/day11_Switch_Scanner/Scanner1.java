package day11_Switch_Scanner;
import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        //1. ask the user to enter an integer number
        System.out.println("enter an integer number:");
        int num1 = input.nextInt();
        //2. ask the user to enter a decimal number;

        System.out.println("enter a decimal number:");
        double num2 = input.nextDouble();
        //3- ask the user to enter a word
        System.out.println("enter a word");
        String str = input.next(); //sadece next dersen sadece ilk space e kadar okur,

        // yani 2 kelimelik bir yazinin ikinci kelimesini almaz oyuzden nextLine kullaniyoruz

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str);
        input.close();






    }
}
