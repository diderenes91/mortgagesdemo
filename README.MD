# Mortgages Demo - Spring Boot API

## Technologies
- java 21
- maven
- spring web mvc
- spring boot 3.2.0

## Description
This project is a Spring Boot application that demonstrates a mortgage interest rates API with eligibility checking functionality using Java 21, Maven, Spring Web MVC, and Spring Boot 3.2.0.

## Running the Application
```bash
./mvnw spring-boot:run
```
The application will start on **http://localhost:8080**

## Endpoints

### 1. Get All Mortgage Rates
```bash
curl -X GET http://localhost:8080/api/mortgage-rates
```

### 2. Get Mortgage Rate by ID
```bash
curl -X GET http://localhost:8080/api/mortgage-rates/1
```

### 3. Get Mortgage Rates by Type (Fixed or ARM)
```bash
curl -X GET http://localhost:8080/api/mortgage-rates/type/Fixed
```

### 4. Add New Mortgage Interest Rate
```bash
curl -X POST http://localhost:8080/api/mortgage-rates \
  -H "Content-Type: application/json" \
  -d '{
    "type": "Fixed",
    "interestRate": 3.15,
    "term": 10,
    "description": "10-year fixed rate mortgage"
  }'
```

### 5. Apply for Mortgage - Approved Case
```bash
curl -X POST http://localhost:8080/api/mortgage-rates/apply \
  -H "Content-Type: application/json" \
  -d '{
    "homeValue": 300000,
    "income": 120000,
    "interestRate": 3.5
  }'
```

### 6. Apply for Mortgage - Denied Case
```bash
curl -X POST http://localhost:8080/api/mortgage-rates/apply \
  -H "Content-Type: application/json" \
  -d '{
    "homeValue": 500000,
    "income": 5000,
    "interestRate": 4.5
  }'
```

## Mortgage Application Requirements
- **Input Parameters:**
  - `homeValue`: The value of the home
  - `income`: Annual income
  - `interestRate`: Interest rate in percentage

- **Approval Logic:** Income must be at least 3 times the monthly mortgage payment
- **Formula:** monthlyPayment = (homeValue × interestRate / 100) / 12
- **Required Income:** monthlyPayment × 3

## Response Example
### Approved
```json
{
  "approved": true,
  "monthlyPayment": 875.0,
  "requiredIncome": 2625.0,
  "message": "✅ Approved! Your income (120000,00) meets the requirement."
}
```

### Denied
```json
{
  "approved": false,
  "monthlyPayment": 1875.0,
  "requiredIncome": 5625.0,
  "message": "❌ Denied! Your income (5000,00) is below the required 5625,00"
}
```
