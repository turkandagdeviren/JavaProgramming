package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a= 10;
        int b= 15;
        int c = a; // a yi b yaptigimiz icin a kaybolacak, o yuzden a yi yeni bir variable olarak atiyoruz

        a = b; //a= 15 (burada a yi b ye atayinca artik bu satirdan itibaren a 15 oldu)
        b= c; // b= 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        /*
        write a program that can swipe two variables" value by using a temporary variable
        Ex: if a =10, b= 15
        output:
        a= 15
        b= 10
         */



    }





}
