package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String word= "Cydeo";
        
        char thirdChar= word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);
        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
        */
        System.out.println("-----------------------------");

        String s1= "Batch 25 is the best batch";
        
        int totalChars= s1.length(); //length gives the total number of the characters as int
        System.out.println("totalChars = " + totalChars);
        
        char lastChar = s1.charAt(s1.length()-1); //it will give us the last character (since char index starts with 0)
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------------");
        String str ="wooden spoon";
        str= str.toUpperCase(); //it creates a new string object as WOODEN SPOON. (basina str olarak atamasaydik str "wooden spoon"olarak kalirdi

        System.out.println(str);


        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();//this creates a new object

        System.out.println(sentence);
                
                
                

    }
}
