package day39_Recap.shapeTask;

public class Square extends Shape {

    //before giving the extends word add additional variables

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.out.println("invalid size: "+ side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(String name, double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + '\'' +
                    ", area='" + area() + '\'' +
                    ", perimeter='" + perimeter() + '\'' +
                    '}';
    }
}
/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */