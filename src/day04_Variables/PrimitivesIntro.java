package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age: 38 years old

        byte age = 38;
        //weight: 160 pounds

        // byte weight = 160; 160 is out of byte range
        // byte num = -129; -129 is out of byte range

        short weight = 160; // 160 is within the range of short

        // salary: 100000 $
        //short salary = 100000; //100000 is out of short range
        int salary = 100_000; // int is preferred data type for integer numbers

        // int asset = 3,333,333,333; // 3,333,333,333 is out of the int s range

        long asset = 3_333_333_333L; // if the range is out of int we will add L or l to the number

        //tax: 0.26

        double tax1 = 0.26;
        float tax = 0.26F; // if we use float we will add F to the end of the number

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 =116;
        System.out.println("ch3 = " + ch3);

        char ch4 = 116;
        char ch5 = 117;
        char ch6 = 114;
        char ch7 = 107;
        char ch8 = 97;
        char ch9 = 110;

        System.out.print(ch4);
        System.out.print(ch5);
        System.out.print(ch6);
        System.out.print(ch7);
        System.out.print(ch8);
        System.out.println(ch9);

        char gender ='F';
        char grade = 'F';
        char yesNo = 'Y'; // we use char for only single characters, we use string for the
        // sequence of the characters

        char ch10 = 35000;
        System.out.println(ch10);

        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300 ; // which is false

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("name = " + name);
































    }





}
