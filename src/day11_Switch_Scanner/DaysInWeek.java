package day11_Switch_Scanner;

import java.sql.SQLOutput;

public class DaysInWeek {

    public static void main(String[] args) {

        int number= 5; // compiler dogrudan 5i execute eder, digerlerini check etmez ama if te yukardan asagi kontrol ederek gider

        switch(number){ //1,2,3,4,5,6,7 == sadece equal durumlarinda kullanilabilir

            case 1:
                System.out.println("monday");
               break; //exists the switch after executing the case block
            case 2:
                System.out.println("tuesday");
               break;
            case 3:
                System.out.println("wednesday");
               break;
            case 4:
                System.out.println("thursday");
               break;

            case 5:
                System.out.println("friday");
               break; // burada break olmazsa hem friday i hem saturday i (orada 6 olsa bile) yazdirir. ya bir sonraki break'e ya da
            //curly brace e kadar execute e devam eder. break i gorunce case blockdan artik cikar

            case 6:
                System.out.println("saturday");
               break;

            case 7:
                System.out.println("sunday");
               break;
            default: //default u en sona yazdiysak sonrasinda break yazma ihtiyacimiz yok, closing curly brace var zaten en sonda
                System.out.println("Invalid");
                break; //default u diger caselerin arasinda da yazabiliriz, en sonda olmasi gerekmez (o durumda break i unutma)

                //default: gets executed only if none of the case blocks are matching


        }



    }

}
