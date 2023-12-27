package test.java;

import main.java.AgeRestrictionValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeRestrictionValidatorTest {
    AgeRestrictionValidator ageValidator = new AgeRestrictionValidator();

    @Test
    void ageUnderTheMin(){
        boolean result = ageValidator.isValid(17);
        assertFalse(result,"Result must be Minimum 18...");
    }
    @Test
    void ageAtMinBoundaryValue(){
        boolean result = ageValidator.isValid(18);
        assertTrue(result,"Min boundary value is 18");
    }
    @Test
    void ageAboveMin(){
        boolean result = ageValidator.isValid(19);
        assertTrue(result,"19 is teh valid value...");
    }
    @Test
    void ageBelowTheMax(){
        boolean result = ageValidator.isValid(64);
        assertTrue(result,"64 is valid value...");
    }
    @Test
    void ageMaxBoundaryValue(){
        boolean result = ageValidator.isValid(65);
        assertTrue(result,"65 is the Max boundary  value...");
    }
    @Test
    void ageAboveTheMax(){
        boolean result = ageValidator.isValid(66);
        assertFalse(result,"66 is invalid value,out of range...");
    }
    @Test
    void extremelyLowValue(){
        boolean result = ageValidator.isValid(0);
        assertTrue(result,"0 is invalid value...");
    }
    @Test
    void extremelyHighValue(){
        boolean result = ageValidator.isValid(1000);
        assertTrue(result,"1000 is invalid value...");
    }


}