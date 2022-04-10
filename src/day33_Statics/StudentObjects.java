package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1= new Student("Ahmet");

        Student student2= new Student("Aygun",'F');

        Student student3= new Student("Nigara",11);

        Student student4= new Student("Mert",22,'B');

        Student student5= new Student("Cihad",'M',19);

        Student student6= new Student("Ali",'M',27,15);

        Student student7= new Student("Mehmet", 'M',19,34,'A');

        System.out.println(student1==student2);

        Student[] students= {student1, student2, student3, student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));

    }
}
