package day06_ifStatements;

public class Cigarettes {

    public static void main(String[] args) {
        int age =99;
        if(age < 21){
            System.out.println("You not eligibale to buy a Cigarette");
        }
        if(age >= 21 && age <100 ){
            System.out.println("You  eligibale to buy a Cigarette");
        }
    }
}
