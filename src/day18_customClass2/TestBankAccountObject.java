package day18_customClass2;

public class TestBankAccountObject {

    public static void main(String[] args) {

        BnkAccount account1=new BnkAccount();
        account1.setInfo("Jama", 210769, 0);
        account1.checkBalance();
   account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(500);
        account1.checkBalance();
        account1.withdraw(700);
        account1.checkBalance();
    }

}
