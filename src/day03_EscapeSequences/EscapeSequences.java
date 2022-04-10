package day03_EscapeSequences;
/*
escape sequences; MUST be given with double quote
\n: this is for to start a new line
\t: paragraph space (tab)
\\: backslash
\": double quote

 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPyhton \nC#");

        System.out.println("---------------------------------------------");
        System.out.println("Hello Cydeo How are you all today? It´s nice to see you all! What class do we have next week?");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt´s nice to see you all! \nWhat class do we have next week?");

        System.out.println("----------------------------------");
        System.out.println("\tJava is cool programming language");
        System.out.println("----------------------------------");
        System.out.println("/ \\"); // in order to print one backward slash we need to give two backward slash
        System.out.println("my favorite tv show is \"game of thrones\"");



    }






}
