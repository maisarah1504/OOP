/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;
import java.util.ArrayList;
import java.util.List;

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
    private String DoB;
    private List<Loan> loans;
    
    public Applicant(String id, String name, String email, String phoneNumber, String address, String DoB){
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.address = address; 
        this.phoneNumber = phoneNumber; 
        this.DoB = DoB;
        this.loans = new ArrayList<>();
    }

    public void addLoan(Loan loan){
        loans.add(loan);
    }
    
    public String getID(){
        return id;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getDoB(){
        return DoB;
    }
    
    public void setDoB(String DoB){
        this.DoB = DoB;
    }
    
    public List<Loan> getLoan(){
        return loans;
    }
    
    public void displayApplicantDetails() {
        System.out.println("Applicant ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + DoB);
        System.out.println("--- Loans ---");
        if (loans.isEmpty()) {
            System.out.println("No loans available.");
        } else {
            for (Loan loan : loans) {
                System.out.println(loan.toString());
            }
        }
    }
}
