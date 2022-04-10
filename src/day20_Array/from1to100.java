package day20_Array;

import java.util.Arrays;

public class from1to100 {
    public static void main(String[] args) {

        int []numbers = new int [100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= i+1;
        }

        System.out.println(Arrays.toString(numbers));




    }
}



//1. create an array that has the numbers 1 to 100