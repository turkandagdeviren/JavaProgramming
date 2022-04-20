package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

     int[] arr= {1,2,3};
     try{
         System.out.println(arr[10]);
         System.out.println("try block");
     }catch (RuntimeException e){
         System.out.println("catch block");
         e.printStackTrace();
        // System.exit(0);// finally block un execute etmesini ancak boyle terminate edebiliriz
     }finally{
         System.out.println("Finally block");
     }


    }
}
            /*finally block always gets executed regardless of the exception is being handled or not handled
           to stop the execution of the finally block: System.exit(0) unless we explicitly terminate the program by using that.

           final: is keyword and means that it is unchangeable. it makes the variable method or class unchangeable.
           finally: is na optional block that we can use when we try to catch
           finalize: is a method that garbage collector uses before clearing the object from the java.
           every single class is implicitly inherits the object class. object is the parent of all the classes by default.
           finalize method is inherited to every single object. if there was not finalize object then it would be impossible
           to remove that object from the heap memory. finalize method provides the object to be cleaned from the heap memory.
           this method can not be called by ourselves. we are not responsible to call it. this method is automatically called as soon
           as the object becomes unreferenced. garbage collector calls and clear the object from the heap memory.


           */

