package day38_Inheritance.carTask;

<<<<<<< HEAD
public class BMW extends Car{


    public BMW(String model, int year, int price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand+ " "+ model+ " is a racing car");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic to jump start "+ brand +" "+model);
    }
=======
public class BMW {
>>>>>>> parent of d8477e6 (day38: Inheritance - Method Overriding)
}
