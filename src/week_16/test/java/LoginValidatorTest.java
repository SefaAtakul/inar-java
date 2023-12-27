package test.java;

import main.java.LoginValidator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LoginValidatorTest {
    //Equivalence Partitioning Test Example
    LoginValidator loginValidator;
    static int testCaseNumber = 1;

    @BeforeAll
    public static void init (){
        System.out.println("Our LoginValidator Test Started!..");
    }
    @BeforeEach
    public void setUp(){
        System.out.println("-------------> TC-"+testCaseNumber+" is started! <-------------");
    }
    @AfterEach
    public void tearDown(){
        System.out.println("--------------TC-" + testCaseNumber + ": is finished--------------");
        System.out.println("<******************************************************>");
        testCaseNumber++;
    }
    @Test
    void validEmailAddressTest(){
        LoginValidator loginValidator = new LoginValidator();
        boolean result = loginValidator.validateUsername("SfAta18@gmail.com");
        assertTrue(result);
    }
    @Test
    void testingEmailWithoutAtSymbol() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("SfAta18gmail.com"), "validateUsername() method is not checking '@' symbol!");

    }
    @Test
    void testingEmailWithoutDomain() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("sefa@gmailcom"), "validateUsername() method is not checking domain area!");

    }
    @Test
    void testingEmailWithInvalidCharacters() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("Sefa%&@gmail.com"), "validateUsername() method is not checking invalid characters!");
    }
    @Test
    void testingEmailWithEmptyString() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername(""), "validateUsername() method is not checking empty string!");
    }
    @Test
    void testingEmailWithNull() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername(null), "validateUsername() method is not checking null !");
    }
    @Test
    void testValidPassword() {
        LoginValidator loginValidator = new LoginValidator();
        assertTrue(loginValidator.validatePassword("sefa.@ata18"), "validatePassword() method has a problem");
    }

    @Test
    void testPasswordWithoutSpecialCharacter() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("sefa.atakul18"), "validatePassword() method is not checking special characters.");
    }

    @Test
    void testPasswordWithoutNumber() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("sefa.@ata"), "validatePassword() method is not checking numbers.");
    }

    @Test
    void testPasswordWithTooShortInput() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("s"), "validatePassword() method is not checking too short input.");
    }

    @Test
    void testPasswordWithTooLongInput() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("sefa.@1955487741ata"), "validatePassword() method is not checking too long input.");
    }

    @Test
    void testPasswordWithEmptyString() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword(""), "validatePassword() method is not checking empty string input.");
    }

    @Test
    void testPasswordWithNull() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword(null), "validatePassword() method is not checking null.");
    }
    @AfterAll
    public static void cleanUp(){
        System.out.println("Our LoginValidator test ended!...");
    }

}