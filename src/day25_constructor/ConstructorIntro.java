package day25_constructor;

public class ConstructorIntro {
    public  ConstructorIntro(){
        System.out.println("Object is created by using int argument");
    }
    public  ConstructorIntro(int a){
        System.out.println("Object is created by using int argument");
    }

    public static void main(String[] args) {

       ConstructorIntro object =new ConstructorIntro(5);
        ConstructorIntro object2 =new ConstructorIntro();
        ConstructorIntro object3 =new ConstructorIntro(5);



    }
}
