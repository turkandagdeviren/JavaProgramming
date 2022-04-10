package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        /*
        Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number

			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
         */
        int a= 1000,
                b=5,
                c=2000;

        boolean aIsMedian = (a<b && a>c) || (a>b && a<c);
        boolean bIsMedian = (b<a && b>c) || (b>a && b<c);
        boolean cIsMedian = !aIsMedian && !bIsMedian; //3 kosul varsa diger ikisini yazdiktan sonra bunu kullan


        if(aIsMedian) {
            System.out.println(a +" is median number");
        }
        if(bIsMedian) {
            System.out.println(b+ " is median number");
        }
        if(cIsMedian) {
            System.out.println(c+ " is median number");
        }




    }



}
