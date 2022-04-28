package day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {

       //  Car car1= new Car();-> we can not create object from Abstract class, because abstract class is not concrete

        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        //make model ve year final oldugu icin burada constructorun icinde bir kere atadiktan sonra bir daha degistiremeyiz


        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("red");
        audi.setColor("pink");
        tesla.setColor("green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);



    }
}
