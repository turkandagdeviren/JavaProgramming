package day11_Switch_Scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("enter your first sentence:");
        String firstSentence = input. nextLine();

        System.out.println("enter your second sentence:");
        String secondSentence = input. nextLine();

        System.out.println("firstSentence = " + firstSentence);
        System.out.println("secondSentence = " + secondSentence);

        input.close();

    }
}
