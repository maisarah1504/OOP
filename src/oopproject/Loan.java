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
public abstract class Loan implements Status{
    private static int loanCounter = 0; // Static counter for loan IDs
    private String loanId; // Auto-generated loan ID
    public double amount;
    public double interestRate;
    public int loanTerm;

   public Loan(double amount, int loanTerm) {
        this.amount = amount;
        this.loanTerm = loanTerm;
        this.loanId = generateLoanId(); // Auto-generate ID
    }

    // Abstract method to get loan type prefix
    protected abstract String getLoanPrefix();

    // Generate a loan ID with the specific prefix
    private String generateLoanId() {
        loanCounter++; // Increment counter
        return String.format("%s%03d", getLoanPrefix(), loanCounter); // Format as "V001", "S002", etc.
    }
    
    protected abstract double calculateMonthlyPayment(double interestRate);

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
    
    public void setLoanId(){
        this.loanId = loanId;
    }
    
    public void setAmount(){
        this.amount = amount;
    }
    
    public void setInterestRate(){
        this.interestRate = interestRate; 
    }
    
    public void setLoanTerm(){
        this.loanTerm = loanTerm;
    }
    
}