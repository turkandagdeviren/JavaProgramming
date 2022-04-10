package day17_WhileDoWhileLoops;

public class FrequencyJava {
    public static void main(String[] args) {
        /*
        2. write a program that can return the frequency of the word "Java" from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3
         */
        /*
        Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
         */

        String str ="JavaJavaJava";
        int freq=0;
        for (int i = 0; i <= str.length()-4; i++) {
            String each= str.substring(i, i+4);
            if (each.equals("Java")){
                freq++;
            }
        }
        System.out.println(freq);









    }
}
