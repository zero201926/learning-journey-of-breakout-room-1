package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    public void canViewBalance() {
//        Creating new instance of BankAccount class
        Main.BankAccount account = new Main.BankAccount();
//        Expecting account to start off empty
        assertEquals(0, account.balance());
    }

    @Test
    public void canDepositMoney() {
//        Creating new instance of BankAccount class
        Main.BankAccount account = new Main.BankAccount();
//        Call function deposit to add money to balance
        account.deposit(10);
//        Expecting the balance to have increased by 10
        assertEquals(10, account.balance());
    }

    @Test
    public void canWithdrawMoney() {
//        Creating new instance of BankAccount class
        Main.BankAccount account = new Main.BankAccount();
        account.deposit(10);
        account.withdraw(5);
        assertEquals(5, account.balance());
    }
}