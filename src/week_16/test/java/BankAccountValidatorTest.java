package test.java;

import main.java.BankAccountValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountValidatorTest {
    BankAccountValidator account = new BankAccountValidator(1500);

    @Test
    void depositIntoAccount() {
        account.deposit(1500);
        double result = account.getBalance();
        assertEquals(3000, result, "After deposit the amount account must be account+amount... ");
    }

    @Test
    void withdrawFromAccountWithSufficientFunds() {
        account.withdraw(500);
        double result = account.getBalance();
        assertEquals(1000, result, "After withdrew the amount,account must be account-withdrawAmount...");
    }

    @Test
    void withdrawFromAccountExceedingBalance() {
        try {
            account.withdraw(2000);
        } catch (IllegalArgumentException exception) {
            assertEquals("Insufficient funds", exception.getMessage());
        }

    }

    @Test
    void depositNegativeAmount () {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-150),"Negative amount can not process!");
    }
    @Test
    void withdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10),"Negative amount can not process!");
    }
}