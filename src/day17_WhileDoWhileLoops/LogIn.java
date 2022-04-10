package day17_WhileDoWhileLoops;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter your username:");
        String u = scan.next();
        System.out.println("enter your password:");
        String p = scan.next();


        if (u.equals("Cydeo")&& p.equals("Cydeo123")){
            System.out.println("logged in");
        }else {
            int attempts = 3;
            while (!(u.equals("Cydeo")&& p.equals("Cydeo123")) && attempts>0){

                if(attempts==1){
                    System.out.println("this is last chance");
                }
                System.out.println("incorrect username or password, please re-enter");
                System.out.println("enter your username:");
                u= scan.next();
                System.out.println("enter your password:");
                p= scan.next();
                attempts --;
            }

            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("logged in");
            }else{
                System.out.println("your account is locked");
            }


        }




        scan.close();

    }
}
/*
You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

 Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have
                three attempts
                to enter correct credentials and if all three
                attempts are failed, then print "Your account is locked."
 */
