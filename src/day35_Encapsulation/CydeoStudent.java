package day35_Encapsulation;

public class CydeoStudent {

    public String name, fieldOfStudy;
    public char gender;
    public int age, batchNumber, groupnumber;
    public static String schoolName, programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, String fieldOfStudy, char gender, int age, int batchNumber, int groupnumber) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupnumber = groupnumber;
    }

    static{
        schoolName="Cydeo";
        programmingLanguage="Java";
    }

    public static void printSchoolName(){
        System.out.println("School is "+ schoolName);
    }
    public static void printSecretCode(){
        System.out.println("Code is " + secretCode);
    }

    public void attendClass(){
        System.out.println(name+ " is attending class");
    }
    public void study(){
        System.out.println(name+ "is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupnumber=" + groupnumber +
                ", school=" + schoolName +
                ", programming language=" + programmingLanguage + //school name ve programming language i biz ekledik
                '}';                                            // instance ve static variable in birlikte oldugu methodlarda instance method kullaniriz
    }
}
/*
2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */
