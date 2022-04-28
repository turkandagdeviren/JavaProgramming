package day43_Abstraction.Employee;


public abstract class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {

        setName(name);
        setAge(age);
        setGender(gender);
    }

    public abstract void sleep(); // parent classta metodun detayiyla ilgilenmek istemedigimiz icin abstract yapiyoruz

    public void eat(){
        System.out.println(name+ " is eating baklava"); // common step oldugunu varsayiyoruz o yuzden abstract olmasi sart degil
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("invalid age: "+ age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
