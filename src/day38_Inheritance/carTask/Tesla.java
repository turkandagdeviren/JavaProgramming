package day38_Inheritance.carTask;


import java.lang.Object;

public class Tesla extends Car {


    public Tesla(String model, int year, int price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot() {
        System.out.println(brand + " " + model + " in autopilot mode");
    }
}
