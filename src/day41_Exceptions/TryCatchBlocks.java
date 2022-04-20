package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {


        System.out.println("test1 started");

        try{
            System.out.println(9/0);

            System.out.println("Try Block");

        }catch(ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");


        }

        System.out.println("test1 completed");

        System.out.println("----------------------------------");

        System.out.println("test2 is started");

        int[] numbers= {1,2,3,4,5};

        try {
            System.out.println(numbers[200]);


            System.out.println("Try Block");


        }catch(RuntimeException e){ //her zaman exception in ne tur oldugunu bilemeyecegimiz icin ve hepsi Runtime a bagli oldugu icin RuntimeException i kullanabiliriz

           //  e.printStackTrace(); // -> prints a stack trace (full details) of the exception. en cok kullanilan methoddur

         //   System.out.println((e.getMessage())); //-> returns only brief description of the exception

        }

        System.out.println("test2 completed");

        // if we dont know the specific class of the unchecked exception we can always use Runtime Exception but for the checked exception we use specific class

        System.out.println("----------------------------------");

        System.out.println("test3 is started");


       try {
            System.out.println("Cydeo".substring(2, 0));

        } catch(RuntimeException e){ //parent exception can handle the child exceptions
                                     // the object of the exception will be assigned to this "e" variable
           // e.printStackTrace();
        }

        System.out.println("test3 completed");

        System.out.println("----------------------------------");

        System.out.println("Hello");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Cydeo");


        System.out.println("----------------------------------");

        try {
            FileInputStream file= new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
