package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*
        90~100:excellent
        80~89:great
        70~79:good
        60~69:passed
        0~59:failed
         */

        int score = 105;
        String result= ""; //temporary

        if(score<=100 && score>=0){
            if(score>=90){
                result = "excellent";
            }else if (score>=80){
                result= "great";
            }else if (score>=70){
                result="good";
            }else if(score>=60){
                result= "passed";
            }else{
                result ="failed";
            }

        }else{
            result ="invalid score";
        }

        System.out.println(result);

    }
}
