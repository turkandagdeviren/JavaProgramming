package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.setInfo("Max", "husky", 'M',2, "small","white");
        dog.sleep();
        dog.eat();
        dog.move(); //bu methodlari animaldan inherite edebiliyoruz dog icin. cunku extends ettik
        //dog.hunt(); //hunt tigera ait bir method o yuzden cagiramadik
        //dog.scratch();// cat e ait oldugu icin cagiramadik

        System.out.println(dog);
        Cat cat= new Cat();
        cat.setInfo("Mila","smokin",'F',1,"small","black");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        //cat.bark();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger= new Tiger();
        tiger.setInfo("Sher Khan","Bengal", 'M', 4,"large","orange");

        tiger.drink();
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);



    }


}
