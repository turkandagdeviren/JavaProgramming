package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {

    //remove the element at the given index from the array, returns a new array
    public static int[] removeElement(int[] arr, int index){

        if(index<0 || index> arr.length-1){
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }
        int [] result={};
        for (int i = 0; i < arr.length; i++) {
            if(i!=index){
                result =ArraysUtility.addElement(result,arr[i]);
            }

        }
        return result;

    }

    //remove the element at the given index from the array, returns a new array
    public static double[] removeElement(double[] arr, int index){

        if(index<0 || index> arr.length-1){
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }
        double [] result={};
        for (int i = 0; i < arr.length; i++) {
            if(i!=index){
                result =ArraysUtility.addElement(result,arr[i]);
            }

        }
        return result;

    }

    //remove the element at the given index from the array, returns a new array
    public static char[] removeElement(char[] arr, int index){

        if(index<0 || index> arr.length-1){
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }
        char [] result={};
        for (int i = 0; i < arr.length; i++) {
            if(i!=index){
                result =ArraysUtility.addElement(result,arr[i]);
            }

        }
        return result;

    }

    //remove the element at the given index from the array, returns a new array
    public static String[] removeElement(String[] arr, int index){

        if(index<0 || index> arr.length-1){
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }
        String [] result={};
        for (int i = 0; i < arr.length; i++) {
            if(i!=index){
                result =ArraysUtility.addElement(result,arr[i]);
            }

        }
        return result;

    }



}
