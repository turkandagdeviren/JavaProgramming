package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25; //+ is optional
        int num2 = -25; // - is required to declare
        //++ increment operator : increase the value by 1
        //-- decrement operator : decreases the value by 1
        System.out.println("__________________");
        System.out.println(num1<0); //false
        System.out.println(num2<0); //true
        System.out.println(++num1);

        //"Pre increment"
        System.out.println("__________________");

        int a= 5;
        ++a; //pre increment: increase the value by 1 immediately
        System.out.println(a); // a became 6 now
        --a; // pre decrement : decrease the value by 1 immediately
        System.out.println(a); // a became 5 now

        //"Post increment"
        System.out.println("___________________");

        int b= 100;
        System.out.println(b++); // 100 post increment: first passes the current value, then increases the value by1
        System.out.println(b); //101

        System.out.println("___________________");

        int x =200;
        System.out.println(--x); //pre decrement ==>199

        int y = 200;
        System.out.println(y--); //post decrement ==> 200
        //pre example
        int t = 25;
        System.out.println(++t); //==> 26
        System.out.println(--t); // ==>25
        //post example
        int z= 25;
        System.out.println(z++); //==> 25
        System.out.println(z--); //==> 26 (bir onceki satirdaki + islemis oldu
        System.out.println(z); //==> 25 (bir onceki satirdaki - islemis oldu

        System.out.println("-----");

        int d = 45;
        System.out.println(++d); // 46, d=46
        System.out.println(d++); //46, d= 47
        System.out.println(d); //47

        System.out.println("-----");

        int q= 30;
        System.out.println(--q); //29 q=29
        System.out.println(q--); // 29 q=28
        System.out.println(q); //28











    }




}
