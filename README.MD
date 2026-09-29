- java 21
- maven
- spring web mvc
- spring boot 3.2.0

### Description
This project is a Spring Boot application that demonstrates the use of Java 21, Maven, Spring Web MVC, and Spring Boot 3.2.0.

### Assignment 
1. Create endpoint to retrieve all mortgages interest rates from in-memory database.
2. create post endpoint to add new mortgage interest rate to in-memory database.
   curl -X POST http://localhost:8080/api/mortgage-rates \
   -H "Content-Type: application/json" \
   -d '{
   "type": "Fixed",
   "interestRate": 3.15,
   "term": 10,
   "description": "10-year fixed rate mortgage"
   }'