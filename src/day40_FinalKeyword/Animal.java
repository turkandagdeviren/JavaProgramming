package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed; // final ekleyerek unchangeable yaptik
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    //final variable kullandigimizda private variable lar icin setter create edemeyiz cunku verileri yeniden set edemeyiz
    // we can set only the unfinal variables
    //private datalar final ise setter kullanamadigimiz icin bi condition
    //we can read the final variables but can not modify them

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    //------------------------setters-------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }


public void eat(){ // this implementation can be changed by overriding
    System.out.println(name+ " is eating");
}

public final void drink(){ // this implementation will be same for all the animals
    System.out.println(name + " is drinking water");
}





}
