package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1= new Employee("Tahir", 'M', 30, 120000);
        System.out.println(employee1);
//yanlis veriler girerek yaptigimizda: Employee{name='null', gender= , age=0, salary=0.0} bu demektir ki veriler hic set olmamis

        employee1.setAge(32);
        System.out.println(employee1);

        Employee employee2= new Employee("Aygun",'F',31, 115000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary()+15000);

        System.out.println(employee1);
        System.out.println(employee2);


    }
}
