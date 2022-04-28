package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    // it creates exception, it doesn't handle exception. it is used for manually creating exception
    // for ex to terminate program

    public static void main(String[] args) {

        System.out.println("enter your age:"); // -20

        int age= new Scanner(System.in).nextInt();

        if(age<0){
         /*   System.err.println("invalid age: "+ age);
            System.exit(1);  */

            throw new InputMismatchException("Age can not be negative: "+ age); // exception classindan yeni bir object create ettigimiz icin new kelimesini kullaniyoruz
        }

        if(age>21){
            System.out.println("you are eligible");
        }else{
            throw new RuntimeException("you must be at least 21 years old");
        }


    }






}
