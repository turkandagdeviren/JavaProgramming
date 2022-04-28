package day42_Exceptions;

class FadyException extends RuntimeException{ // custom unchecked exception

    public FadyException(){ //constructor
        super("time for a short break");
    }

    public FadyException(String message){ //constructor
        super(message);
    }



    //2 tane constructor olduguna gore 2 farkli sekilde object create edilebilir.() yazarsam "time for a short break" cikar, bir mesaj yazarsam  ("it is time for lunch break") o cikar.
}

class NoBreakException extends Exception{ // custom checked exception (olmasi icin exceptiona extend ettik)


}

public class CustomExceptions {

    public static void main(String[] args) {

     //   throw new FadyException("it is time for lunch break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }

}
