package nl.mortgages.demo.controller;

import nl.mortgages.demo.model.MortgageRate;
import nl.mortgages.demo.service.MortgageRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mortgage-rates")
@CrossOrigin(origins = "*")
public class MortgageRateController {

    @Autowired
    private MortgageRateService mortgageRateService;

    @GetMapping
    public ResponseEntity<List<MortgageRate>> getAllRates() {
        return ResponseEntity.ok(mortgageRateService.getAllRates());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MortgageRate> getRateById(@PathVariable Long id) {
        MortgageRate rate = mortgageRateService.getRateById(id);
        if (rate != null) {
            return ResponseEntity.ok(rate);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<MortgageRate>> getRatesByType(@PathVariable String type) {
        return ResponseEntity.ok(mortgageRateService.getRatesByType(type));
    }

    @PostMapping
    public ResponseEntity<MortgageRate> addRate(@RequestBody MortgageRate rate) {
        // 10
        //11
        //12
        return ResponseEntity.ok(mortgageRateService.addRate(rate));
    }
}
