package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);

        System.out.println("enter your age:");
        int age= input.nextInt();
        input.nextLine(); //age den sonraki enter i okumasi icin yazdik (bir sonrakinde nextline kullanacagimiz icin)
        System.out.println("enter your full name:");
        String fullname = input.nextLine();
        
        System.out.println("enter your GPA:");
        double gpa= input.nextDouble();

        input.nextLine();
        System.out.println("enter your school name:");
        String schoolName = input.nextLine();
        
        System.out.println("age = " + age);
        System.out.println("fullname = " + fullname);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);
        
        
        input.close();




    }
}
/*
1:Ask the user to enter age (nextInt() )
2:Ask the user to enter full name (nextLine() )
 */