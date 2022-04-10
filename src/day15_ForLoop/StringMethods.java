package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str="  ";
        boolean r= str.isEmpty(); //bos ise true degilse false sonucu verir,white spaceleri de karakter olarak sayar
        System.out.println(r);

        boolean r1=str.isBlank(); //white space leri gorur ve varsa true verir.
        System.out.println(r1);

        String str2= "Cydeo       ";
        System.out.println(str2.isBlank()); //false
        System.out.println(str2.isEmpty()); //false
        System.out.println("-------------------------------");
        String s1="CYDEO";
        String s2= "cydeo";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        //Yes,YES,yEs, yES....
        System.out.println("yEs".equals("Yes")); //false
        System.out.println("yEs".equalsIgnoreCase("yes")); //true

        System.out.println("-----------------");

        String sentence= "My favorite programming language is Java";
        boolean hasCSharp= sentence.contains("C#");
        boolean hasJava= sentence.contains("Java");
        boolean hasJava2= sentence.contains("java");

        boolean hasJava3= sentence.toLowerCase().contains("java");//true (kucuk buyuk harfi ignore ederek bakmasi icin)

        System.out.println(hasCSharp); //false
        System.out.println(hasJava); //true

        System.out.println("----------------------");

        String input1= "I love Java";
        String input2="Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains(input2)); //true
        System.out.println(input2.contains(input1)); //false //eger input1deki Java= JAvA olsaydi false olurdu

        System.out.println(input1.toLowerCase().contains("java"));//true buyuk kucuk harf durumunu gozardi etmenin tek yolu budur
        System.out.println(input1.toUpperCase().contains("JAVA"));//true

        System.out.println("-------------------------");

        String a ="Wooden Spoon";
        //a.startsWith();//birden fazla karakterle de bakabiliriz

        boolean x = a.startsWith("Woo"); //true
        boolean y = a.endsWith("Spoon"); //true
        boolean z= a.startsWith("wooden"); //false
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //to ignore the case sensitivity we first create the lower case of upper case

        boolean t= a.toLowerCase().startsWith("wooden");//true
        System.out.println(t);







    }
}
