package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

       String [] students = {"Elif", "Sinem", "Gunay","Cihad","David", "James","Aaron","Daniel"};
       String [] earlyBirds = Arrays.copyOf(students, 5);
       System.out.println(Arrays.toString(earlyBirds));

       int[] numbers= {1,2,3,4,5,6,7,8,9,10};
       numbers= Arrays.copyOf(numbers, 5); //{1,2,3,4,5} artik numbers arrayi bu hale geldi cunku atadik

        System.out.println(Arrays.toString(numbers));

        char[] ch1= {'A','B','C','D','E','F','H','I'};
        char[] ch2= Arrays.copyOfRange(ch1, 1,2); //ending index is always excluded
        System.out.println(Arrays.toString(ch2));

        int []score = {10,20,30,40,50,60,70,80,90,100};
        int[] result=Arrays.copyOfRange(score,3,8);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(score,3, score.length);
        System.out.println(Arrays.toString(result2));

    }
}

