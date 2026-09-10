class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class DailyLimitExceededException extends Exception {
    DailyLimitExceededException(String message) {
        super(message);
    }
}

class Bank {
    double balance = 10000;
    double dailyLimit = 5000;
    double todayWithdrawn = 0;

    void withdraw(double amount)
            throws InsufficientBalanceException,
                   InvalidAmountException,
                   DailyLimitExceededException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount");
        }

        if (todayWithdrawn + amount > dailyLimit) {
            throw new DailyLimitExceededException(
                    "Daily withdrawal limit of Rs. 5000 exceeded");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance");
        }

        balance -= amount;
        todayWithdrawn += amount;

        System.out.println("Withdrawal successful: Rs. " + amount);
        System.out.println("Remaining balance: Rs. " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        try {
            bank.withdraw(6000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        catch (DailyLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
