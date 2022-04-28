package day43_Abstraction.car;

public final class Audi extends Car { // bu class in metodlari baskasi tarafindan inherit edilmesin diye final class yaptik

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("push the start button");
    }

    public void autoPark(){
        System.out.println(getMake()+ " "+ getModel()+ " has auto park feature");
    }






}
