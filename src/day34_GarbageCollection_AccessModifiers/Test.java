package day34_GarbageCollection_AccessModifiers;

import static utilities.MathUtility.*;

public class Test {
    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers); // main methodla atayip yazdirdigimizda bunlara circle classta main method icinde atadigimiz degerlerle yazmayacaktir.
        // cunku main method sadece bulundugu class in icinde run eder, o yuzden static block icinde atamak gerekir ki variablelari burada da kullanabilelim.


        System.out.println("--------------------------------");
        //Find the sum of 10,20
        int r1= sum(10,20); // mathUtilityden import ettik ve classname i bile yazmamiza gerek olmadi


        //find the sum of 100,200
        int r2= sum(100,200);
        int r3= max(1000,2000);





    }






}
