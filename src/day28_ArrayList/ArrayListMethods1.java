package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);


        System.out.println(numbers);

        numbers.add(2, 25);//2.indexi 25 yapar ve digerlerini saga kaydirir
        numbers.add(5,45);
        System.out.println(numbers);

        System.out.println(numbers.size()); //returns the total number of elements
        int lastIndex= numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);
        Integer num= numbers.get(3); //returns the element at the given index

        for (int i = 0; i < numbers.size () ; i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("---------------------------------");
        ArrayList<String> list= new ArrayList <>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        System.out.println(list);
        System.out.println("-----------------------------");

        list.set(2, "JavaScript"); //it replaces the element at the given index with the new element

        System.out.println(list);
        list.set(3,"C++");
        System.out.println(list);






    }





}
