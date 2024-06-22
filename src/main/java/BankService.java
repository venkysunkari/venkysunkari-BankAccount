public class BankService {
    /**
     * The balance should be kept private. If it were public, then other developers could write code in other classes
     * that could cause the balance to exhibit unintended behavior, like being negative. The private access modifier
     * will allow only the methods within this class to interact with the balance.
     */
    private double balance;
    
    /**
     * A constructor to build a BankService object that will start the bank balance at 0. There is no need to change
     * anything in this constructor.
     */
    public BankService(){
        this.balance = 0;
    }
    
    /**
     * TODO: implement functionality to increase the user's balance by amount.
     * @param amount the amount to be deposited.
     */
    public void deposit(double amount) {
        // Increase the balance by the deposit amount
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * TODO: implement functionality to decrease the user's balance by an amount.
     * If a withdrawal would result in the user having a negative balance, the withdrawal should not occur.
     * @param amount the amount to be withdrawn.
     */
    public void withdraw(double amount) {
        // Decrease the balance by the withdrawal amount if it doesn't cause a negative balance
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }

    /**
     * TODO: return the balance.
     * @return the user's balance.
     */
    public double getBalance() {
        // Return the current balance
        return this.balance;
    }
}
