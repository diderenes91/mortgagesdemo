package nl.mortgages.demo.service;

import nl.mortgages.demo.model.MortgageRate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MortgageRateService {
    private final Map<Long, MortgageRate> mortgageRates = new HashMap<>();

    public MortgageRateService() {
        initializeData();
    }

    private void initializeData() {
        mortgageRates.put(1L, new MortgageRate(1L, "Fixed", 3.5, 30, "30-year fixed rate mortgage"));
        mortgageRates.put(2L, new MortgageRate(2L, "Fixed", 3.25, 20, "20-year fixed rate mortgage"));
        mortgageRates.put(3L, new MortgageRate(3L, "Fixed", 2.85, 15, "15-year fixed rate mortgage"));
        mortgageRates.put(4L, new MortgageRate(4L, "ARM", 2.5, 7, "7/1 Adjustable Rate Mortgage"));
        mortgageRates.put(5L, new MortgageRate(5L, "ARM", 2.75, 5, "5/1 Adjustable Rate Mortgage"));
    }

    public List<MortgageRate> getAllRates() {
        return new ArrayList<>(mortgageRates.values());
    }

    public MortgageRate getRateById(Long id) {
        return mortgageRates.get(id);
    }

    public List<MortgageRate> getRatesByType(String type) {
        List<MortgageRate> rates = new ArrayList<>();
        for (MortgageRate rate : mortgageRates.values()) {
            if (rate.getType().equalsIgnoreCase(type)) {
                rates.add(rate);
            }
        }
        return rates;
    }

    public MortgageRate addRate(MortgageRate rate) {
        Long newId = mortgageRates.keySet().stream()
                .max(Long::compare)
                .orElse(0L) + 1;
        rate.setId(newId);
        mortgageRates.put(newId, rate);
        return rate;
    }
}
