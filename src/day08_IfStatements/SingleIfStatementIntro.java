package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 301;
        /*System.out.println("Odd Number");
        System.out.println("Even Number");
        bunlardan birinin run etmesini istiyoruz sadece
        */

        boolean evenNumber = number%2 ==0;
        boolean oddNumber = ! evenNumber;

        if (evenNumber){ //even number
            System.out.println(number + " is even number"); // ==> if evenNumber is true then it will be executed

        }

        if(oddNumber){ //not even number
            System.out.println(number+ " is odd number");
            /*
            Single if: can be used creating condition for 1 possible outcomes
             */


        }

        System.out.println("_____________________");

        int n = 200;
        //positive

        if(n>0){ //if n is greater than 0 then it is positive
            System.out.println(n+" is positive");
        }

        //negative

        if(n<0){ // if n is less than 0 then it is negative
            System.out.println(n+" is negative");
        }
        // zero

        if(n==0){
            System.out.println(n + " is zero");

        }
    }



}
