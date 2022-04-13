package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name== null){
            System.err.println("name can not be null");
            System.exit(1); //1: something went wrong
        }
        //""-> empty,  null-> there is no object
        if(name.isEmpty()|| name.isBlank()){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) { //constructor
        setName(name);
    }

    public double area(){
        return 0;// diger subclasslarda degistirecegiz o yuzden boyle belirledik
    }

    public double perimeter(){
        return 0;
    }


}
/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */