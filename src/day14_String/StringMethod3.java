package day14_String;

public class StringMethod3 {
    public static void main(String[] args) {
        //substring () :to create subvalue(beginning index, ending index)

        String word = "Cydeo School";
        //             012345....

        String brand= word.substring(0, 4+1); // ilk karakteri alir son karakteri almaz, o yuzden o yu da alabilmesi icin 4+1 veya 5 yazacagiz
        System.out.println(brand);

        String str1= word.substring (6); //sonuna kadar yazdirmasini istediginde son karakteri vermek zorunda degilsin
        System.out.println(str1);

        System.out.println("-----------------------------");
        String word2= "Java Programming Language";

        String s1= word2.substring(0, word2.indexOf(" ")); //Java
        String s2= word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));//Programming
        String s3= word2.substring(word2.lastIndexOf(" ")+1 );//Language

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);



    }
}
