package Main;

public class BankAccount {
//    When we create BankAccount instance, assigns it a currentBalance
//    (Like an initialise)
    private int currentBalance;

//    Function that returns the current balance
    public Integer balance() {
        return currentBalance;
    }

//    Function that adds money to the bank account balance
    public Integer deposit(int money) {
        currentBalance += money;
        return currentBalance;
    }

//    Function that takes money off of the balance
    public Integer withdraw(int money) {
        currentBalance -= money;
        return currentBalance;
    }
}
