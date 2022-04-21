package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

// if you are not going to call this main method at anywhere else throws keyword would be the better solution
    //however if you have to call this method in somewhere else id you use throws keyword the caller of this method would be still responsible for handling this exception
    /*
 the advantage of try&catch block: it permanently handles the exception. it is permanent solution.
//try& catch can be used for checked and unchecked exceptions.
//throws can be used for handling checked exceptions ONLY. it is the fastest way to get rid of compilation errors caused by checked exceptions
// the disadvantage is that it is temporary (throws yazilan method icin handle eder ama o method baska bir methodda cagrildiginda handle edemez)
//throws is the cheap way of handling the exceptions
//advantage of the throws keyword you dont have to add additional code fragments. only the method signature is going to check.
//even though try&catch block uses multiple blocks to handle the exception it is the best solution for handling.
     */


    public static void main(String[] args)  {
        System.out.println("Hello");
       // sleep(2.5); //throws
        System.out.println("hello world");

        System.out.println("----------------------------");

        System.out.println("Hello");
        MorningWorkOut.sleep(2.5); //try&catch
        System.out.println("Cydeo");





    }

    public static void sleep(double seconds) throws InterruptedException {

            Thread.sleep((long)(seconds*1000 ));

        }
    }

