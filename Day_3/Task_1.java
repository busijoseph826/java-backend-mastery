class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidWithdrawalAmountException extends Exception {
    public InvalidWithdrawalAmountException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException, InvalidWithdrawalAmountException {

        if (amount <= 0) {
            throw new InvalidWithdrawalAmountException(
                    "Withdrawal amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance: " + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class Task_1 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(2000);
            account.withdraw(4000);
        } catch (InsufficientBalanceException | InvalidWithdrawalAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(-500);
        } catch (InsufficientBalanceException | InvalidWithdrawalAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}