package day38_Inheritance.carTask;

public class BMW extends Car{


    public BMW(String model, String color, int price, int miles) {
        super("BMW", model, color, price, miles);
    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand+ " "+ model+ " is a racing car");
    }

}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */