package nl.mortgages.demo.model;

public class MortgageApplicationResponse {
    private boolean approved;
    private double monthlyPayment;
    private double requiredIncome;
    private String message;

    public MortgageApplicationResponse(boolean approved, double monthlyPayment, double requiredIncome, String message) {
        this.approved = approved;
        this.monthlyPayment = monthlyPayment;
        this.requiredIncome = requiredIncome;
        this.message = message;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getRequiredIncome() {
        return requiredIncome;
    }

    public void setRequiredIncome(double requiredIncome) {
        this.requiredIncome = requiredIncome;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
