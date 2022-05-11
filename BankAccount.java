public class BankAccount {
    private double balance;

    public BankAccount(){}

    public BankAccount(double balance){
        this.balance = balance;
        System.out.println("Created a bank account with balance: " + this.balance);
    }

    public void deposit(double amount){
        if(amount > 5000){
            System.out.println( "Transaction cancelled. Max deposit - 5000 | Your deposit: " + amount);
        }else{
            this.balance += amount;
            System.out.println( "Deposited: " + amount);
        }
    }

    public void withdraw(double amount){
        if(amount < this.balance){
            this.balance -= amount;
            System.out.println( "Withdrew: " + amount);
        }else{
            System.out.println("There is not enough funds.");
        }
    }

    public void printBalance(){
        System.out.println("Balance is: " + this.balance);
    }

    public void transferFrom(double amount, BankAccount transferTo){
        if(amount < this.balance){
            transferTo.deposit(amount);
        }else{
            System.out.println("Transfer cancelled. You are trying to transfer " + amount + " units, but only " + this.balance + " are available.");
        }
    }

    public static void main(String[] args) {
        BankAccount A = new BankAccount(50);
        BankAccount B = new BankAccount(25);

        A.printBalance();
        A.withdraw(100);
        A.printBalance();
        A.deposit(5001);
        A.printBalance();

        B.transferFrom(30, A);
        A.printBalance();
        B.printBalance();
    }
}
