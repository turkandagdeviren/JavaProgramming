package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        /*

        Write a program that can print the maximum number between two numbers, if both are equal then print Equal
			Ex:
				n1= 100, n2 = 200;
			output:
				200 is maximum number
         */

        int n1= 200,
                n2 = 200;

        boolean n1IsMin = n1< n2;
        boolean n2IsMin = n1> n2;
        boolean equal = n1 == n2;

        if (n1IsMin){
            System.out.println(n1 +" is the minimum number");
        }

        if(n2IsMin){
            System.out.println(n2 +" is the minimum number");

        }

        if (equal){
            System.out.println(n1 +" is equal to "+n2);

        }



    }
}
