/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;

/**
 *
 * @author USER
 */
public abstract class Loan {
    protected String loanID;
    protected double interestRate;
    protected double amount;
    protected int loanTerm;
    
    public Loan(String loanID, double interestRate, double amount, int loanTerm){
        this.loanID = loanID;
        this.interestRate = interestRate;
        this.amount = amount;
        this.loanTerm = loanTerm;
    }
    
    public abstract double calculateMonthlyPayment();
    
}
