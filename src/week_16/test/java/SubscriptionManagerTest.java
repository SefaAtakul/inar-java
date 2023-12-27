package test.java;

import main.java.SubscriptionManager;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SubscriptionManagerTest {
    //Pairwise-Testing
    SubscriptionManager manager;
    static int testCaseNumber = 1;

    @BeforeAll
    public static void init(){
        System.out.println("SubscriptionTest just started!..");
    }
    @BeforeEach
    public void setUp(){
        manager = new SubscriptionManager();
        System.out.println("-------->TC-"+testCaseNumber+" is started!<------------");
        System.out.println("*************><****************");

    }
    @AfterEach
    public void tearDown(){
        System.out.println("---------->TC-"+testCaseNumber+"is finished!<------------");
        testCaseNumber++;
    }
    @Test
    public void testFreeTierEmailNotificationsEnabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE, SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED", result);
    }
    @Test
    public void testStandardTierSmsNotificationsDisabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD, SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=STANDARD, Notification=SMS, AutoRenewal=DISABLED", result);
    }
    @Test
    public void testSPremiumTierNoneNotificationsEnabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM, SubscriptionManager.NotificationPreference.NONE, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=NONE, AutoRenewal=ENABLED", result);
    }
    @Test
    public void testFreeTierSmsNotificationsDisabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE, SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=FREE, Notification=SMS, AutoRenewal=DISABLED", result);
    }
    @Test
    public void testStandardTierEmailNotificationsEnabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD, SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=STANDARD, Notification=EMAIL, AutoRenewal=ENABLED", result);
    }
    @Test
    public void testPremiumTierSmsNotificationsDisabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM, SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED", result);
    }
    @AfterAll
    public static void cleanUp(){
        System.out.println("Subscription Manager Test Over!");
    }

}