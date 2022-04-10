package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    static class class1{ // static class ancak inner class olarak acilabilir

    }

    public static int num= 100;
    public static void method(){

    }

    static{

    }

}
    class A{ // outer class (yani hicbir class in icinde degil) ve static olamaz


      static class B{ // inner class tir ve static olabilir.
          public static void method1() {

          }

        }
    }

    class C{
        public static void main(String[] args) {
            A.B.method1();
        }
    }



    class x{

    }

    class y{

    }
    class z{
    class q{ // sadece bu class static olabilir. cunku sadece bu inner class.

    }
    }

