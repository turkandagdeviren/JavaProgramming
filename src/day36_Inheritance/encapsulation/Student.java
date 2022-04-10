package day36_Inheritance.encapsulation;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public static boolean isStudent= true;
    public static boolean isHuman= true;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public char getGrade(){
        return grade;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setAge(int age){
        if(age<5|| age>90){
            return;
        }
        this.age= age;
    }
    public void setGender(char gender){
        if(!(gender=='M'|| gender=='F')){
            return;
        }
        this.gender= gender;
    }
    public void setGrade (char grade){
        if(!(grade=='A'|| grade=='B'|| grade=='C'|| grade=='D'|| grade=='F')){
            return;
        }
        this.grade= grade;
    }
    public void setSchoolName(String schoolName){
        this.schoolName= schoolName;
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public void study(){
        System.out.println(name+ " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

}
/*
1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fields (at least encapsulate two fields manually)
					requirements:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any character other than: 'M' and 'F'
						3. grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirements of fields in the above must be applied)

						Methods:
				study()
				toString()
 */