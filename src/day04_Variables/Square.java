package day04_Variables;
/*task: create a class named Square, write a program that can calculate the area& perimeter of any given square
  area = side * side
  perimeter = 4 * side

 */

public class Square {
    public static void main(String[] args) {

        int side = 6;
        int area = side * side;
        int  perimeter = 4 * side;

        System.out.println("side = " + side + "cm");
        System.out.println("perimeter = " + perimeter + "cm");
        System.out.println("area = " + area + "cm2");


    }
}
