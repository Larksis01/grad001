/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eviro.assessment.grad001.lakiwedlulanefinal;

/**
 *
 * @author ADMIN
 */
import java.math.BigDecimal;
public class CurrentAccount
{
    protected float balance;
    protected float numDeposits;
    protected float numWithdrawals;
    protected float annualRate;
    protected float monthlyServCharg;
     
 public CurrentAccount()
    {
        balance = 0;
        numDeposits = 0;
       numWithdrawals = 0;
        annualRate = 0;
        monthlyServCharg = 0;
    }
    public CurrentAccount(float bal, float rate)
    {
   balance = bal;
   annualRate = rate;
    }
    public void deposit(float amount)
    {
        balance += amount;
        numDeposits++;
    }
    public void withdraw(float amount)

    {
        balance -= amount;
        numDeposits++;
    }
    public void calcInterest()
    {
        float monRate = annualRate / 12;
        float monInt = balance * monRate;
        balance += monInt;
    }
    public void monthlyProcess()
    {
        balance -= monthlyServCharg;
        calcInterest();

        numWithdrawals = 0;

        numDeposits = 0;
        monthlyServCharg = 0;
    }
}
