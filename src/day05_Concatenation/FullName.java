package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Turkan";
        String secondName = "Zeynep";
        String fullName = firstName +" " + secondName;
        int age = 35;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        //Full name of the person is______

        System.out.println("Full name of the person is " + fullName );

        //____ is ___ years old


        System.out.println(fullName + " is " + age + " years old");
        // FullName is JobTitle, works at CompanyName, and FullName's salary is salary

        System.out.println(fullName +" is " + jobTitle + ", works at " + companyName + ", and " + fullName + "'s salary is " + salary);



    }






}
