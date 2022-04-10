package day33_Statics;

public class IPhone {

    public static String brand = "Apple"; // it is static because all the iphones has the same brand

    public String model;

    public double price;

    public static String OS="iOS";

    public String size;

    public static String madeIn ="China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;


   // public static void printModelAndPrice(){
    //    System.out.println(model+": "+price);//static method doesnt accept instance variables
   // }

    public void method1(){
        System.out.println(model+ " : "+price);
        System.out.println(OS);
    }

    public static void printOperatingSystem(){
        System.out.println(OS);
    }




}
