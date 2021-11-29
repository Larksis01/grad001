/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.eviro.assessment.grad001.lakiwedlulanefinal;

/**
 *
 * @author ADMIN
 */
import java.math.BigDecimal;

public class SavingsAccount extends CurrentAccount
{
    private boolean active;
     
    public SavingsAccount(float bal, float rate)
    {
        super(bal, rate);
        if(bal < 25)
            active = false;
        else
            active = true;
    }
    public void withdraw(float amount)
    {
        if(active)
            super.withdraw(amount);
    }
    public void deposit(float amount)
    {
        if(!active)
        {
            if(amount + balance < 25)
                return;
        }
        super.deposit(amount);
    }
    public void monthlyProcess()
    {
        if(numWithdrawals > 4)
        {
            monthlyServCharg += numWithdrawals - 4;
        }

        super.monthlyProcess();
        if(balance < 25)
            active = false;
    }
    public void printStatus()
    {
        System.out.println("Balance: " + balance);

        System.out.println("Charges: " + monthlyServCharg);
        System.out.println("Number of Transactions: " + (numDeposits + numWithdrawals));
        System.out.println();
    }
}



