package day12_Scanner;

//import java.util.*; //wild import: imports everything from the package but it takes so much memory
import java.util.Scanner; //regular import: imports one class

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("enter a number between 1 to 7:");

        //scan.nextInt(); //variable in reusable olmasini istiyorsan bu sekilde atarsin

        int num= scan.nextInt();
        String result ="";

        if(num>=1 && num<=7){
            result =(num==1)? "monday" : (num==2)? "tuesday" : (num==3)? "wednesday"
                    : (num==4)? "thursday": (num==5)? "friday" : (num==6)? "saturday": "sunday";


            } else{ result ="invalid number";


        }
        System.out.println(result);
        scan.close();

    }

}
