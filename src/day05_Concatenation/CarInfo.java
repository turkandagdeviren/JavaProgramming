package day05_Concatenation;

import org.w3c.dom.ls.LSOutput;

public class CarInfo {

    public static void main(String[] args) {
        int year = 2018;
        String make = "Toyota",
                model = "Camry";
        int miles = 50000;
        String color ="Red";
        int price = 19000;

        String carInfo = year + " "+ make+ " "+ model+ ", " + miles +" miles" + ", "+ color + ", " + "$"+ price+ ".";

        System.out.println(carInfo);




    }




}
