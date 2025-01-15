/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

/**
 *
 * @author USER
 */
public class StudyLoan extends Loan{
    private String universityName;
    private String programOfStudy;
    private double repayment; 

    public StudyLoan(double amount, int loanTerm, String universityName, String programOfStudy){
        super(amount, loanTerm);
        this.universityName = universityName;
        this.programOfStudy = programOfStudy;
        
    }
    public StudyLoan(double amount, int loanTerm){
        super(amount, loanTerm);
    }
    
    @Override
    protected String getLoanPrefix() {
        return "S"; // Prefix for Study loans
    }
    
    @Override
    public double getMonthlyPayment() {
        double monthlyRate = interestRate / 12 / 100;
        return (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanTerm));
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getProgramOfStudy() {
        return programOfStudy;
    }

    public void setProgramOfStudy(String programOfStudy) {
        this.programOfStudy = programOfStudy;
    }
}

