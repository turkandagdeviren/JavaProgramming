package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1= new Employee();
        employee1.name= "Ahmet";
        employee1.salary= 110000;


        Employee employee2= new Employee();
        employee2.name="Aygun";
        employee2.salary= 115000;

        Employee employee3= new Employee();
        employee3.name="Fady";
        employee3.salary= 120000;

        System.out.println(employee1.name+" : "+ employee1.salary);
        System.out.println(employee2.name+" : "+ employee2.salary);
        System.out.println(employee3.name+" : "+ employee3.salary); // hepsinde salary 120000 olarak yazdirir.
        // cunku salaryi static variable olarak atamistik. hepsi ayni degere sahip olur.en son ne deger verdiysen onu hepsine atar.
        //static means that all the objects has the same value if it is static variable.

        System.out.println(employee1.isHuman); //isHuman static variable oldugu icin ve degeri true old icin hepsine true diyecek
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);

    }
}
