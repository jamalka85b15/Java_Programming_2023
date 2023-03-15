package day18_customClass2;

public class BnkAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BnkAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your balance is "+ balance);
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(balance< amount){
            System.out.println("You have not enough funds to withdraw, will cause Overdraft");
            return;

        }
        System.out.println("Withdrawing $"+amount+ " from "+ accountNumber);
        balance-=amount;

    }
}
