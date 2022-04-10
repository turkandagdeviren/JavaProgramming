package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {


        Person p1= new Person();
        //p1.name = "Daniel";
        //p1.age= 28; private oldugu icin direct cagiramiyoruz

        p1.setName("Daniel");
        p1.setAge(45);
        //System.out.println(p1.name+ " : "+ p1.age);

        System.out.println(p1.getName()+" : "+p1.getAge()); // the only way to read the private variable is to use get method

        // variable lari public yapmanin dezavantaji daha uzerinde kontrolumuzun olmamasidir.
       // private ta data create etmenin tek yolu set method oldugu icin orada bir condition ekleyebiliriz
        // ama bu condition i public methodda koyamazdik

    }




}
