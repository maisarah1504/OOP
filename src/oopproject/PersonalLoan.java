/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

/**
 *
 * @author USER
 */

public class PersonalLoan extends Loan{
    private String loanPurpose; // Purpose of the loan (e.g., home renovation, vacation, medical)
    private double repayment;
    
    public PersonalLoan(double amount, int loanTerm, String loanPurpose) {
        super(amount, loanTerm);
        this.loanPurpose = loanPurpose;
//        this.repayment = calculateMonthlyPayment(interestRate);  
    }
    
    @Override
    protected String getLoanPrefix() {
        return "P"; // Prefix for Personal loans
    }
    
    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    /**
     *
     * @return
     */
    @Override
    public double getMonthlyPayment() {
        double monthlyRate = interestRate / 12 / 100;
        return (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanTerm));
    }

    @Override
    public double getTotalPayment() {
        return getMonthlyPayment() * loanTerm;
    }
}
