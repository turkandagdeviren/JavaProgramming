package day40_FinalKeyword;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

//to generate getter, return type should be matched with the private datas data type
//to generate setter,parameter should be matched with the data type of your private data

/*INHERITANCE
with the help of inheritance we write less code
inheritance-> is a relation. parent & child classes (super& sub)
child class inherits the variables and methods (that are visible to child class) from parent class
parent class can not inherit anything from child
child class can not inherit constructor from the parent class since constructor must have the same name of the class name
but the constructor of parents class has to be called in the child class
if there is not constructor in the parent class we call it explicitly
we call the parents classes members by using "super" word.
inheritance allows us to create our framework in centralised structure and less code.

*/

public class EncapsulationReview {

    private Circle circle;
    private Square square;
    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){
        if( circle.getRadius()<5){
            return;
        }
        this.circle= circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
