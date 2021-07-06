
public class BankAccountDemo {
    public static void main(String[] args) {
        // test ctor 1
        BankAccount ac = new BankAccount("A C");
        // test ctor 2
        BankAccount ac2 = new BankAccount("A C 2", 200);

        // test invalid balance to ctor
        BankAccount ac3 = new BankAccount("Invalid Balance", -1);

        // test getOwner
        System.out.println(ac.getOwner());
        // test getBalance is 0 for ctor 1

        // test valid deposit
        ac.deposit(100);
        System.out.println(ac.getBalance());
        // test valid withdraw
        ac.withdraw(100);
        System.out.println(ac.getBalance());

        System.out.println(ac.getBalance());
        // test invalid deposit
        ac.deposit(-10);
        System.out.println(ac.getBalance());
        // test invalid withdraw
        ac.withdraw(-10);
        System.out.println(ac.getBalance());
        // test withdraw more than balance
        ac.withdraw(10);
        System.out.println(ac.getBalance());
    }

}
