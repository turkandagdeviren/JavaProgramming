package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        //display a program that executes from 15 to 45 in the same line with space between

        for(int i =15; i <=45; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //100 to 50
        for(int i=100; i>=50; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("---------------------");
        //print all the even numbers between 1-55
        for(int i=2; i<=55;i+=2){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("---------------"); //second solution
        for(int i=1; i<=55; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }



    }
}
