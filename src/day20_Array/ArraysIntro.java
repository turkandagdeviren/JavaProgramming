package day20_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // create a variable that is capable enough to contain 5 names

        String [] myGroup = new String[4];
        myGroup[0] = "Mete";
        myGroup[1] = "Turkan";
        myGroup[2] = "Ilker";
        myGroup[3] = "Kerem";

        // System.out.println(myGroup); //hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("-----------------");

        String[] days= {"monday", "tuesday","wednesday","thursday","friday","saturday","sunday"};
        System.out.println(Arrays.toString(days));

        //days[7] = "javaday"; // boyle eklesek dahi bu arraye dahil olmaz
        int number=1;
        if(number<1|| number>7){
            System.err.println("invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]); //cumayi yazdirmak istiyorsak















    }
}
