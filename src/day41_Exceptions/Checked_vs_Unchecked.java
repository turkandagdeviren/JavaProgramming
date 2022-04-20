package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;


public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exception:

        int a = 10;
        int b = 0;

     //   System.out.println(a/b); // bu noktada runtime da error olusur ve bundan sonrakileri okumaz
        // kalan koda da zarar verecegi icin bunu handle etmemiz gerekir.

        char[] characters= {'A','B','C'};

      //  System.out.println(characters[99]); //it is not possible to execute 99. index. during the compile time there is no problem and problem will occur under runtime, so it is unchecked

        Student student = null; // constructor yerine null koyduk diyelim. bu object mi hayir. o yuzden bu student hic create edilmedi.

       // System.out.println(student.getName()); // unchecked exception. olusturulmus bir object olmadigi icin instance method kullanamayiz


        final String str= "Wooden Spoon"; // bunun garbage collection icin eligible olmasini istemiyorsak final yapariz cunku final variables reassign edilemez
       // str= null; // null nothing demektir ve object degildir. boyle olunca bir onceki satir garbage collection icin eligible olur. olmamasini istiyorsak basina final yazmamiz gerek

        // in order to use instances we need object

      //  System.out.println(str.toUpperCase());

        String str2= "";
        System.out.println(str2.isEmpty()); // true // object != null, object == null demek boyle bir object hic yok demek, str2 null degil, emptydir ve objecttir ve exist tir


        //blank means there is no special character other than space.
        // empty and blank are different than null


        // checked exception: it occurs during compile time when we are writing code. we can not compile code and can not run before we fix it

        System.out.println("Hello");

       // Thread.sleep(3000); checked exception

        System.out.println("Cydeo");

      //  FileInputStream file = new FileInputStream("path of the file"); // checked exception

        System.out.println("Java".charAt(10000)); // unchecked exception

        // all types of runtime exceptions are unchecked exceptions. if it is not about runtime it is checked exception

        // unchecked & checked -> exception-> throwable

        // error is a kind of object and different than exception











    }

}
