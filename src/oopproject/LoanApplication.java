/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

/**
 *
 * @author USER
 */


import java.util.Scanner;

public class LoanApplication {
    public void manageLoans(Applicant applicant) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Loan Options ---");
            System.out.println("1. View Existing Loans");
            System.out.println("2. Add New Loan");
            System.out.println("3. Go Back");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (option == 3) break;

            switch (option) {
                case 1:
                    applicant.displayApplicantDetails();
                    break;

                case 2:
                    System.out.print("Enter Loan Type (Vehicle/Personal/Study): ");
                    String loanType = scanner.nextLine();
                    Loan loan;

                    if (loanType.equalsIgnoreCase("Vehicle")) {
                        System.out.print("Enter Vehicle Type: ");
                        String vehicleType = scanner.nextLine();
                        System.out.print("Enter Vehicle Model: ");
                        String vehicleModel = scanner.nextLine();
                        
                        System.out.println("Enter amount: (RM)");
                        double amount = scanner.nextDouble();
                        System.out.println("Enter loan term: ");
                        int loanTerm = scanner.nextInt();
                        
                        loan = new VehicleLoan(amount, loanTerm, vehicleType, vehicleModel);
                    } 
                    else if (loanType.equalsIgnoreCase("Personal")) {
                        System.out.print("Enter Loan Purpose: ");
                        String purpose = scanner.nextLine();
                        
                        System.out.println("Enter amount: (RM)");
                        double amount = scanner.nextDouble();
                        System.out.println("Enter loan term: ");
                        int loanTerm = scanner.nextInt();
                        
                        loan = new PersonalLoan(amount, loanTerm, purpose);
                    } 
                    else if (loanType.equalsIgnoreCase("Study")){
                        System.out.println("Enter University Name: ");
                        String uniName = scanner.nextLine(); 
                        System.out.println("Enter Program of Study: ");
                        String program = scanner.nextLine();
                        
                        System.out.println("Enter amount: (RM)");
                        double amount = scanner.nextDouble();
                        System.out.println("Enter loan term: ");
                        int loanTerm = scanner.nextInt();
                        
                        loan = new StudyLoan(amount, loanTerm, uniName, program);
                        
                    }    
                    else {
                            
                        System.out.println("Invalid loan type!");
                        continue;
                    }

//                    if (applicant.addLoan(loan)) {
//                        System.out.println("Loan added successfully!");
//                    }
//                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Loan Management System ---");
            System.out.println("1. Sign In");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 3) {
                System.out.println("Exiting...");
                break;
            }

            if (option == 1) {
                System.out.print("Enter Applicant ID: ");
                String id = scanner.nextLine();
                Applicant applicant = Applicant.findApplicant(id);

                if (applicant == null) {
                    System.out.println("Applicant not found. Please sign up first.");
                    continue;
                }

                manageLoans(applicant);

            } else if (option == 2) {
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter Phone Number: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Enter Address: ");
                String address = scanner.nextLine();
                System.out.print("Enter Date of Birth: ");
                String dob = scanner.nextLine();

                Applicant.addApplicant(id, name, email, phoneNumber, address, dob);
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        LoanApplication app = new LoanApplication();
        app.run();
    }
}
