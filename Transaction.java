public abstract class Transaction {             // ABSTRACTION
    protected double amount;
    public Transaction(double amt)             { this.amount = amt; }
    public abstract void execute();            // subclasses define HOW
}
