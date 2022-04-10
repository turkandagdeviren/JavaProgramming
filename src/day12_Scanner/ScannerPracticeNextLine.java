package day12_Scanner;

import java.util.Scanner;

public class ScannerPracticeNextLine {
    public static void main(String[] args) {

        //nextLine bosluktan sonrasini da okuyabilir
        Scanner input = new Scanner (System.in);

        System.out.println("enter your full name:");

        String fullName = input.nextLine(); //Wooden SpoonEnter

        System.out.println("enter your programming language:");

        String language = input.nextLine(); //Java programming languageEnter

        System.out.println("enter your age:");
        int age = input.nextInt(); //24Enter
        input.nextLine();// bu satiri 24 un yanindaki enter i okumasi ve bir sonraki satira bilgi girebilmek
        // icin yaziyoruz, bu satir enter i capture eder.

        input.close();

        System.out.println("enter your school name:");
        String schoolName= input.nextLine(); //onceki satirdaki 24 u nextInt okuyamaz ama bu satirdaki 
        //nextLine okur ve o yuzden schoolname i giremeden okur gecer.

        System.out.println("fullName = " +fullName);
        System.out.println("language = " + language);
        System.out.println("schoolName = " + schoolName);

    }
}
