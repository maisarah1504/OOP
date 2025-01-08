/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

/**
 *
 * @author USER
 */
public class StudyLoan extends Loan {
    private String universityName;
    private String programOfStudy;

    public StudyLoan(String loanID, double amount, int loanTerm, String universityName, String programOfStudy) {
        super(loanID, amount, loanTerm);
        this.universityName = universityName;
        this.programOfStudy = programOfStudy;
    }

    @Override
    public double calculateMonthlyPayment() {
        double monthlyRate = interestRate / 12 / 100;
        return (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanTerm));
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nUniversity Name: " + universityName +
               "\nProgram of Study: " + programOfStudy;
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

