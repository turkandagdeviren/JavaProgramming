package day43_Abstraction.Employee;


// hem parent hem child class abstract ise abstract methodlar dogrudan inherite olur ve implement etmez sart olmaz. child class abstract degilse abstract methodun implement edilmesi sarttir
public abstract class Employee extends Person {
    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if(id<=0){
            throw new RuntimeException("invalid ID: "+id);
        }
        this.id = id; // final oldugu icin set e ceviremiyoruz ve condition'i constructor icinde belirtiyoruz

        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                "age=" + getAge() +
                "gender=" + getGender() +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
