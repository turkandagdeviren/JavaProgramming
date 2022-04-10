package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("enter your first name:");
        String firstName = scan.next(); // Java

        System.out.println("enter your last name:");
        String lastName = scan.next();
        scan.close();
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = ""+f+"."+ l; //basa "" koyarak char i stringe cevirmis olduk
        System.out.println("initial = " + initial);



    }
}
