package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

// import static package name class name. static member ( static member olarak * koyarsak oradaki tum static variablelari import edebilir hale gelir


public class StaticImport {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println((pi));// static import bir kere import edildiginde "class name. " olarak cagirmaya gerek kalmaz







    }

}
