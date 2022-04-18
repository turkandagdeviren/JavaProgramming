package day40_FinalKeyword;

public final class Cat extends Animal{
//class final oldugunda artik parent olamaz. it can not be extended
    //final bir classtan bir methodu override edemeyiz cunku overriding icin inheritance gerekli.
    //ant method in java can be overloaded (even final methods)


    public Cat(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }



}


