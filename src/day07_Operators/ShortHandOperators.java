package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //Assignment
        int number = 100;
        System.out.println("number = " + number); //100

        number= 200; //we change the value of variable

        System.out.println("number = " + number);//200

        String word = "java programming";
        System.out.println("word = " + word); //java programming

        word= "java programming-2";
        System.out.println("word = " + word); // java programming-2

        word="Cydeo";

        //word ="123"+1; ==> 1231
        System.out.println("word = " + word); //Cydeo

       // word=123;// you cannot assign a number to the variable 'word', because original datatype is string

        System.out.println("--------------------");

        //Addition assignment:

        int x = 100;

        System.out.println("x = " + x);
        System.out.println(x+200); //300

        //x=x+200;
        x+=200;
        System.out.println("x = " + x); //300

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1); //8.0

        double availableBalance = 1000.50;

        //deposit 300$

        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);


        System.out.println("______________");
        //withdrawing 500$

        availableBalance -=500; // availableBalance =1300.5 - 500;
        System.out.println("availableBalance = " + availableBalance);
        // withdraw 200, then depositing 400$

        availableBalance -= 200; //available balance = 600.5
        availableBalance += 400; // available balance = 1000.5

        System.out.println("___________");

        double salary = 50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);

        double num2= 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("_________________-");

        double num3= 100;
        //%=

        num3 %= 3; //100 u 3 e bol kalanini ver demis oluyoruz

        System.out.println("num3 = " + num3);

        int amount = 127; //cents

       int quarters = amount /25;
       int cents =amount % 25;

        System.out.println("quarters = " + quarters);
       System.out.println("cents = " + cents);

       int cents2= 127;
       cents2 %= 25;

       int y= 300;
       y %= 16; // artik y degeri y nin yani 300 un 16 ya bolumunden kalan haline gelecek

        System.out.println("y = " + y);

        System.out.println("________________________-");

        int balance = 3500;
        //insurance balance = 153$

        balance %= 153;

        System.out.println("balance = " + balance);























    }


}
