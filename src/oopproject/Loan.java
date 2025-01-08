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
    protected double interestRate = 10.0;
    protected double amount;
    protected int loanTerm;
    
    public Loan(String loanID, double amount, int loanTerm){
        this.loanID = loanID;
        this.amount = amount;
        this.loanTerm = loanTerm;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public abstract double calculateMonthlyPayment();
    
}
