package day09_IfStatements;

public class Task4 {
    //4. Write a progrm that can check if the person is eligible to vote
    public static void main(String[] args) {
        int age = 18;
        String citizen ="USA";

        boolean isEligible= age>=18 && citizen == "USA";
        if (isEligible){
            System.out.println("the person is eligible to vote");
        }else {
            System.out.println("the person is not eligible to vote");
        }





    }




}
