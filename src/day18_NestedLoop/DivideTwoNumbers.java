package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        /*
1.  Write a program that can divide two positive numbers without using
/ (division) and * (multiplication) and % operators
         */
        int num1=30;
        int num2=4;
        int result=0;

        while(num1>=num2){
            num1-=num2;
            result++;
        }

        System.out.println("result is "+ result +" by remainder of "+ num1);
    }
}
