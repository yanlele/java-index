package demo4;

import java.util.Date;

public class Car implements Insurance {
    private int policyNumber;
    private int coverageAmount;
    private double calculatePremium;
    private Date expiryDate;

    public Car() {
    }

    public Car(int policyNumber, int coverageAmount, double calculatePremium, Date expiryDate) {
        this.policyNumber = policyNumber;
        this.coverageAmount = coverageAmount;
        this.calculatePremium = calculatePremium;
        this.expiryDate = expiryDate;
    }

    @Override
    public int getPolicyNumber() {
        return this.policyNumber;
    }

    @Override
    public int getCoverageAmount() {
        return this.coverageAmount;
    }

    @Override
    public double calculatePremium() {
        return this.calculatePremium;
    }

    @Override
    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setCoverageAmount(int coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public void setCalculatePremium(double calculatePremium) {
        this.calculatePremium = calculatePremium;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
