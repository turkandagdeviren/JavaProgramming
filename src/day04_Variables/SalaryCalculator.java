package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        //hourlyRate, weeklyHours

        int hourlyRate = 65; // artik sadece sayiyi guncelleyerek hesaplamayi guncelleyebiliriz
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        // System.out.println(salary);

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);




    }


}
