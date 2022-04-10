package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores= new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeA= new ArrayList<>(scores);//90-100
        gradeA.removeIf(p-> !(p>=90&& p<=100) );
        System.out.println(gradeA);


        ArrayList<Integer> gradeB= new ArrayList<>(scores);//80-89
        gradeB.removeIf(p-> !(p>=80 && p<=89) );
        System.out.println(gradeB);

        ArrayList<Integer> gradeC= new ArrayList<>(scores);//70-79
        gradeC.removeIf(p-> !(p>=70 && p<=79) );
        System.out.println(gradeC);

        ArrayList<Integer> gradeD= new ArrayList<>(scores);//60-69
        gradeD.removeIf(p-> !(p>=60 && p<=69) );
        System.out.println(gradeD);

        ArrayList<Integer> gradeF= new ArrayList<>(scores);//0-59
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        System.out.println(gradeF);

        System.out.println("Total number of A: "+gradeA.size());
        System.out.println("Total number of B: "+gradeB.size());
        System.out.println("Total number of C: "+gradeC.size());
        System.out.println("Total number of D: "+gradeD.size());
        System.out.println("Total number of F: "+gradeF.size());










    }
}
