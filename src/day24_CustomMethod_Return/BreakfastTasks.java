package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initialsName("turkan", "dagdeviren");
        System.out.println("----------------");
        domain("turkan@yahoo.com");
        System.out.println("----------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("----------------");

        nameOfMonth(12);

        System.out.println("----------------");

        daysInMonth(2, 2000);

    }

    //1. Create a method that can display the initials of the person

    public static void initialsName(String name, String surname) {

        System.out.println(name.toUpperCase().charAt(0) + "." + surname.toUpperCase().charAt(0));

    }

    //2. Create a method that can display the domain of the email

    public static void domain(String mailadress) {

        String domain = mailadress.substring(mailadress.indexOf("@") + 1, mailadress.indexOf("."));
        System.out.println(domain);
    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
        String name = "";

        if (number <= 12 && number >= 0) {
            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" :
                    (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September" :
                            (number == 10) ? "October" : (number == 11) ? "November" : "December";
        } else {
            name = "invalid";
        }


        System.out.println("name = " + name);

    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number) {

    }
    //5. Create a method that can print how many days a month has

    public static void daysInMonth(int num, int year) {
        String month = "";

        if (num >= 1 && num <= 12) {

            switch (num) {
                case 2:
                    if (year % 4 == 0) {
                        month = "29 days";
                    } else {
                        month = "28 days";
                    }
                    break;

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    month = "31 days";
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    month = "30 days";
                    break;

            }

        } else {
            month = "invalid";
        }

        System.out.println(month);
    }

    //6.age groups (int age)


}




