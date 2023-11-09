package week_10.Classes;

public class Tax {
    private int fillingStatus;
    private double taxableIncome;

    private static int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
    };

    private static double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

    public Tax() {
    }
    public Tax
            (int filingStatus,
             int[][] brackets,
             double[] rates,
             double taxableIncome) {
        this.fillingStatus = filingStatus;
        Tax.brackets = brackets;
        Tax.rates = rates;
        this.taxableIncome = taxableIncome;
    }
    public int getFilingStatus() {
        return fillingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.fillingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        Tax.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        Tax.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    public double getTax() {

        if (brackets[fillingStatus][0] > taxableIncome) {
            return taxableIncome * rates[0];
        } else if (brackets[fillingStatus][1] > taxableIncome) {
            return brackets[fillingStatus][0] * rates[0]
                    + (taxableIncome - brackets[fillingStatus][0]) * rates[1];
        } else if (brackets[fillingStatus][2] > taxableIncome) {
            return brackets[fillingStatus][0] * rates[0] +
                    (brackets[fillingStatus][1] - brackets[fillingStatus][0]) * rates[1] +
                    (taxableIncome - brackets[fillingStatus][1]) * rates[2];
        } else if (brackets[fillingStatus][3] > taxableIncome) {
            return brackets[fillingStatus][0] * rates[0] +
                    (brackets[fillingStatus][1] - brackets[fillingStatus][0]) * rates[1] +
                    (brackets[fillingStatus][2] - brackets[fillingStatus][1]) * rates[2] +
                    (taxableIncome - brackets[fillingStatus][2]) * rates[3];
        } else if (brackets[fillingStatus][4] > taxableIncome) {
            return brackets[fillingStatus][0] * rates[0] +
                    (brackets[fillingStatus][1] - brackets[fillingStatus][0]) * rates[1] +
                    (brackets[fillingStatus][2] - brackets[fillingStatus][1]) * rates[2] +
                    (brackets[fillingStatus][3] - brackets[fillingStatus][2]) * rates[3] +
                    (taxableIncome - brackets[fillingStatus][3]) * rates[3];
        } else {
            return brackets[fillingStatus][0] * rates[0] +
                    (brackets[fillingStatus][1] - brackets[fillingStatus][0]) * rates[1] +
                    (brackets[fillingStatus][2] - brackets[fillingStatus][1]) * rates[2] +
                    (brackets[fillingStatus][3] - brackets[fillingStatus][2]) * rates[3] +
                    (brackets[fillingStatus][4] - brackets[fillingStatus][3]) * rates[4] +
                    (taxableIncome - brackets[fillingStatus][4]) * rates[3];

        }

    }

}