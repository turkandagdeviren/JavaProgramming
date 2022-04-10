package day16_ForLoopAndString;

public class Palindrome {
    public static void main(String[] args) {
/*
"java"==> (not palindrome
Anna ==> palindrome
level
racecar


 */
        String word ="Civic";
        String reversed ="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+=word.charAt(i);

        }
        boolean isPalindrome= word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);




    }
}
