package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // >, >=, <, <=

        boolean result1 = 200 > 40; // true
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; // true
        boolean result3 = 150>= 150; // true

        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        boolean result4 = 300< 100; // false
        System.out.println("result4 = " + result4);

        //credit score = 720

        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720; // if the credit is 720 or greater, then it is eligible for loan

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);


        boolean result5 = 100< 120; // true
        System.out.println("result5 = " + result5);

        boolean result6 = 200<100; //false
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score <=59; // true
        System.out.println("hasFailed = " + hasFailed);

        int score2 =75;
        boolean hasFailed2 = score2 <=59;
        System.out.println("hasFailed2 = " + hasFailed2);

        boolean result7 = 45<=60;
        System.out.println("result7 = " + result7);

        System.out.println( "_____________________");

        int x = 100;
        int y = 200;

        boolean equal = x==y; // false

        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; //false

        System.out.println("result8 = " + result8);
        boolean result9 = 'A' =='a'; //false

        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //true

        System.out.println("result10 = " + result10);

        boolean result11 = "Java   " == "Java  "; //false (even spaces should be exactly the same)
        System.out.println("result11 = " + result11);

        System.out.println("____________________________________");

        boolean result12 = 100!= 200; //true
        System.out.println("result12 = " + result12);

        boolean result13= "Java" != "Java"; //false

        System.out.println("result13 = " + result13);




















    }


}
