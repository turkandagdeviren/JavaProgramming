package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
       double n1 = 200.5;
       double n2= 10.5;
       char operator = '-';
       boolean valid = operator =='+' || operator == '-'|| operator == '*' || operator == '/';
       if (valid) {
           switch (operator){
               case '+':
                   System.out.println(n1+n2);
                   break;

               case '-':
                   System.out.println(n1-n2);
                   break;

               case '*':
                   System.out.println(n1*n2);
                   break;

               default :
                   System.out.println(n1/n2);
                   break;

           }

       }else {
           System.err.println ("invalid operator:"+operator);
       }

    }
}
/*
n 1 n2 and a char variable named operator
use switch statement to calculate the result of n 1 and n2 based on the given operator
valid operators are + - * /
 */