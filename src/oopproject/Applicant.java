/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

import javax.swing.JTextField;

/**
 *
 * @author USER
 */

public class Applicant {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String dob;
    private Loan[] loans; // Fixed-size array for loans
    private int loanCount; // Tracks the number of loans

    public Applicant(String id, String name, String email, String phoneNumber, String address, String dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dob = dob;
        this.loans = new Loan[10]; // Fixed array size for loans (max 10 loans per applicant)
        this.loanCount = 0;
    }

    // Add a loan to the applicant
    public boolean addLoan(Loan loan) {
        if (loanCount < loans.length) {
            loans[loanCount++] = loan;
            return true;
        } else {
            System.out.println("Cannot add more loans. Maximum limit reached.");
            return false;
        }
    }

    // Display applicant details
    public void displayDetails() {
        System.out.println("Applicant ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + dob);
        System.out.println("--- Loans ---");
        if (loanCount == 0) {
            System.out.println("No loans available.");
        } else {
            for (int i = 0; i < loanCount; i++) {
                System.out.println(loans[i].toString());
            }
        }
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public Loan[] getLoans() {
        return loans;
}

    
}
