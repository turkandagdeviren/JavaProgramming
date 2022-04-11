package day38_Inheritance.carTask;

public class Tesla extends Car {

    public Tesla(String model, String color, int price, int miles) {
        super("Tesla", model, color, price, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+ " in autopilot mode");
    }

}
