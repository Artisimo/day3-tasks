public class BankAccount {
    private double balance;

    public BankAccount(){}

    public BankAccount(double balance){
        this.balance = balance;
        System.out.println("Created a bank account with balance: " + this.balance);
    }

    public boolean deposit(double amount){
        if(amount < 0){
            System.out.println("Cannot deposit a negative number");
            return false;
        }else if(amount > 5000){
            System.out.println( "Transaction cancelled. Max deposit - 5000 | Your deposit: " + amount);
            return false;
        }else{
            this.balance += amount;
            System.out.println( "Deposited: " + amount);
            return true;
        }
    }

    public boolean withdraw(double amount){
        if(amount < 0){
            System.out.println("Cannot withdraw a negative number");
            return false;
        }else if(amount < this.balance){
            this.balance -= amount;
            System.out.println( "Withdrew: " + amount);
            return true;
        }else{
            System.out.println("There is not enough funds.");
            return false;
        }
    }

    public void printBalance(){
        System.out.println("Balance is: " + this.balance);
    }

    public boolean transferFrom(double amount, BankAccount transferTo){
        if(amount < 0){
            System.out.println("Cannot transfer negative number");
            return false;
        }else if(amount < this.balance){
            this.balance -= amount;
            transferTo.deposit(amount);
            return true;
        }else{
            System.out.println("Transfer cancelled. You are trying to transfer " + amount + " units, but only " + this.balance + " are available.");
            return false;
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

        B.transferFrom(24, A);
        A.printBalance();
        B.printBalance();
    }
}
