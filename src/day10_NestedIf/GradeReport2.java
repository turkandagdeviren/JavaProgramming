package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        int s = 195;

        String score= (s>=0 && s<=100)? (s>=90)? "excellent": (s>=80)? "great" :
                (s>=70)?"good" :(s>=60)? "passed":"failed" :"invalid score";

        System.out.println(score);

        System.out.println("------------------------------");
        //solution 3:

        String result2 = "";
        if (s>=0 && s<=100) {

            result2= (s>=90)? "excellent": (s>=80)? "great" :
                    (s>=70)?"good" :(s>=60)? "passed":"failed";
        } else result2 ="invalid score";

        System.out.println(result2);

    }
}
