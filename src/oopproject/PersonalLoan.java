/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

/**
 *
 * @author USER
 */

public class PersonalLoan extends Loan {
    private String loanPurpose; // Purpose of the loan (e.g., home renovation, vacation, medical)
    private double repayment;

    public PersonalLoan(String loanID, double amount, double interestRate, int loanTerm, String loanPurpose) {
        super(loanID, interestRate, amount, loanTerm);
        this.loanPurpose = loanPurpose;
        this.repayment = calculateMonthlyPayment();  // Set repayment during initialization
    }

    // Getter and Setter for loanPurpose
    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    @Override
    public double calculateMonthlyPayment() {
        double monthlyRate = interestRate / 12 / 100;
        return (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanTerm));
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nLoan Purpose: " + loanPurpose;
    }
}
