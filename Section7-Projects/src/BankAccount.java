public class BankAccount {
    private String owner;
    private int balance;
    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    } // end ctor
    public BankAccount(String owner,int balance) {
        this.owner = owner;
        if(balance <= 0) {
            System.out.println("Invalid balance value " + balance);
            return;
        }
        this.balance = balance;
    } // end ctor
    public String getOwner() {
        return this.owner;
    }
    public int getBalance() {
        return this.balance;
    }
    public void deposit(int amount) {
        if(amount <= 0) {
            System.out.println("Invalid deposit amount " + amount);
            return;
        }
        this.balance += amount;
    }
    public void withdraw(int amount) {
        if(amount <= 0) {
            System.out.println("Invalid withdrawal amount " + amount);
            return;
        }
        if (amount > this.getBalance()) {
            System.out.println("Withdrawal amount " + amount +
                    " cannot be greater than available balance " + this.getBalance());
            return;
        }
        this.balance -= amount;
    }

}
