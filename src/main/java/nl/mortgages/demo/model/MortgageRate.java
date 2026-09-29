package nl.mortgages.demo.model;

public class MortgageRate {
    private Long id;
    private String type;
    private double interestRate;
    private int term;
    private String description;

    public MortgageRate(Long id, String type, double interestRate, int term, String description) {
        this.id = id;
        this.type = type;
        this.interestRate = interestRate;
        this.term = term;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
