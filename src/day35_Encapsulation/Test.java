package day35_Encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

       String s= "I will find the lost book";
       String word="";
       for(int index= s.length()-1; index <=0; index--){
           word+=s.charAt(index);
       }
        System.out.println(word);



    }
}
