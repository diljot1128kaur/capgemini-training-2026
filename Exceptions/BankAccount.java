import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        if(amount>balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance-=amount;
        System.out.println("Withdrawal successful, new balance: "+balance);
    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double balance=sc.nextDouble();
        double amount=sc.nextDouble();

        BankAccount b1=new BankAccount(balance);
        try{
            b1.withdraw(amount);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
