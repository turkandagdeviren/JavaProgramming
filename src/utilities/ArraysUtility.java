package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);

        }


    }

    //prints each double of a double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);

        }
    }

    //prints each char of a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);

        }
    }

    //prints each String of a String array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);

        }
    }

    //returns the max number for integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }

    //returns the max number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }

    //returns the min number for integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the min number for double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks of the given integer is contained in the given array.returns boolean. contains (int [], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks of the given double is contained in the given array.returns boolean. contains (double [], double)
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks of the given char is contained in the given array.returns boolean. contains (char [], char)
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks of the given String is contained in the given array.returns boolean. contains (String [], string)
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    //adds the given integer to array, returns a new array
    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;


    }

    //adds the given double to array, returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }

    //adds the given String to array, returns a new array

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

    //adds the given char to array, returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] arr, int element) {
        int count = 0;
        for (int each : arr) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] arr, double element) {
        int count = 0;
        for (double each : arr) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] arr, char element) {
        int count = 0;
        for (char each : arr) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] arr, String element) {
        int count = 0;
        for (String each : arr) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] arr) {

        int[] result = {};
        for (int each : arr) {

            if (ArraysUtility.frequencyOfElement(arr, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] arr) {

        double[] result = {};
        for (double each : arr) {

            if (ArraysUtility.frequencyOfElement(arr, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] arr) {

        char[] result = {};
        for (char each : arr) {

            if (ArraysUtility.frequencyOfElement(arr, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] arr) {

        String[] result = {};
        for (String each : arr) {

            if (ArraysUtility.frequencyOfElement(arr, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //remove the element at the given index from the array, returns a new array
    public static int[] removeElement(int[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }
        int[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, arr[i]);
            }

        }
        return result;

    }

    //remove the element at the given index from the array, returns a new array
    public static double[] removeElement(double[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }
        double[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, arr[i]);
            }

        }
        return result;

    }

    //remove the element at the given index from the array, returns a new array
    public static char[] removeElement(char[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }
        char[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, arr[i]);
            }

        }
        return result;

    }

    //remove the element at the given index from the array, returns a new array
    public static String[] removeElement(String[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }
        String[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, arr[i]);
            }

        }
        return result;

    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static int [] reverse (int[]array){
        int[] result= new int [array.length];
        int j= 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] =array[i];
            j++;
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static double [] reverse (double[]array){
        double[] result= new double [array.length];
        int j= 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] =array[i];
            j++;
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static char [] reverse (char[]array){
        char[] result= new char [array.length];
        int j= 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] =array[i];
            j++;
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static String [] reverse (String[]array){
        String[] result= new String [array.length];
        int j= 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] =array[i];
            j++;
        }
        return result;
    }

    //replace the elements of the array at given index with the new element
    public static int[] replace (int[]array, int index, int newElement){

        if(index<0|| index>array.length-1){
            System.err.println("invalid index:" + index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    //replace the elements of the array at given index with the new element
    public static double[] replace (double[]array, int index, double newElement){

        if(index<0|| index>array.length-1){
            System.err.println("invalid index:" + index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    //replace the elements of the array at given index with the new element
    public static char[] replace (char[]array, int index, char newElement){

        if(index<0|| index>array.length-1){
            System.err.println("invalid index:" + index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    //replace the elements of the array at given index with the new element
    public static String[] replace (String[]array, int index, String newElement){

        if(index<0|| index>array.length-1){
            System.err.println("invalid index:" + index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    //replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates (int[]arr){

        int[] result= {};
        for (int each : arr) {
            if(!ArraysUtility.contains(result, each)){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates (double[]arr){

        double[] result= {};
        for (double each : arr) {
            if(!ArraysUtility.contains(result, each)){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates (char[]arr){

        char[] result= {};
        for (char each : arr) {
            if(!ArraysUtility.contains(result, each)){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates (String[]arr){

        String[] result= {};
        for (String each : arr) {
            if(!ArraysUtility.contains(result, each)){
                result= ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }


}
