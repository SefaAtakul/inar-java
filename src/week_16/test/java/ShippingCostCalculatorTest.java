package test.java;

import main.java.ShippingCostCalculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCostCalculatorTest {
    //Decision Table Testing

    ShippingCostCalculator shippingCostCalculator ;
    static int testCaseNumber = 1;

    @BeforeAll
    public static void init(){
        System.out.println("Our perfect shipping test started!");
    }

    @BeforeEach
    public void setUp(){
        shippingCostCalculator = new ShippingCostCalculator();
        System.out.println("---------------TC-" + testCaseNumber + ": is started-------------");

    }
    @AfterEach
    public void tearDown() {
        shippingCostCalculator = null;
        System.out.println("--------------TC-" + testCaseNumber + ": is finished--------------");
        System.out.println("######################################");
        testCaseNumber++;
    }


    @Test
    void localDestWithStandardDel(){
      double result = shippingCostCalculator.calculatorCost(10,"local","standard") ;
      assertEquals(10,result);
    }
    @Test
    void localDestWithExpressDel(){
        double result = shippingCostCalculator.calculatorCost(10,"local","ExpresS");
        assertEquals(25,result);
    }
    @Test
    void internationalDestWithStandardDel(){
        double result = shippingCostCalculator.calculatorCost(10, "international", "standard");
        assertEquals(50, result);
    }
    @Test
    void internationalDestWithExpressDel(){
        double result = shippingCostCalculator.calculatorCost(10, "international", "express");
        assertEquals(125, result);
    }
    @Test
    void zeroWeightLocalStandardDel(){
        double result = shippingCostCalculator.calculatorCost(0, "local", "standard");
        assertEquals(0, result);
    }
    @Test
    void zeroWeightLocalExpressDel(){
        double result = shippingCostCalculator.calculatorCost(0, "local", "express");
        assertEquals(0, result);
    }
    @Test
    void zeroWeightInternationalExpressDel() {
        double result = shippingCostCalculator.calculatorCost(0, "international", "express");
        assertEquals(0, result);
    }

    @Test
    void negativeWeightLocalStandardDel() {
        double result = shippingCostCalculator.calculatorCost(-1, "local", "standard");
        assertEquals(-1, result);
    }

    @Test
    void negativeWeightLocalExpressDel() {
        double result = shippingCostCalculator.calculatorCost(-1, "local", "express");
        assertEquals(-2.5, result);
    }

    @Test
    void negativeWeightInternationalStandardDel() {
        double result = shippingCostCalculator.calculatorCost(-1, "international", "standard");
        assertEquals(-5, result);
    }

    @Test
    void negativeWeightInternationalExpressDel() {
        double result = shippingCostCalculator.calculatorCost(-1, "international", "express");
        assertEquals(-12.5, result);
    }
    @AfterAll
    public static void cleanUp(){
        System.out.println("Our Test of shipping Ended!..");
    }

}