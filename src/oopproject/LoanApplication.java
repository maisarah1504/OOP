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
    private static final int MAX_APPLICANTS = 1000; // Maximum number of applicants
    private static LoanApplication instance;
    private Applicant[] applicants;
    private int applicantCount;

    LoanApplication() {
        this.applicants = new Applicant[MAX_APPLICANTS];
        this.applicantCount = 0;
    }

    /************************************************
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Loan Management System ---");
            System.out.println("1. Sign Up");
            System.out.println("2. Add Loan");
            System.out.println("3. View Applicant Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (option) {
                case 1:
                    if (applicantCount >= MAX_APPLICANTS) {
                        System.out.println("Maximum number of applicants reached.");
                        break;
                    }
        
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNum = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Date of Birth: ");
                    String doB = scanner.nextLine();
                    
                    if (findApplicantById(id) != null) {
                        System.out.println("Applicant with this ID already exists!");
                    } else {
                        applicants[applicantCount++] = new Applicant(id, name, email, phoneNum, address, doB);
                        System.out.println("Applicant registered successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Applicant ID: ");
                    id = scanner.nextLine();
                    Applicant applicant = findApplicantById(id);

                    if (applicant == null) {
                        System.out.println("Applicant not found!");
                        break;
                    }

                    System.out.print("Enter Loan Type (Vehicle/Personal/Study): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    System.out.print("Enter Loan Term (months): ");
                    int term = scanner.nextInt();
                    scanner.nextLine();
                    Loan loans;
                    if (type.equalsIgnoreCase("Vehicle")) {
                        System.out.print("Enter Vehicle Type: ");
                        String vehicleType = scanner.nextLine();
                        System.out.print("Enter Vehicle Model: ");
                        String vehicleModel = scanner.nextLine();
                        loans = LoanFactory.createLoan("vehicle", amount, term, vehicleType, vehicleModel);
                        applicant.addLoan(loans);
                        break;
                    } else if (type.equalsIgnoreCase("Study")) {
                        System.out.print("Enter University Name: ");
                        String university = scanner.nextLine();
                        System.out.print("Enter Program of Study: ");
                        String program = scanner.nextLine();
                        loans = LoanFactory.createLoan("study", amount, term, university, program);
                        applicant.addLoan(loans);
                    } else if (type.equalsIgnoreCase("Personal")) {
                        System.out.print("Enter Loan Purpose: ");
                        String purpose = scanner.nextLine();
                        loans = LoanFactory.createLoan("personal", amount, term, purpose);
                        applicant.addLoan(loans);
                    } else {
                        System.out.println("Invalid loan type!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Applicant ID: ");
                    id = scanner.nextLine();
                    applicant = findApplicantById(id);

                    if (applicant == null) {
                        System.out.println("Applicant not found!");
                    } else {
                        applicant.displayDetails();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }
 

    private Applicant findApplicantById(String id) {
        for (int i = 0; i < applicantCount; i++) {
            if (applicants[i].getId().equals(id)) {
                return applicants[i];
            }
        }
        return null;
    }
     * @return 
    *///////////////////////////////////////////////////////////////////////////////////

    public static LoanApplication getInstance() {
        if (instance == null) {
            instance = new LoanApplication();
        }
        return instance;
    }
    
    public void addApplicant(Applicant applicant) {
        if (applicantCount < MAX_APPLICANTS) {
            applicants[applicantCount++] = applicant;
        }
    }

    public Applicant searchApplicantById(String id) {
        for (int i = 0; i < applicantCount; i++) {
            if (applicants[i].getId().equals(id)) {
                return applicants[i];
            }
        }
        return null;
    }
}

