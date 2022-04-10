package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        /*
        score:

        90 - 100 ==> Excellent
        80 - 89 ===> Great
        70 - 79 ===> Good
        60 - 69===> Passed
        0 - 59 ===> Failed
         */

        int grade= 98;
        String result;

        if(grade>= 90 && grade <=100){
            result ="Excellent";
        } else if(grade>=80 && grade<=89){
            result = "Great";
        }else if(grade>=70 && grade<=79){
            result ="Good";
        }else if(grade>=60 && grade<=69){
            result ="Passed";
        }else {
            result ="Failed";
        }
        System.out.println(result);




    }
}
