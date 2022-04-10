package week03;

public class DifferenceBetweenAndOrBitwiseOperators {
    public static void main(String[] args) {

        int i1= 5;
        int i2 = 10;

        System.out.println(true | false); //true
        System.out.println(true || false); //true again but doesnt check the second part of the statement
        System.out.println(i2>i1 | i1> i2); //true it goes to the second part too



        /*

        & - (Condition 1 & Condition 2): checks both cases even if first one is false

&& -   (Condition 1 && Condition 2): doesn't bother to check second case if case one is false

&& - operator will make your code run faster, professionally & is rarely used

| - (Condition 1 | Condition 2): checks both cases even if case 1 is true

|| - (Condition 1 || Condition 2): doesn't bother to check second case if first one is true

|| - operator will make your code run faster, professionally | is rarely used
         */


    }


}
