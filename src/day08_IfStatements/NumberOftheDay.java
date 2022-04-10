package day08_IfStatements;

public class NumberOftheDay {
    /*
    2. write a program that can display the name of the day

			number = 1 ~ 7
     */

    public static void main(String[] args) {
        int number=3;
        boolean monday= number == 1;
        boolean tuesday = number ==2;
        boolean wednesday = number ==3;
        boolean thursday = number ==4;
        boolean friday = number ==5;
        boolean saturday = number ==6;
        boolean sunday = number ==7;

        if(monday){
            System.out.println("monday");
        }
        if(tuesday){
            System.out.println("tuesday");
        }
        if(wednesday){
            System.out.println("wednesday");
        }
        if(thursday){
            System.out.println("thursday");
        }
        if(friday){
            System.out.println("friday");
        }
        if(saturday){
            System.out.println("saturday");
        }
        if(sunday){
            System.out.println("sunday");
        }

    }
}
