package day28_ArrayList;


import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        /*int num=1;
        list.remove(num); // 1.indexe gidip onu remove eder cunku int  */

        Integer num = 200;
        list.remove(num); // bu durumda 200 u siler. objecti siler cunku Integer
        System.out.println(list);

        // list.remove(200); // dogrudan sayi olarak yazarsak onu index olarak alir
        // 200 listede olan bir index olmadigi icin outofBoundsException uyarisi aliriz
        //remove methodu loop icinde kullanmiyoruz, removeIf kullanabiliriz

        boolean r3 = list.remove(num);
        System.out.println("r3 = " + r3);

        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("----------------------------");
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); //0 sonuc int olacagi icin int olarak assign edebiliriz
        int b = characters.lastIndexOf('A'); //4

        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------");
        boolean r2= characters.contains('A');
        boolean r4= characters.contains('Z');
        System.out.println("r2 = " + r2);
        System.out.println("r4 = " + r4);

    }

}
