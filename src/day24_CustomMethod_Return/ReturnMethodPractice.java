package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {
        //find the max number between 100&200

       int maxNumber = max(100, 200);
        System.out.println(maxNumber);
        System.out.println("-------------------------");
        //multiply the max number by 2
        int number= multiplyby2(30);
        System.out.println(number);

    }

    public static int max(int a, int b){
        int result= 0;
        if(a>b){
            result=a;
        }else {
            result=b;
        }
        return result;
    }

    public static int multiplyby2(int num1){
        int multiplication= num1* 2;

        return multiplication;

    }


}
