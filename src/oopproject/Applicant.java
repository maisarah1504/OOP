/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

/**
 *
 * @author USER
 */

public class Applicant {
    private static final int MAX_APPLICANTS = 100; // Maximum number of applicants
    private static Applicant[] applicants = new Applicant[MAX_APPLICANTS];
    private static int applicantCount = 0; // Number of current applicants

    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String dob;
    private Loan[] loans;
    private int loanCount; // Tracks the number of loans   

    public Applicant(String id, String name, String email, String phoneNumber, String address, String dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dob = dob;
        this.loans = new Loan[10]; // Maximum loans per applicant
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

    // Static method to add a new applicant
    public static boolean addApplicant(String id, String name, String email, String phoneNumber, String address, String dob) {
        if (applicantCount < MAX_APPLICANTS) {
            // Check if applicant already exists
            for (int i = 0; i < applicantCount; i++) {
                if (applicants[i].id.equals(id)) {
                    System.out.println("Applicant with this ID already exists.");
                    return false;
                }
            }
            applicants[applicantCount++] = new Applicant(id, name, email, phoneNumber, address, dob);
            System.out.println("Applicant added successfully!");
            return true;
        } else {
            System.out.println("Cannot add more applicants. Maximum limit reached.");
            return false;
        }
    }

    // Static method to find an applicant by ID
    public static Applicant findApplicant(String id) {
        for (int i = 0; i < applicantCount; i++) {
            if (applicants[i].id.equals(id)) {
                return applicants[i];
            }
        }
        return null; // Not found
    }
    
    // Getters
    public String getId() {
        return id;
    }

    public void setId(){
        this.id = id; 
    }
    
    public String getName(String name) {
        return name;
    }
    
    public void setName(){
        this.name = name;
    }
    
    public String getEmail(String email){
        return email;
    }
    
    public void setEmail(){
        this.email = email;
    }
    
    public String getPhoneNum (String phoneNumber){
        return phoneNumber;
    }
    
    public void setPhoneNumber (){
        this.phoneNumber = phoneNumber; 
    }
    
    public String getAddress(String address) {
        return address;
    }
    
    public void setAddress(){
        this.address = address;
    }
    
    public String getDoB(String dob){
        return dob;
    }
    
    public void setDoB(){
        this.dob = dob;
    }
    
    
    
    
}