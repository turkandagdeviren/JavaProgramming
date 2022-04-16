package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiersTest4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

       // System.out.println(AccessModifiersTest4.name1);//default variable is not visible despite it is subclass
        System.out.println(AccessModifiersTest4.name2); // since the class is subclass protected variable became visible

        System.out.println(ProtectedAccessModifier.name2);

      //  AccessModifiersTest4.method1(); default method can not be visible despite subclass
        AccessModifiersTest4.method2();// protected method can be visible when it is subclass



    }
}
