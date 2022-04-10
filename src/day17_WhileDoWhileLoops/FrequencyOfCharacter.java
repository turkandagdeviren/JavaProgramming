package day17_WhileDoWhileLoops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        /*
        1. Write a program that can return the frequency of a char from a String
			Ex:
				str = "AAABBBC"
				ch = 'A'
			Output:
				3
         */

        int frequency= 0;
        String str= "AAABBBC";
        char ch='A';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){ //char eachChar = str.charAt(i); diye atayabilirim de.
                frequency++;

            }
        }

        System.out.println("frequency = " + frequency);






    }
}
