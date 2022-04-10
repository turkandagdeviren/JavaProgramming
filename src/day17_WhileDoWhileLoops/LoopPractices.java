package day17_WhileDoWhileLoops;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
        System.out.println("------------------");
        int j=1;
        while(j<=10){
            j++; // bu oldugu icin 11 e kadar yazdirir bu nedenle sayilarda en iyisi for kullanmak
            System.out.println(j);
        }
        System.out.println("------------------");

        int k=1;
        do{
            System.out.println(k);
            k++;
        }while(k<=10);








    }
}
