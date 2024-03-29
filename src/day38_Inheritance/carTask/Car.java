package day38_Inheritance.carTask;

public class Car {
    public String brand, model, color;
    public int price, year;
    public int miles;

    public Car(String brand, String model, int year, int price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year= year;
        this.price = price;
        this.color = color;
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
                ", year=" + year +
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

