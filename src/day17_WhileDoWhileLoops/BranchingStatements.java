package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {


        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i+" ");//buraya yaziyoruz ki F i de okuyup yazsin

            if(i=='F'){
                break; //exits the loop
            }

        }

        System.out.println();
        System.out.println("-----------------------");
        Scanner scan = new Scanner (System.in);
        scan.close();

        while(true){
            System.out.println("Enter a number: ");
            int num=scan.nextInt(); // bu hep dogru oldugu icin sonsuz devam eder. o yuzden if li bir cikis condition yazariz

            if(num<0){
                break;
            }


        }






    }

}
