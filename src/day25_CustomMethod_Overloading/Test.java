package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        StringUtility.reverse(str);
        System.out.println();

        System.out.println("-----------------------");

        String s1 = "Wooden Spoon";
         s1 = StringUtility.reverse(s1);
        System.out.println(s1);

        System.out.println("-----------------------");

        String word  = "Civic";
        boolean palidrome = StringUtility.isPalindrome(word);
        System.out.println("palidrome = " + palidrome);

        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }

        }

        System.out.println("count = " + count);

        System.out.println("-----------------------------------------");

        String s2 = "aaaaabbbbbbccccddddd";

        s2 = StringUtility.removeDuplicates(s2);
        System.out.println(s2);





    }
}
