package day06_PrimitiveTypeCastings;


			 /*name, birthDay(int), birthMonth(String), birthYear(int)

                     use concatenation to display the birthday of the person

                     if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                     output:
                     John was born on April/25/1995.
*/

public class Birthday {
    public static void main(String[] args) {
        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;
        String output = name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + ".";

        System.out.println(output);
        System.out.println("---------------------------------------------");

        // My favorite book is "bookName"

        String bookName = "The Rich Dad and the Poor Dad";
        System.out.println("My favorite book is \""+ bookName+"\""); //veya doublecodu u text olarak
        // yaziyla birlikte de yazabilirsin

        /*

        \n
        \t
        \"
        \\
        \' singlecode icin backslash koysan da koymasan da singlecode elde
        edersin ama ilk 4u icin backslash kullanmalisin

         */



    }


}
