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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoanApplication {
    private List<Applicant> applicants; // Simulated database of applicants

    public LoanApplication() {
        this.applicants = new ArrayList<>();
    }

    // Method to check if an applicant exists
    public Applicant CreateApplicant(String applicantId, String name, String email, String phoneNumber, String address, String dob) {
    
        // If not found, create a new applicant
        Applicant newApplicant = new Applicant(applicantId, name, email, phoneNumber, address, dob);
        applicants.add(newApplicant);
        return newApplicant;
    }
    
    public Applicant FindApplicant(String applicantId, String name) {
        for (Applicant applicant : applicants) {
            if (applicant.getID().equals(applicantId)) {
                return applicant;
            }
        }
        return null; // Return null if the applicant is not found
    }


    // Method to manage loans for an applicant
    public void manageLoans(Applicant applicant) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Loan Options ---");
            System.out.println("1. View Existing Loans");
            System.out.println("2. Add New Loan");
            System.out.println("3. Go Back");
            System.out.print("Choose an option: ");
            int loanOption = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (loanOption == 3) {
                break;
            }

            switch (loanOption) {
                case 1:
                    // View existing loans
                    System.out.println("\n--- Existing Loans ---");
                    if (applicant.getLoan().isEmpty()) {
                        System.out.println("No loans found for this applicant.");
                    } else {
                        applicant.displayApplicantDetails();
                    }
                    break;

                case 2:
                    // Add a new loan
                    System.out.println("\n--- Add New Loan ---");
                    System.out.print("Enter Loan ID: ");
                    String loanId = scanner.nextLine();
                    System.out.print("Enter Loan Amount: ");
                    double amount = scanner.nextDouble();
                    System.out.print("Enter Interest Rate (%): ");
                    double interestRate = scanner.nextDouble();
                    System.out.print("Enter Loan Term (in months): ");
                    int loanTerm = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Loan Type (Vehicle/Personal): ");
                    String loanType = scanner.nextLine();

                    Loan newLoan;
                    if (loanType.equalsIgnoreCase("Vehicle")) {
                        System.out.print("Enter Vehicle Type: ");
                        String vehicleType = scanner.nextLine();
                        System.out.print("Enter Vehicle Model: ");
                        String vehicleModel = scanner.nextLine();
                        newLoan = new VehicleLoan(loanId, amount, interestRate, loanTerm, vehicleType, vehicleModel);
                    } else if (loanType.equalsIgnoreCase("Personal")) {
                        System.out.print("Enter Loan Purpose: ");
                        String purpose = scanner.nextLine();
                        newLoan = new PersonalLoan(loanId, amount, interestRate, loanTerm, purpose);
                    } else {
                        System.out.print("Enter Loan Purpose: ");
                        String purpose = scanner.nextLine();
                        //newLoan = new PersonalLoan(amount, interestRate, loanTerm, purpose);
                    }

                    //applicant.addLoan(newLoan);
                    System.out.println("Loan added successfully!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to run the Loan Application system
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Loan Management System ---");
            System.out.println("1. Sign In");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            Applicant applicant = null; 
            
            if (option == 1){
                System.out.println("Enter ID: ");
                String applicantId = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                applicant = FindApplicant(applicantId, name);
                System.out.println("Applicant ID: " + applicant.getID() + " found or created.");
            }
            if (option == 2){
                System.out.print("Enter ID: ");
                String applicantId = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.println("Enter Phone Number: ");
                String phoneNumber = scanner.nextLine();
                System.out.println("Enter Address: ");
                String address = scanner.nextLine();
                System.out.println("Enter Date of Birth: ");
                String dob = scanner.nextLine();
                
                applicant = CreateApplicant(applicantId, name, email, phoneNumber, address, dob);
                System.out.println("Applicant ID: " + applicant.getID() + " found or created.");
            }
            if (option == 3) {
                System.out.println("Exiting the system...");
                break;
            }
            
          
            // Manage loans for the applicant
            manageLoans(applicant);
        }

        scanner.close();
    }
}
