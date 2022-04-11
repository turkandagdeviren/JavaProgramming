package day38_Inheritance.carTask;

public class Car {
    public String brand, model, color;
    public int price;
    public int miles;

    public Car(String brand, String model, String color, int price, int miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand+ " "+ model + " is starting");
    }
    public void drive(){
        System.out.println(brand+" "+ model+ " is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }

}


    /*
    Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

		Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()

			2. BMW:
					extra methods:
						breaksDown()
						racing()

			3. Tesla:
					extra methods:
						autoPilot();
     */

