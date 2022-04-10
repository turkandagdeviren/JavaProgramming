package day34_GarbageCollection_AccessModifiers;
/*static block : used for initializing static variables
               : runs first before everything, runs only one time
               : gets executed as soon as class is loaded
               :if the static variables need several steps to be initialized
*/
public class Constructor_vs_StaticBlock {
    static{
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){ // object olmadigi icin execute etmez
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

}
