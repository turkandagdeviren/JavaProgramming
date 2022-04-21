package day42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("-------Test 1-------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-------Test 1 completed-------");

        System.out.println("-------Test 2-------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch EU 08");

        System.out.println("-------Test 2 completed-------");






    }
}
//throws is used for handling checked exceptions ONLY. it is the fastest way to get rid of compilation errors caused by checked exceptions
// the disadvantage is that it is temporary (throws yazilan method icin handle eder ama o method baska bir methodda cagrildiginda handle edemez)
//throws is the cheap way of handling the exceptions