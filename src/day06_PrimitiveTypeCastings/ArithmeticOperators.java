package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12"+ 1); //121, concatenation
        System.out.println(10+20); //30, addition
        System.out.println(100 -50); //50, subtraction
        System.out.println(10*6); //60, multiplication

        System.out.println(100/3); //33
        System.out.println(10/4); //2
        System.out.println(10.0/4); //2.5
        System.out.println((double) 10/4 ); //2.5
        System.out.println(10/(double)4); //2.5
        System.out.println(10d/4); //2.5


        System.out.println("--------------------------");
        int a =100;
        double b =a/6; // in math 16.6666 in java: 16.0 (since it is assigned to double,
        // when int is assigned to double it is implicit casting)

        System.out.println(b);

        double c= a/6.0; //16.66666 (decimal bir sayiya boldugumuz icin sonuc artik 16.666 olacak, 6.0/ 6d
        System.out.println(c);

        System.out.println(100d); //100.0

        /*

        +: addition
        -: subtract
        *: multiplication
        /: division

        integer/integer ===> integer
        integer/decimal ===> decimal
        decimal/integer ===>decimal
        decimal/decimal ===> decimal

        in math: 10/4: 2.5


        in java: 10/4: 2
        10.0/4: 2.5 or 10/4.0: 2.5 or 10.0/4.0: 2.5

        %: remainder



         */




    }






}
