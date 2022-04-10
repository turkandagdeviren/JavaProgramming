package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

     Iphone iphone= new Iphone("Iphone 12", "6.7 inches",1000, "black");
     Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "white");
     Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println(iphone.color); // we can call the instance variables by object name

        iphone.call(911);
        iphone.text(12345678);
        iphone.faceTime(678965436);
        iphone.faceTime("abs@gmail.com");

        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

        System.out.println("-------------------------------------------------");

        System.out.println( Phone.hasBattery ); // we can call the static variables by class name
        System.out.println( Iphone.hasBattery );
        System.out.println( Samsung.hasBattery );
        System.out.println( Nokia.hasBattery );


    }
}
