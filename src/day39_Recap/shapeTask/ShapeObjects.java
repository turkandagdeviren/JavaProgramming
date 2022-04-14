package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);// name i zaten square olarak belirledigimiz icin sadece side i girdik

        System.out.println(square);
        //  square.side= -100000; // side private oldugu icin bu sekilde alamiyoruz, set kullanmamiz gerek

        //square.setSide(-1111); error verir

        square.setSide(15);
        System.out.println(square);
        System.out.println("-------------------------------------------------");
        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println(rectangle);
        rectangle.setLength(10);
        System.out.println(rectangle.getLength() );
        System.out.println(rectangle);

        System.out.println(rectangle.perimeter());

        //System.out.println(rectangle.name);-> name private variable oldugu icin boyle dogrudan cagiramam
        System.out.println(rectangle.getName());

        System.out.println("-------------------------------------------------");

        Circle circle = new Circle(7.5);
        System.out.println(circle);

        circle.setRadius(15.5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getName());


    }
}
