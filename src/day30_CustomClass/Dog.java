package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize,String dogColor){
        name=dogName;
        breed= dogBreed;
        age= dogAge;
        gender= dogGender;
        size= dogSize;
        color=dogColor;

    }


    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void bark(){
        System.out.println(name+ " is barking");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';



    }
}
/*
attributes:
name, age, gender, breed, size, color (bunlar her bir kopekte olmasini istedigim ozellikler)
(instance variables: they can have seperate copy



actions:

eat(), play(), bark()... (her bir kopegin bunlara da sahip olmasini istiyorum)
instance methods

 */