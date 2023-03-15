package day07_ifStatements;

public class LoanApplication {

    public static void main(String[] args) {
        int salary = 35000,
                creditScore =710;
        String result="";
        if(salary >= 45000 && creditScore >= 700){
            result ="Approved";
        }else{
            result ="Not Approved";
        }
        System.out.println(result);
    }
}
