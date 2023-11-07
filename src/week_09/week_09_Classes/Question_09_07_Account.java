package week_09.week_09_Classes;

import java.util.Date;

public class Question_09_07_Account {
   private int id ;
    private double balance;
    private double annualInterestRate;
    private final Object dataCreated = new Date();
public Question_09_07_Account(){};
    public Question_09_07_Account(int id,double balance,double annualInterestRate){
        this.id = id ;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }

    public Object getDataCreated() {
        return dataCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/1200;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        this.balance = balance-amount;
    }
    public void deposit(double amount){
        this.balance = balance+amount;
    }
}
