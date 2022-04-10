package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 300;


        if(score>=0 && score<=100){ //if the score is valid
            if(score>= 60){ // if student passed the exam
                System.out.println("Passed");

            }else{ // if student failed the exam
                System.out.println("Failed");
            }
        }else { //if the score is not valid
            System.out.println("invalid");
        }

        System.out.println("-----------------");

        int age= 18;
        boolean hasID = false; //pre condition

        if (hasID){ //if person has ID
            if (age>=21){ // if person is 21 years old or older
                System.out.println("eligible to buy alcohol");
            }else{ //if the person is less than 21 years old
                System.out.println("not eligible to buy alcohol");
            }

        }else{
            System.out.println("you must have ID to buy alcohol");
        }


        System.out.println("----------------");

        int number =1;
        if(number>=1 && number<=7){ //if the number is a valid number (1~7)

            if (number==1){
                System.out.println("monday");
            }else if (number ==2){
                System.out.println("tuesday");
            }else if(number==3){
                System.out.println("wednesday");
            }else if(number ==4){
                System.out.println("thursday");
            }else if (number==5){
                System.out.println("friday");
            }else if(number==6){
                System.out.println("saturday");
            }else{
                System.out.println("sunday");
            }


        } else{
            System.out.println("invalid number");
        }








    }
}
