package nl.mortgages.demo.model;

public class MortgageApplication {
    private double homeValue;
    private double income;
    private double interestRate;

    public MortgageApplication(double homeValue, double income, double interestRate) {
        this.homeValue = homeValue;
        this.income = income;
        this.interestRate = interestRate;
    }

    public double getHomeValue() {
        return homeValue;
    }

    public void setHomeValue(double homeValue) {
        this.homeValue = homeValue;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
