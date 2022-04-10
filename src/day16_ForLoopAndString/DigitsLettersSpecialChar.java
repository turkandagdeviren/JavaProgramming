package day16_ForLoopAndString;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {

        String str ="Cydeo12345School !#%WoodenSpoon";
        String digits="";
        String letters="";
        String specialChars="";

        for (int i = 0; i <str.length(); i++) { //index numbers of str (0~last index)


            char ch= str.charAt(i); //ch=each character that we have in str
            if(ch>='0'&& ch<='9'){
                digits +=ch;
            }else if (ch>='a'&& ch<='z'){
                letters+=ch;
            }else if (ch>='A'&& ch<= 'Z'){
                letters +=ch;
            }else { // if the character is neither digit nor letter, then it is special character
                if(ch !=' '){ // if the speacial character is not a space
                    specialChars+=ch;

                }

            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChars);





    }
}
