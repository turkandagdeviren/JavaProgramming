package day40_FinalKeyword;

public class ProtectedAccessModifier {

    //always visible within the same package
    // visible outside the package in subclass ONLY

    static String name1= "Cydeo"; //default access modifier. it can be inherited only to the classes in the same package. static variables can be called by class name in the same package
    protected static String name2 ="WoodenSpoon"; //protected. it could be visible if the class is subclass


    static void method1(){

    }

    protected static void method2(){

    }





}
