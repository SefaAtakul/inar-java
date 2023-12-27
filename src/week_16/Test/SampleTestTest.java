package week_16.Test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTestTest {
    @BeforeAll
    static void setUp(){
        System.out.println("Setting up shared resource...");
    }
    @BeforeEach
    void init(){
        System.out.println("Starting a new test...");
    }
    @Test
    void testExample(){
        System.out.println("Running test example...");
        Assertions.assertTrue(3>2,"Check is 3 is greater than 2");
    }
    @AfterEach
    void tearDown(){
        System.out.println("Cleaning up after a test...");
    }
    @AfterAll
    static void cleanUp(){
        System.out.println("Cleaned up shared resource...");
    }

}