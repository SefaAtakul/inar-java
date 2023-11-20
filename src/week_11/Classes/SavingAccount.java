package week_11.Classes;

public class SavingAccount extends Account{
    public SavingAccount() {

    }

    public SavingAccount(int id, double initialBalance) {
        super(id, initialBalance);
    }

    @Override
    public String toString() {
        return "ID : " + super.getId() +
                "\nBalance is $" + super.getBalance();
    }
}
