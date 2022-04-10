package day04_Variables;

/*

Create a class named EmployeeInfo. declare the following variables:
				1. name (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExpereince (double)
				7. salary (int)
				8.  (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)
 */

public class EmployeeInfo {
    public static void main(String[] args) {

     String name = "Turkan";
     int age = 38;
     char gender = 'F';
     String company = "Axel";
     String jobTitle = "IT Manager";
     double yearsOfExperience = 5;
     int salary = 35000;
     boolean isFullName= true;
     boolean isMarried = true;
     String employeeId = "1234";
     String ssn= "(12)-345";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary +"$");
        System.out.println("isFullName = " + isFullName);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("ssn = " + ssn);


    }



}
