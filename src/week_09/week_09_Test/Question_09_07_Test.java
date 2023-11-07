package week_09.week_09_Test;

import week_09.week_09_Classes.Question_09_07_Account;

public class Question_09_07_Test {
    public static void main(String[] args) {
        Question_09_07_Account Account = new Question_09_07_Account(1122,20000,4.5);
        Account.withdraw(2500);
        Account.deposit(3000);
        System.out.println("\t\tAccount Statement  : ");
        System.out.println("---------------------------------------");
        System.out.println("Account ID\t: " + Account.getId());
        System.out.println("Account ID\t: " + Account.getDataCreated());
        System.out.println("Account ID\t: " + Account.getBalance());
        System.out.println("Account ID\t: " + Account.getMonthlyInterest());
    }
}
