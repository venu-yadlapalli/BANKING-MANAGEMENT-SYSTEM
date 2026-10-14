// INHERITANCE + POLYMORPHISM — 3 classes extend Transaction, each execute() differs

class Deposit extends Transaction {
    private Account a;
    Deposit(Account a, double amt)  { super(amt); this.a = a; }
    public void execute()           { a.deposit(amount);  System.out.println("Deposited  Rs." + amount + " → " + a.getOwner() + " Rs." + a.getBalance()); }
}

class Withdraw extends Transaction {
    private Account a;
    Withdraw(Account a, double amt) { super(amt); this.a = a; }
    public void execute()           { a.withdraw(amount); System.out.println("Withdrew   Rs." + amount + " → " + a.getOwner() + " Rs." + a.getBalance()); }
}

public class Transfer extends Transaction {
    private Account from, to;
    Transfer(Account f, Account t, double amt) { super(amt); this.from = f; this.to = t; }
    public void execute() {
        from.withdraw(amount); to.deposit(amount);
        System.out.println("Transferred Rs." + amount + " | " + from.getOwner() + " Rs." + from.getBalance() + " | " + to.getOwner() + " Rs." + to.getBalance());
    }
}
