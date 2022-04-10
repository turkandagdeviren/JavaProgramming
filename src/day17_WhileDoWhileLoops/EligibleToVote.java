package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        String result="";
        Scanner scan = new Scanner (System.in);
        System.out.println("enter your age:");
        int age = scan.nextInt(); // -20 //valid age :1~120

        while(!(age>=0 && age<120)){
            System.out.println("invalid info, please enter your age:");
            age = scan.nextInt();
        }
        System.out.println("are you a US citizen?:yes/no");
        String answer = scan.next();
        scan.close();
        while (!(answer.equals("yes")|| answer.equals("no"))){
            System.out.println("invalid entry, please re-enter");
            answer= scan.next().toLowerCase();
        }

        if(age>=18 && answer.equals("yes")){
            result= "you are eligible to vote";
        }else{
            result="you are not eligible to vote";
        }
        System.out.println(result);














    }
}
