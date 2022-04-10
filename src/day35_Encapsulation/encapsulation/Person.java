package day35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    //getters ve setters larla private variable lari diger classlarda kullanilabilir hale getiririz
    // get sadece veriyi return eder ve ek info gerekmedigi icin parantez icine yazacak bi parameter yoktur
    //Return type must match with the data type of the private instance variable

    public String getName(){ //-------> getters method
        return name; //return type (name) instance variable ile ayni olmali
    }

    // in order to give ability for the other classes to be able to set this we will generate setter
    //data type of your parameter has to match with your private variable

    public void setName (String name){ //-------> setters method
        this.name= name;
    }

// static methodlar instance variable lara access edemeyecegi icin getters ve setters methodlar static olamaz
// static means that something that is common for all the objects of the class.
// but each of the object has unique instance value and those are that we want to encapsulate so we use instance method to encapsulate

    public int getAge(){
        return age;
    }

    public void setAge(int age){ // bu method sadece set eder herhangi bi veriyi return etmez o yuzden void kullaniriz
       if(age<=0|| age>150){
           System.err.println("invalid age: "+ age);
           System.exit(0);
       }

        this.age= age;
    }



}
