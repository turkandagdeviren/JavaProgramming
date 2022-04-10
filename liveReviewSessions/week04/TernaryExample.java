package week04;

public class TernaryExample {
    public static void main(String[] args) {
        int score1=25;
        String result1 ="";

        if (score1>60) {
            result1 = "pass";

        } else {
            result1 = "fail";
        }
        //same logic with ternary

        int score2 =65;
        String result2 = (score2 >60)? "passed" :"failed";

        System.out.println(result2);

    }
}
