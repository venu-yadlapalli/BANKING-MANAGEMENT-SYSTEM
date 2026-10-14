

public class Account {                          // ENCAPSULATION
    private String owner;
    private double balance;

    public Account(String owner, double bal) 
      { 
        this.owner = owner; 
        this.balance = bal;
     }
    public String getOwner()                  
     {
         return owner; 
    }
    public double getBalance()                
    
    {
         return balance; 
        }
    public void deposit(double amt)          
      {
         balance += amt; 
        }
    public void withdraw(double amt) 
    {
        if (amt > balance)
             {
                 System.out.println("Insufficient funds!");
                  return;
                 }
        balance -= amt;
    }
}
