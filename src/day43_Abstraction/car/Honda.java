package day43_Abstraction.car;

public final class Honda extends Car {

    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void stop() {
        System.out.println("");
    }

    @Override
    public void start() {
        System.out.println("twist the key to ignition");

    }


}
