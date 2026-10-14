// Run: javac *.java  then  java Main
public class Main {
    public static void main(String[] args) {
        Account alice = new Account("Alice", 5000);
        Account bob   = new Account("Bob",   3000);

        System.out.println("--- Balances ---");
        System.out.println("Alice: Rs." + alice.getBalance() + "  Bob: Rs." + bob.getBalance());

        System.out.println("\n--- Transactions ---");
        new Deposit(alice, 1000).execute();     // polymorphism
        new Withdraw(bob,   500).execute();     // polymorphism
        new Transfer(alice, bob, 2000).execute(); // polymorphism
    }
}
