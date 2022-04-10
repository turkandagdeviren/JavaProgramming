package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7};
        int[] unique= uniqueElements(array);
        System.out.println(Arrays.toString(unique));


        double[] array1= {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};
        double[] unique1= uniqueElements(array1);
        System.out.println(Arrays.toString(unique1));




    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements (int[] arr){

        int[] result= {};
        for (int each : arr) {

            if(ArraysUtility.frequencyOfElement(arr, each)==1){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements (double[] arr){

        double[] result= {};
        for (double each : arr) {

            if(ArraysUtility.frequencyOfElement(arr, each)==1){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements (char[] arr){

        char[] result= {};
        for (char each : arr) {

            if(ArraysUtility.frequencyOfElement(arr, each)==1){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements (String[] arr){

        String[] result= {};
        for (String each : arr) {

            if(ArraysUtility.frequencyOfElement(arr, each)==1){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }









}
