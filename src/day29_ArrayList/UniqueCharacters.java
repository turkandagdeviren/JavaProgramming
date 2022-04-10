package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaabcccdeeefggggggggggghiiiiiiiiiiiijkkkkkkkkkkkl";
        String[]arr=str.split("");
        ArrayList<String> list= new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);
        
        //ArrayList<String> list= new ArrayList<>(Arrays.asList(str.split("")));
        String unique="";
        for (String each : list) {
            int freq=Collections.frequency(list,each);
            if(freq==1){
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);
        
    }
}
