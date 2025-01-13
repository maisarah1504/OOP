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
    private double amount;
    private double interestRate;
    private int loanTerm;

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

    @Override
    public String toString() {
        return "Loan ID: " + loanId + "\n" +
               "Loan Amount: $" + amount + "\n" +
               "Interest Rate: " + interestRate + "%\n" +
               "Loan Term: " + loanTerm + " months";
    }
}