package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


/*throws kullandigimiz method bir baska method icinde cagrildiginda, throws sorunu cozmedigi icin, exception hala orada oldugu icin
metodu cagirinca yine exception ortaya cikar.throws un tek dezavantaji budur*/

public class DisadvantageOfThrowsKeyword2 {

    public static void method(){ //utility class olustururken olusan exceptionlari handle etmek icin en dogru yontem try& catch kullanmaktir
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    public static void method1() throws FileNotFoundException {

        new FileInputStream("");

    }
    public static void method2() throws FileNotFoundException {
      method1();  //burada exception yine ortaya cikar. method 2 yi de throws edelim method3te de yine exception olur
    }

    public static void method3() throws FileNotFoundException, InterruptedException { // bu methodu bir daha call etmeyecegimden eminsem throws keyword best solution olur
        method2();
        Thread.sleep(1000); // bunun icin yeni bir throws keyword daha gerekir-> interruptedException
    }

    public static void method4() throws FileNotFoundException, InterruptedException {
        method3(); // to be able to handle both of the exceptions in method3, we can add only Exception since it is the parent of both of them. but it is not recommended.
        // it is the best to use the specific class name that the compiler is telling us to use, rather than "Exception". because it is more efficient and compiler does not have to go over all the exceptions
    }

}
