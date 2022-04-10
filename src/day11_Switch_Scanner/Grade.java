package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char score ='A';
        String result ="";

        switch (score){
            case 'A':
                result= "excellent";
                break;
            case 'B':
                result= "great";
                break;
            case 'C':
                result= "good";
                break;
            case 'D':
                result= "passed";
                break;
            case 'F':
                result= "failed";
                break;
            default:
                result= "invalid";


        }

        System.out.println(result);




    }
}
