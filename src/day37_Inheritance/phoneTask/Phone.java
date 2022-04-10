package day37_Inheritance.phoneTask;

public class Phone {// parent class: only contains the common features of all the subclass

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;
    public static boolean hasBattery;

    //constructor subclassa inherit etmez
    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    static{
        hasBattery=true; // birden fazla asamada assign edilen variablelar icin static blok aciyoruz.herzaman sart degil. static variable i tek seferde assign edebiliyorsak ihtiyac yoktur
    }                    // mesela bu ornekte boolean hasBattery=true tek seferde atanabilir, oyuzden bu statik blok sart degil

    public void call(long phoneNumber){
        System.out.println(brand+" "+ model+ "is calling"+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+" "+ model+ "is texting"+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }
}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */