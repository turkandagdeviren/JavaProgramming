package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s= 15;
        /*if(s>=0 && s<=100){
            if (s>=60){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }

        }else{
            System.out.println("invalid score");
        } */


        String score =(s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" : "invalid score";
        System.out.println(score);



    }
}
