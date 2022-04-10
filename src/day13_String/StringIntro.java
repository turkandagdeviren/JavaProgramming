package day13_String;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {

   // String is presented in "java.lang" package and so it can be imported implicitly.
        String name ="Wooden Spoon"; //all the objects we create are stored in the Java heap (memory location)
        // all the local variables that you are creating don`t take extra memory, they a§re stored in the stack

        //Scanner input (input=>local variable) = new Scanner (System.in) => object;

        String variable1 ="Wooden Spoon";
        String variable2= "Wooden Spoon";
        String variable3= "Wooden Spoon"; //bu objectlerin 3 u icin heap, String poolun icinde sadece 1 tek object tutar.

        System.out.println(variable1== variable2); //true

        String str1= new String("Java");
        String str2= new String ("Java"); //heap burada herbir object i String poolun
                                                // disinda ve ayri ayri objectler olarak tutar.

        System.out.println(str1==str2); //false

        System.out.println("-----------------------");
        String s1= "Java";
        String s2= new String ("Java");
        System.out.println(s1.equals (s2)); // bu equal iki degerin icerigine bakar

        String s3= "Java";
        String s4= new String ("java"); // string buyuk/kucuk harfe duyarlidir

        System.out.println(s3.equals (s4));

        //charAt (index): returns the character at the given index, returns char

    }
}
