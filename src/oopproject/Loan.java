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
public abstract class Loan implements Repayment{
    private static int loanCounter = 0; // Static counter for loan IDs
    private String loanId; // Auto-generated loan ID
    public double amount;
    public double interestRate;
    public int loanTerm;

   public Loan(double amount, int loanTerm) {
        this.amount = amount;
        this.loanTerm = loanTerm;
        this.loanId = generateLoanId(); // Auto-generate ID
        this.interestRate = 0.1;
    }

    // Abstract method to get loan type prefix
    protected abstract String getLoanPrefix();

    // Generate a loan ID with the specific prefix
    private String generateLoanId() {
        loanCounter++; // Increment counter
        return String.format("%s%03d", getLoanPrefix(), loanCounter); // Format as "V001", "S002", etc.
    }
    
    // Abstract methods from Repayment interface

    /**
     *
     * @return
     */
    @Override
    public abstract double getMonthlyPayment();
    
    /**
     *
     */
    @Override
    public String toString() {
        return String.format(
            "Loan ID: %s\nAmount: RM%.2f\nLoan Term: %d months\nInterest Rate: %.2f%%\nMonthly Payment: RM%.2f\n\n",
            loanId, amount, loanTerm, interestRate * 100, getMonthlyPayment()
        );
    }

    
    public String getLoanId() {
        return loanId;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }
    
    public void setLoanId(String loanId){
        this.loanId = loanId;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public void setInterestRate(double interestRate){
        this.interestRate = 0.1; 
    }
    
    public void setLoanTerm(int loanTerm){
        this.loanTerm = loanTerm;
    }
    
}