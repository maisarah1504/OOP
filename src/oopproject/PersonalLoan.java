/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

/**
 *
 * @author USER
 */
class PersonalLoan {
    public String loanPurpose;
    public double loanPackage;
    public int duration;
    
    public PersonalLoan (String loanPurpose, double loanPackage, int duration) {
    this.loanPurpose = loanPurpose;
    this.loanPackage = loanPackage;
    this.duration = duration;
    }
    
    public void displayLoanDetails(){
    System.out.println("Loan Purpose: " + loanPurpose);
    System.out.println("Loan Pacakge: RM" + String.format("%,.2f", loanPackage));
    System.out.println("Duration to Payback: " + duration + " years");
    }
    
    public String getLoanPurpose() {
        return loanPurpose;
    }
    
    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }
    
    public double getLoanPackage() {
        return loanPackage;
    }
    
    public void setLoanPackage (double loanPackage) {
        this.loanPackage = loanPackage;
    }
    
    public int getDuration(int duration) {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
}




