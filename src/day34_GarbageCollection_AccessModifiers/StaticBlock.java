package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static{
        System.out.println("Static Block"); // runs first before anything, and only one time
    }
    static{
        System.out.println("Static Block 2");
    }

    static{
        System.out.println("Static Block 3");
    }



}
