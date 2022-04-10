package day17_WhileDoWhileLoops;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if(i=='C'){
               continue; // bu karakteri yazdirmaz ve sonrakileri yazdirarak devam eder
            }

            System.out.println(i); //A
        }

        System.out.println("-------------------------");
        //print all even numbers 1~10

        for (int i = 1; i <=10; i++) {
            if(!(i%2==0)){
                continue;
            }
            System.out.print(i);
            if((i<10))
            System.out.print(",");

        }
        System.out.println();
        System.out.println("------------------");

        //print odd numbers between 1~10
        for (int i = 1; i <10 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i);
            if(i<9){
                System.out.print(",");
            }

        }



    }
}
