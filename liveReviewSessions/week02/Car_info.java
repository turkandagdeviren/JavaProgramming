package week02;

public class Car_info {
    public static void main(String[] args) {

        //I want you to give example of the car that you will buy after you have a well paid job

        int year = 2022;
        String make = "Volvo";
        String model = "v80";
        //automatic = true; manual= false
        boolean transmission = false;
        String color = "grey";
        int milage = 0;
        long price =100000; //for Europe

        System.out.println(year +" "+ make + " " + model+"\nAutomatic Transmission :"+transmission);
        System.out.println(color+" "+milage+" kilometers "+price+ "Euros");

        double priceInTL = price*15.5;
        double taxRate = 1.80; // for this kind of cars
        double priceAfterTaxInTL =priceInTL + (priceInTL*taxRate);
        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);

        //variables are used because it makes our data reusable and maintainable





    }




}
