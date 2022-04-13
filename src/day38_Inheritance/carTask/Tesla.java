package day38_Inheritance.carTask;

<<<<<<< HEAD
import java.lang.Object;

public class Tesla extends Car {


    public Tesla(String model, int year, int price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+ " in autopilot mode");
    }
=======
public class Tesla {
>>>>>>> parent of d8477e6 (day38: Inheritance - Method Overriding)

    @Override
    public void start() {
        System.out.println("Say \"start\" to start "+brand+ " "+ model);
    }
}
