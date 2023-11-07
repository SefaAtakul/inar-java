package week_09.week_09_Test;

import week_09.week_09_Classes.Question_09_02_Stock;

public class Question_09_02_Test {
    public static void main(String[] args) {
        Question_09_02_Stock stock = new Question_09_02_Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice=34.35;

        System.out.println("Stock name : " + stock.name);
        System.out.println("Stock Symbol : " + stock.symbol );
        System.out.println("Price change-percentage : " +stock.getChangedPercentage());

    }
}
