package main;

import java.util.Set;

public class BankAccount{
    int SetBalance = 0;

    public BankAccount(int Balance){
        SetBalance = Balance;
    }

    public static void main(String[] args){
        //If we want to print something we can do here...
    }

    public Integer ViewBalance(){
        return SetBalance;
    }

    public void DepositMoney(int Deposit){
        SetBalance = SetBalance + Deposit;
    }

    public void WithdrawMoney(int Withdrawal){
        SetBalance = SetBalance - Withdrawal;
    }
}
