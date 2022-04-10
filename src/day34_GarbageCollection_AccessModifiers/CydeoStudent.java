package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {
    public String studentName;
    public static String schoolName; // okulun adini burada da assign edebiliriz ama o zaman her seferinde yeniden yazdirir ve efficient olmaz, o yuzden static blokta assign etmek daha efficient

    public CydeoStudent(String studentName){
        this.studentName= studentName;

    }
static{
    schoolName="Cydeo School";
}

}


class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent student1= new CydeoStudent("Jimmy");
        CydeoStudent student2= new CydeoStudent("Kathy");
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName); // both are Cydeo School

    }
}