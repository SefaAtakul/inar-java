package week_09.week_09_Classes;

public class Question_09_02_Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Question_09_02_Stock() {
    }

    ;

    public Question_09_02_Stock(String newSymbol, String newName) {
        symbol = newSymbol;

        name = newName;
    }

    public double getChangedPercentage() {
        if (previousClosingPrice - currentPrice > 0) {
            return -((previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
        } else {
            return ((previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
        }

    }
}
