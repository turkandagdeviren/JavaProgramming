package week02;

public class Primitives_Example {
    public static void main(String[] args) {

        /*
        DataType variableName = Value; Declare and initialize at the same line

        DataType variableName;

        variableName= value;

        DataType variableNameOne, variableNameTwo;


         */
        byte num1; //this is declaring a value

        num1= 123; // initializing a variable, assigning a value
        num1= 121; //re-assign a value

        short num2= 12398; //Declare and initialize at the same line
        int distance = 1_000_000_000;

        long distanceMore = 3_000_000_000L; //we have to put to define the variable as long
        long distanceShorter = 1_000_000_000; //if it does not pass the limit then we dont have to give

        float rate= 1000.5F;
        double dNumber= 123.6;
        System.out.println("-----");


        //explicit: you are doing it yourself ---- implicit: compiler is doing that

        //explicit = manually = narrowing
        //implicit  =compiler = widening

        //you might need to swap or re-assign som different range of values
        num2 = num1;  // i am assigning num1 to num2



        System.out.println("num2= "+ num2);

        num2= (short) distance; //narrowing, done manually, possibility of loosing data
        System.out.println("num2 = " + num2); //concatination
        short rateTwo = (short) rate;
        System.out.println("rateTwo = " + rateTwo);











    }



}
