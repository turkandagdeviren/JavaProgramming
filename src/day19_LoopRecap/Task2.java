package day19_LoopRecap;

public class Task2 {
    public static void main(String[] args) {
        String str= "aabccdeef";
        String result ="";

        for (int j = 0; j < str.length() ; j++) {
            char ch= str.charAt(j);
            int count =0;
            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked,with each character
                char each= str.charAt(i);
                if(ch == each){
                    count++;

                }
            }
            if(count==1){ //if the frequency of character i 1, then the character is unique
                result+= ch;

            }
      /*      if(count!=1){
                continue;
            }
            result+=ch;
       */

        }
        System.out.println(result);









    }
}
