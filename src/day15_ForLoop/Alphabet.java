package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        /*
        Print A-Z, a-z, Z-A, z-a
         */

        for(char i=65; i<=90;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(char i='A'; i<='Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=65; i<=90; i++){
            System.out.print((char)i +" ");
        }

        //a-z
        System.out.println("----------------------");
        for(char i='a'; i<='z'; i++){
            System.out.print(i+" ");
        }

        //Z-A
        System.out.println();
        for(char i='Z'; i>='A'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        for(char i=90; i>=65; i--){
            System.out.print(i+" ");
        }
        //z-a
        System.out.println();
        for(char i='z'; i>='a'; i--){
            System.out.print(i+" ");
        }

        System.out.println("------------------------");
       // for(char i=1; i <=40000; i++){
            //System.out.print(i+ " ");
        }





    }

