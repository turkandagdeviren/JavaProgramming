package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year =2000;
        boolean leapYear = year %4 ==0;

        if (leapYear){
            System.out.println("year "+ year +" is leap year");
        }
        if (!leapYear) {
            System.out.println("year "+ year +" is not leap year" );
        }

        System.out.println("----------------------");
        if (leapYear){
            System.out.println("year"+ year+" is leap year");
        }else{
            System.out.println("year "+ year +" is not leap year");

        }
        //iki kere if li statement kullandigimizda ilk f dogru olsa bile compiler iki if i de okur,
        //ama else kullanirsak eger ilk bolum dogruysa artik run etmeye devam etmez, bu da kolaylik ve daha az is demektir
        //o yuzden iki secenekli durumlarda if else tercih ediyoruz

    }

}
