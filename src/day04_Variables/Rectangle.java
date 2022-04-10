package day04_Variables;
/*
task: create a class named Rectangle, write a program that can calculate the area& perimeter of any given Rectangle

length
width

area = length * width
perimeter = 2 * (length + width)

 */
public class Rectangle {
    public static void main(String[] args) {

        double length = 5.5; // kenar sayisi decimal oldugu icin double,
        // buraya 10 yazarsak run ettiginde 10.0 olarak sonuc verir

        double width = 6;
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("length = " + length + "cm");
        System.out.println("width = " + width + "cm");
        System.out.println("area = " + area + "cm2");
        System.out.println("perimeter = " + perimeter + "cm");



    }

}
