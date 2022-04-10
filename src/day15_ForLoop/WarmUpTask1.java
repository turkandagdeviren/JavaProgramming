package day15_ForLoop;

import java.util.Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {


        System.out.println("enter a word:");
        String word = new Scanner (System.in).next();// sadece 1 input alacaksan boyle kullanabilirsin, close a da ihtiyac kalmaz
        if (word.charAt(0)=='x'){
            word= word.replaceFirst("x","a");
        }
        System.out.println(word);
    }
}
