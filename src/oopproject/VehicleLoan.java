package oopproject;

/**
 * VehicleLoan class inherits from the Loan class.
 * Represents a loan specifically for a vehicle.
 */
public class VehicleLoan extends Loan{
    private String vehicleType;
    private String vehicleModel;
    private double repayment; 

    // Constructor to initialize loan and vehicle details
    public VehicleLoan(double amount, int loanTerm, String vehicleType, String vehicleModel) {
        super(amount, loanTerm); // Call the superclass constructor
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
    }
    
    @Override
    public double getMonthlyPayment() {
        double monthlyRate = interestRate / 12 / 100;
        return (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanTerm));
    }

    /**
     *
     * @return
     */
    @Override
    protected String getLoanPrefix() {
        return "V"; // Prefix for Vehicle loans
    }

    // Getter for vehicleType
    public String getVehicleType() {
        return vehicleType;
    }

    // Setter for vehicleType
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Getter for vehicleModel
    public String getVehicleModel() {
        return vehicleModel;
    }

    // Setter for vehicleModel
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
}
