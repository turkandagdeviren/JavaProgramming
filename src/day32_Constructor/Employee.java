package day32_Constructor;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name){
        this.name= name;
    }

    public Employee(String name, char gender){

       this(name);//boylece name cagiran employee methodunu burada kullanabilmis olduk. this() ve parantez icine argument i yaziyoruz
       // this.name= name;
        this.gender= gender;
    }

    public Employee (String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle= jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary= salary;
    }

/*NOTLAR:
this: refers to the instances

	this. : to call instance variables & instance methods
	this() : used for calling the constructors


Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor, it can call only one constructor
		5. Constructor can not call or contain itself
 */





    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*public void method1(){ // normal methodlarda bir diger methodu adiyla cagirabiliyoruz ama instance methodlarda boyle yapamiyoruz
        System.out.println("Method 1");
    }

    public void method2(){
        method1();
    }
    */


}
