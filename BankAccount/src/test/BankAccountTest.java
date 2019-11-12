package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BankAccountTest {

    @Test
    public void ViewingTheAccountBalance(){

        main.BankAccount account = new main.BankAccount(100);

        assertEquals(100, account.ViewBalance());
    }

    @Test
    public void DepositMoney(){

        main.BankAccount account = new main.BankAccount(100);

        account.DepositMoney(50);

        assertEquals(150, account.ViewBalance());
    }

    @Test
    public void WithdrawMoney(){
        main.BankAccount account = new main.BankAccount(100);

        account.WithdrawMoney(30);

        assertEquals(70, account.ViewBalance());
    }
}
