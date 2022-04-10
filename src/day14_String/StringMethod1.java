package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {

        String str1 ="   batch   25    "; //trim method will delete white spaces at the beginning and the end
        //str1.trim(); => it creates a new string. "batch   25" this will be the new object.

        System.out.println(str1);//yazdirdigimizda hala ilk degeri yazdirir o yuzden ikinci halini
        // yazdirmasi icin assign back yapmaliyiz

        str1= str1.trim();
        System.out.println(str1);

        String str2= "Cydeo School";
        int n1 =str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2= str2.indexOf("o");
        System.out.println("n2 = " + n2); // ilk o yu verir

        int n3 =str2.indexOf("ool");
        System.out.println("n3 = " + n3); //ool ´in in ilk karakterinin sayisini verir //9

        String str3 = "Java Programming language";
        int n4= str3.indexOf("a "); //a ve yaninda space olan karakterin indexini verir
        System.out.println("n4 = " + n4);

        //language in ilk g sini yazdirsin istiyorsam yanindaki harfi de yazarak spesificlestiririm

        int n5 = str3.lastIndexOf("g"); //sondan basa dogru ilk g nin indexini verir
        System.out.println("n5 = " + n5);

        System.out.println("----------------------");
        String s ="Java Nova Cava Wawa orange";
        int firstA =s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        int fourthA= s.indexOf ("ava W"); //W yi de ekleriz cunku ava dersek Javadaki ava yi alacaktir
        int fourthA2= s.lastIndexOf("av"); //yaziyi duz okuyarak sondan baslayip basa gider Cava nin "av" ini alir (cden sonraki a ve v)
        int fourthA3= s.indexOf ("Ca") +1 ; //boyle de bulabiliriz
        int fifthA= s.lastIndexOf("a W");
        //veya int fifthA = s.lastIndexOf("va")+1;
        int sixthA = s.lastIndexOf ("aw");
        //int seventhA= s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);


















    }
}
