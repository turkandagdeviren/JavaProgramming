package day40_FinalKeyword;

public class FinalVariable {
    //instance variables can not be initialized by final variable. because we use instances to create object
    //to get rid of compile error we create constructor for instance variables; static block for static variables

    final String birthDay;
    final static String name;

    static{
        name="Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {
        //final variables can not be reassigned
        double pi= 3.14;
      //  pi= 4.14; default oldugu icin reassign yapabildik

        final String name;
        name= "Java";

      //  name="Wooden spoon"; it can not be reaasigned. it gives compile error
        System.out.println(name);

        System.out.println("--------------------------------");

        FinalVariable obj= new FinalVariable("May/01");
        System.out.println(obj.birthDay);

       // obj.birthDay= "June/01"; // final variables can not be reassigned


        System.out.println("--------------------------------");

        System.out.println(FinalVariable.name); // static variables are called by class name

        // FinalVariable.name="Python";  // final variable can not be reassigned

/*
final variables: can not be reassigned
final methods: can not be overridden
final classes: can not be inherited ( can not ve parent)
 */

    }
}
