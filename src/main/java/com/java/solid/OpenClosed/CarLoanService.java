package com.java.solid.OpenClosed;

public class CarLoanService implements LoanService{
    @Override
    public String getLoan(String accountNo, String type) {
        return "Car Loan Sanctioned";
    }
}
