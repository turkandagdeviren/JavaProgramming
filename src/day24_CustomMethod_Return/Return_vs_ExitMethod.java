package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {

        nameOfMonth(50);
        System.out.println("hello world");



    }

    public static void nameOfMonth(int number){

        if(number < 1 || number > 12){//if number is invalid
            System.out.println("Invalid");
            //return; // exits nameOfMonth method, remaining code fragments of the method never gets executed
            System.exit(0); // bu durumda tum methodlar durur ve hello world yazdirilmaz.
        }

        String name =  (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                :(number==11)?"Nov" : "Dec";

        System.out.println("Month name = " + name);

    }






}
