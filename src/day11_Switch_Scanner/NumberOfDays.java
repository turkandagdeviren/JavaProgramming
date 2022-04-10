package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int num=2;
        int year=2000;
        String month="";

        if (num>=1 && num<=12){

            switch(num)
            {

                case 2:
                    if (year%4==0){
                        month ="29 days";
                    } else {
                        month = "28 days";
                    }
                    //(year%4==0)?: "29 days" :"28 days";
                    break;

                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    month = "31 days";
                    break;

                case 4: case 6: case 9: case 11:
                    month = "30 days";
                    break;

            }

        }else{
            month = "invalid";
        }

        System.out.println(month);





    }
}
