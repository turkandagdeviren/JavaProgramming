package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {
        int number = 13;
        String result ="";

        if(number>=1 && number<=12){
            if (number ==1){
                result ="january";
            }else if(number==2){
                result= "february";
            }else if(number==3){
                result="march";
            }else if(number==4){
                result="april";
            }else if(number==5){
                result="may";
            }else if(number==6){
                result= "june";
            }else if(number ==7){
                result ="july";
            }else if(number==8){
                result ="agust";
            }else if(number==9){
                result="september";
            }else if(number==10){
                result= "october";
            }else if(number==11){
                result= "november";
            }else{
                result="december";
            }

        } else{ result ="invalid number";

        }
        System.out.println("result = " + result);


    }
}
