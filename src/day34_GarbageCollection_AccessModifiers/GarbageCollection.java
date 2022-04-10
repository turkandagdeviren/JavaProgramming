package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;
/*
Garbage collection: collection of unreferenced objects.
unreferenced objects:
1. null keyword:
String str="Java";
str= null;
2.creating a new object:
String str="Java";
str="Python";

Garbage Collector: responsible for collecting the unreferenced objects from java heap. and destroys it ( finalize())


 */
public class GarbageCollection {
    public static void main(String[] args) throws Throwable {
        //new GarbageCollection().finalize();

        String str = null; // null means nothing is created and it is empty, "" ile ayni sey degil
        //int n= null primitive variables can not be null
        // as soon as there is a reference for a variable it is not eligible for garbage collection

        String str1="Wooden spoon"; // after line 12 "wooden spoon" will be eligible for garbage collection
       str1= null;
        System.out.println(str1);

        Car car1= new Car("Toyota");
        car1= null; // null // bu satir yokken-> Car{brand='Toyota', model='null', color='null', year=0, price=0.0}
        System.out.println(car1);
        System.out.println("--------------------------");

        Dog dog1= new Dog();
        dog1.name= "Lucy";
        dog1= new Dog();
        dog1.name= "Max"; // bu satirdan sonra artik Lucy unreferenced oldu ve garbage collection icin eligible olur

        System.out.println(dog1);

        String language= "Python";
        language="Java"; // buradan sonra python unreferenced oldu ve garbage collection icin eligible oldu
        System.out.println(language);

        System.out.println("-----------------------------------");

        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = list1;
        list2.addAll(Arrays.asList(200,300,400));
        //bu durumda 2 farkli isimde tek bir object var (new ArrayList<>() ) o yuzden ikisi de unreferenced degil

        System.out.println(list1==list2);
        System.out.println("--------------------------------");


        Student student1= new Student("Tahir", 30, 'M', 'B', 14);
        Student student2= student1; //student1 and student2 tek bir object in reference name i olmus oldu

        System.out.println(student1);
        System.out.println(student2);
        student2.grade= 'A';
        student2.name= "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("----------------------------------");
        
        ArrayList<String>l1= new ArrayList<>();
        l1.add("Java");
        ArrayList<String>l2= new ArrayList<>(); // burada l1 ve l2 farkli 2 objecte referense olan 2 farkli variable


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        ArrayList<String>l3= new ArrayList<>();

        ArrayList<String>l4= l3; //burada l3 ve l4 1 objecte referense olan 2 ayri name
        

    }


}
