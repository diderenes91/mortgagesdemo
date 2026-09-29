package nl.mortgages.demo.service;

import nl.mortgages.demo.model.MortgageApplication;
import nl.mortgages.demo.model.MortgageApplicationResponse;
import org.springframework.stereotype.Service;

@Service
public class MortgageApplicationService {

    public MortgageApplicationResponse checkMortgageEligibility(MortgageApplication application) {
        double homeValue = application.getHomeValue();
        double monthlyIncome = application.getIncome();
        double interestRate = application.getInterestRate();

        // Calculate monthly mortgage payment using simplified formula
        // monthlyPayment = (homeValue * interestRate / 100) / 12
        double monthlyPayment = (homeValue * interestRate / 100.0) / 12.0;

        // Required income: at least 3 times the monthly payment
        double requiredIncome = monthlyPayment * 3;

        // Check eligibility
        boolean approved = monthlyIncome >= requiredIncome;

        String message = approved 
            ? String.format("✅ Approved! Your income (%.2f) meets the requirement.", monthlyIncome)
            : String.format("❌ Denied! Your income (%.2f) is below the required %.2f", monthlyIncome, requiredIncome);

        return new MortgageApplicationResponse(approved, monthlyPayment, requiredIncome, message);
    }
}
