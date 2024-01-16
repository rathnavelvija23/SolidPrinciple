package com.java.solid.OpenClosed;

public class PersonalLoanservice implements LoanService {
    @Override
    public String getLoan(String accountNo, String type) {
        return "Personal Loan Sanctioned";
    }
}
