package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n =100;
        if (n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println("-------------");
        String result1 = (n%2==0)? "even" : "odd";
        System.out.println(result1);

        int age =17;
        /*if (age>=21){
            System.out.println( "eligible");
        }else{
            System.out.println("not eligible");
        }*/

        String result2= (age>=21)? "eligible" : "not eligible";
        System.out.println(result2);

        System.out.println("-------------");

        int number =100;
        /* (number>0){
            System.out.println("positive");
        }else if (number<0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        } */

        String result3 = (number>0)? "positive" :(number<0)? "negative" : "zero";
        System.out.println(result3);









    }
}
