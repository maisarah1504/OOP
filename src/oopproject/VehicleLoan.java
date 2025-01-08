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
public class VehicleLoan extends Loan{
    private String vehicleType, vehicleModel;
    
    public VehicleLoan(String loanID, double amount, double interestRate, int loanTerm, String vehicleType, String vehicleModel){
        super(loanID, amount, loanTerm);
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
    }
    
    public void displayVehicleDetails(){
        System.out.println(" Vehicle Type: " + vehicleType);
        System.out.println(" Vehicle Model: " + vehicleModel);
    }
    
    public double calculateMonthlyPayment(){
        double monthlyRate = interestRate / 12 /100;
        return (amount * monthlyRate)/(1- Math.pow(1 + monthlyRate, -loanTerm));
    }
    
    public String getVehicleType(){
        return vehicleType;
    }
    
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
    
    public String getVehicleModel(){
        return vehicleModel;
    }
    
    public void setVehicleModel(String vehicleModel){
        this.vehicleModel = vehicleModel;
    }
    
}
