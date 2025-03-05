package week6;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name,double balance){
        this.accountHolder=name;
        this.balance=balance;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public double checkBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdrawl(double amount){
        this.balance-=amount;
    }
    public void transfer(BankAccount other,double amount){
        this.withdrawl(amount);
        other.deposit(amount);
    }
    public boolean isOverdrawn(){
        return this.balance<0;
    }
}
