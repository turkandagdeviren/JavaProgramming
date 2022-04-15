package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        //Cydeo class does have has relation with developer tester teacher and student classes

        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 125000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);
        System.out.println("-----------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        developer.work();
        tester.work();
        teacher.work();
      //  student.work(); since it is not the child class of the employee class it doesnt have work method

        System.out.println("-----------------------------------");

        developer.eat(); // hem employee hem person oldugu icin bu methodlari da kullanabilir
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("-----------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        //tester.fixingBugs();// that is not the action of tester
        tester.createTicket();

        System.out.println("-----------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

      //  teacher.creatingTicket(); those methods was never inherited in the teacher class so teacher class has not this property

        System.out.println("-----------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        //student.fixingBugs();
       // student.createTicket();those methods was never inherited in the student class

        student.study();
        System.out.println(student.getFieldOfStudy());

    }

}
