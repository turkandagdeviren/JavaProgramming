package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


/*throws kullandigimiz method bir baska method icinde cagrildiginda, throws sorunu cozmedigi icin, exception hala orada oldugu icin
metodu cagirinca yine exception ortaya cikar.throws un tek dezavantaji budur*/

// diyelim ki main method icinde hem checked hem unchecked exception var. unchecked olani tek yol olan try&catch ile handle ederiz,
// checked olani ise eger metodu baska bir yerde cagirmayacagimizdan eminsek throws ile handle edebiliriz

public class DisadvantageOfThrowsKeyword2 {


    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        method1();
        method2();
        method3();

        String str= null;
        try {
            System.out.println(str.charAt(0)); //unchecked exception
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }

    public static void method(){ //utility class olustururken olusan exceptionlari handle etmek icin en dogru yontem try& catch kullanmaktir
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public static void method1() throws InterruptedException {

      //  new FileInputStream("");
        Thread.sleep(3000);

    }
    public static void method2() throws InterruptedException {
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
