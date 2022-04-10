package week04;

public class TrafficLightSelecotr {
    public static void main(String[] args) {

        char color= 'R';
        switch (color){

            case 'R': case 'r' : //or logic
                System.out.println("red light");
                break;

            case 'O': case 'o' : //or logic
                System.out.println("orange light");
                break;

            case 'G': case 'g' : //or logic
                System.out.println("green light");
                break;
            default:
                System.out.println("invalid light");



        }



    }
}
