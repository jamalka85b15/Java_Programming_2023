package day38_exceptionHandling.shapeTask;

public class InvalidShapeExcpetion extends RuntimeException{

    public InvalidShapeExcpetion(String message){
        super(message);
    }
}
