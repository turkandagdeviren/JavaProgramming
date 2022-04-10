package day08_IfStatements;

import java.sql.SQLOutput;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age= 19;
        String citizen = "USA";

        boolean isEligibleForVote = age >=18 && citizen == "USA";

        //                          19>=18 && "UK" == "USA"
        //                          true && false ===> false

        //                          18>=18 && "USA" == "USA"
        //                          true && true ===> true

        System.out.println(name + " is eligible to vote: "+ isEligibleForVote);

        System.out.println("-----------------------------------");

        String name2= "Josh";
        int creditScore = 800; //must be at least 700
        int age2 = 23; // must be at least 20
        int income = 40000;

        boolean isEligibleForLoan = creditScore >=700 && age2>=20 && income >=60000;

        System.out.println(name2 + " is eligible for loan: " + isEligibleForLoan );

        System.out.println("-----------------------------------");

        String name3= "Shay";
        int age3 = 21;
        char gender ='F';

        boolean isEligible3 = age3>=18 && (gender == 'M'|| gender == 'F');
        //                      21>18  && ('F' == 'M' || 'F' == 'F')
        //                      true && (false || true)
        //                      true && true
        //                      true

        System.out.println(name3 +" is eligible to register: "+ isEligible3);

        System.out.println("-----------------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth =="USA" || marriedToUSCitizen == true;
        //                      false                  || false
        // || durumlarinda ilk sart tamam ise digerine bakmasina gerek yok, && durumunda tum kosullar karsilanmali
        System.out.println(name4 + " is eligible to apply for US citizenship: "+ isEligible4);

        String student= "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligibleForScholarship = gpa >=3.5 || familyIncome <=60000;
        System.out.println("-----------------------------------");

        System.out.println(student + " is eligible for scholarship: "+isEligibleForScholarship);

        System.out.println("-----------------------------------");

        //! true ==> false    , false ==> true

        int score = 55;
        boolean passed = score>=60;
        boolean failed = ! passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


























    }




}
