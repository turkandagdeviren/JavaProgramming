package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int n= 5;
        String nameOfMonth = n==1? "January" :n==2? "February": n==3? "March": n==4?
                "April" :n==5? "May" : n==6? "June": n==7? "July": (n==8)? "Agust": (n==9)?
                "September": (n==10)? "October" : (n==11)? "November": "December;";
        //we dont have to use paranthesis when we use ternaries, but we need to use when we use if.
        System.out.println(nameOfMonth);






    }
}
