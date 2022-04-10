package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

        int n;
        n=4;
        //n 1~7
        String day;
        if (n==1){
            day= "monday";
        }else if (n==2){
            day= "tuesday";
        }else if (n==3){
            day="wednesday";
        }else if (n==4){
            day="thursday";
        }else if(n==5){
            day="friday";
        }else if (n==6){
            day="saturday";
        }else if (n==7){
            day="sunday";
        }else{
            day= "invalid";
        }
        System.out.println(day);




    }
}
