package day42_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {


        throw new NoSuchElementException("There is no such element as break");

        //throw new Rectangle(5,7); // it gives compile error because it is not exception object

      //  System.out.println("hello world"); -> once we use the throw keyword compiler knows there is an exception (line 11) we can not write new fragment codes

      //throw new InterruptedException(); -> we can not use the throw keyword with checked exception




    }
}
