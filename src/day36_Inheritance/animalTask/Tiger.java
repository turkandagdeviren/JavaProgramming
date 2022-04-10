package day36_Inheritance.animalTask;

public class Tiger extends Animal{
  //extend ile birlikte Animaldaki tum variablelari ve methodlari almis olur

    public void hunt(){
        System.out.println(name+ "is hunting");
    }
    public void roar(){
        System.out.println(name+ "is roaring");
    }


}
