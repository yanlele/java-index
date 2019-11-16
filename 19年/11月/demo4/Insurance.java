package demo4;

import java.util.Date;

public interface Insurance {
    public int getPolicyNumber();

    public int getCoverageAmount();

    public double calculatePremium();

    public Date getExpiryDate();
}
