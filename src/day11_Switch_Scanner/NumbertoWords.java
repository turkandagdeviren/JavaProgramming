package day11_Switch_Scanner;

public class NumbertoWords {
    public static void main(String[] args) {
        /*
        Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary


         */

        int n=10;


        String result = (n>=0 && n<=9)? (n==0)? "zero": (n==1)? "one": (n==2)? "two": (n==3)? "three": (n==4)? "four"
             :(n==5)? "five" :(n==6)? "six" :(n==7)? "seven" : (n==8)? "eight": "nine": "invalid";

        System.out.println(result);


    }
}
