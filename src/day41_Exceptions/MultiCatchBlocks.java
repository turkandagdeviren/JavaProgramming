package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        // istedigimiz sayida catch block acabiliriz ancak parent exception child exceptiondan once placed edilemez
        Employee employee = null;

        try{
            System.out.println(employee.getSalary() ); // null pointer exception
        }catch(IndexOutOfBoundsException e){
            System.out.println("first catch block");
           e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("second catch block");
            e.printStackTrace();
        }catch (ClassCastException e){ // dogru exception yerine baska bir exception yazdiysak exception yakalanmamis olur ve bu durumda execution olmaz error 1 ile biter
            System.out.println("third catch block");
            e.printStackTrace();
        }/*tum denediklerim olmadiysa RunTime exception yaparim */ catch (RuntimeException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
        }

        System.out.println("test completed");

        System.out.println("------------------------------------------------");

        try{
            System.out.println("Java".charAt(-1));
        } catch(RuntimeException e){
            e.printStackTrace();
        }






    }
}
