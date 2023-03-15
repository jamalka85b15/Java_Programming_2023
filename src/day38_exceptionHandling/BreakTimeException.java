package day38_exceptionHandling;

public class BreakTimeException extends RuntimeException{

    public BreakTimeException(){
        super("Its break time");
    }
    public BreakTimeException(String message){
      super(message);
    }

}
