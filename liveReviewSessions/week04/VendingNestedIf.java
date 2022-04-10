package week04;
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coffee":
        "coffee is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
 */
public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "coffee";
        String snackItem = "chips";

        if (selection == "drink") {
            System.out.println("drink option is selected");
        if (drink == "tea") {
            System.out.println("tea item selected");
        } else if (drink == "coffee") {
            System.out.println("coffee item selected");
        }

        }else if (selection =="snack") {
            System.out.println("snack option is selected");
            if (snackItem== "chips"){
                System.out.println("chips is selected");
            }else if (snackItem== "candy"){
                System.out.println("candy is selected");
            }

        }else {
            System.err.println("invalid entry");
        }








    }
}
