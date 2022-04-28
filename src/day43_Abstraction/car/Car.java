package day43_Abstraction.car;

public abstract class Car {

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        if(year<1886){
            throw new RuntimeException("invalid year: "+ year);
        }
        this.year = year; // setter i olmadigi icin eger bi condition olacaksa sadece constructorda konulabilir. ve condition oncesinde yazilir ki sarta uymuyorsa hic set edilmesin

        if(price<=0){
            throw new RuntimeException("invalid price");
        }
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void stop();
    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
