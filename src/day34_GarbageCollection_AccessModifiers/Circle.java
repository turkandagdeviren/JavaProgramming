package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer>numbers; // set icin birden fazla asama gerektiren durumlarda da statik yazmak gerekir

    public Circle (double radius){ //constructor a static variables lari yazma
    this.radius= radius;
    // pi=3.14; not efficient because it will run every time
    }

    static{ //bu bloklara instance variables ekleyemiyoruz //static blocklar 1 kere run eder.// bu bloklari statik veriler icin kullaniriz
        pi=3.14;
        name="Circle";
        numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    }


    /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
*/
}
