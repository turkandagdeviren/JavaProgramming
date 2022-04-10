package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char [26];

        char c= 'Z';
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = c;
            c--;

        }

        /*for(char i=0, j='Z'; i< alphabets.length; i++,j--){
            alphabets[i]= j;
        } */

        System.out.println(Arrays.toString(alphabets));













    }
}
