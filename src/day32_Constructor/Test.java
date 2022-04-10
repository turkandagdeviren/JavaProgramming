package day32_Constructor;

public class Test {


        public Test(){ //A
            System.out.println("A");

        }

        public Test(int a){ //A B yazar
            this();//bir onceki constructor i cagirmis olduk
            System.out.println("B");
        }

        public Test(double a){ // A B C yazar
            this(10);
            System.out.println("C");
        }

        public Test(String str){ // A B C D yazar
            this(2.5);
            System.out.println("D");
        }

    public static void main(String[] args) {

            new Test(10); //A B
        new Test("java"); // A B C D
    }



    }



