package day09_IfStatements;

public class Task3 {
    public static void main(String[] args) {

        /*
        3. Write a progrm that can check if the person is eligible to buy alcohol

         */

        int age= 17;
        String name = "Alex";

        if (age>=18) {
            System.out.println(name + " is eligible to buy alcohol");
    }else {
            System.out.println(name + " is not eligible to buy alcohol");
        }
}

}
