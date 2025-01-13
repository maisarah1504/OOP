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

public class LoanFactory {
    public static Loan createLoan(String type, double amount, int loanTerm, String... details) {
        switch (type.toLowerCase()) {
            case "vehicle":
                return new VehicleLoan(amount, loanTerm, details[0], details[1]);
            case "personal":
                return new PersonalLoan(amount, loanTerm, details[0]);
            case "study":
                return new StudyLoan(amount, loanTerm, details[0], details[1]);
            default:
                throw new IllegalArgumentException("Invalid loan type!");
        }
    }
}

