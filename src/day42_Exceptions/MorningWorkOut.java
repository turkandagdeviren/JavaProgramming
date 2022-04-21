package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("--------------push up started-----------------");

        for (int i = 1; i <= 30 ; i++) {

            System.out.print("\rpush up "+ i);

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n--------------push up completed-----------------");

        System.out.println("--------------pull up started-----------------");

        for (int i = 1; i <= 20 ; i++) {

            System.out.print("\rpull up "+ i);

            sleep(1.5);


          /*  try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */ // bunun yerine sleep method u olusturduk her seferinde threadi try catch yapmamak icin




        }

        System.out.println("\n--------------pull up completed-----------------");

    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000 ));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
/*
1. Do 30 push-ups and try pausing 1.5 seconds in each

2. Do 20 Pull-ups and try pausing 2.5 seconds in each

 */