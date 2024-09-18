package Tests;

import StcTv.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.SubscriptionPage;

public class SubscriptionTests extends BaseTest {

    @Test
    public void testCasesforBahrain() {
        HomePage homePage = new HomePage(driver);
        SubscriptionPage subscriptionPage = new SubscriptionPage(driver);

        homePage.selectCountry("bh");
        Assert.assertEquals(homePage.getSelectedCountry(), "Bahrain");

        String currentCountry = subscriptionPage.getCurrentCountry();
        Assert.assertTrue(currentCountry.contains("Bahrain"), "Current country does not match");

        for (WebElement planName : subscriptionPage.getPlanNames()) {
            String packageName = planName.getText();
            if (packageName.equalsIgnoreCase("Lite")) {
                Assert.assertEquals(subscriptionPage.getPlanPrice("currency-lite"), "2 BHD/month");
                Assert.assertEquals(subscriptionPage.getCurrency("currency-lite"), "BHD");
            } else if (packageName.equalsIgnoreCase("Classic")) {
                Assert.assertEquals(subscriptionPage.getPlanPrice("currency-classic"), "3 BHD/month");
                Assert.assertEquals(subscriptionPage.getCurrency("currency-classic"), "BHD");
            } else if (packageName.equalsIgnoreCase("Premium")) {
                Assert.assertEquals(subscriptionPage.getPlanPrice("currency-premium"), "6 BHD/month");
                Assert.assertEquals(subscriptionPage.getCurrency("currency-premium"), "BHD");
            }
        }
    }

    @Test
    public void testCasesforSaudi() {
        HomePage homePage = new HomePage(driver);
        SubscriptionPage subscriptionPage = new SubscriptionPage(driver);

        homePage.selectCountry("sa");
        Assert.assertEquals(homePage.getSelectedCountry(), "KSA");

        String currentCountry = subscriptionPage.getCurrentCountry();
        Assert.assertTrue(currentCountry.contains("KSA"), "Current country does not match");

        for (WebElement planName : subscriptionPage.getPlanNames()) {
            String packageName = planName.getText();
            if (packageName.equalsIgnoreCase("Lite")) {
                Assert.assertEquals(subscriptionPage.getPlanPrice("currency-lite"), "15 SAR/month");
                Assert.assertEquals(subscriptionPage.getCurrency("currency-lite"), "SAR");
            } else if (packageName.equalsIgnoreCase("Classic")) {
                Assert.assertEquals(subscriptionPage.getPlanPrice("currency-classic"), "25 SAR/month");
                Assert.assertEquals(subscriptionPage.getCurrency("currency-classic"), "SAR");
            } else if (packageName.equalsIgnoreCase("Premium")) {
                Assert.assertEquals(subscriptionPage.getPlanPrice("currency-premium"), "60 SAR/month");
                Assert.assertEquals(subscriptionPage.getCurrency("currency-premium"), "SAR");
            }
        }
    }

    @Test
    public void testCasesforKuwait() {
        HomePage homePage = new HomePage(driver);
        SubscriptionPage subscriptionPage = new SubscriptionPage(driver);

        homePage.selectCountry("kw");
        Assert.assertEquals(homePage.getSelectedCountry(), "Kuwait");

        String currentCountry = subscriptionPage.getCurrentCountry();
        Assert.assertTrue(currentCountry.contains("Kuwait"), "Current country does not match");

        for (WebElement planName : subscriptionPage.getPlanNames()) {
            String packageName = planName.getText();
            if (packageName.equalsIgnoreCase("Lite")) {
                Assert.assertEquals(subscriptionPage.getPlanPrice("currency-lite"), "1.2 KWD/month");
                Assert.assertEquals(subscriptionPage.getCurrency("currency-lite"), "KWD");
            } else if (packageName.equalsIgnoreCase("Classic")) {
                Assert.assertEquals(subscriptionPage.getPlanPrice("currency-classic"), "2.5 KWD/month");
                Assert.assertEquals(subscriptionPage.getCurrency("currency-classic"), "KWD");
            } else if (packageName.equalsIgnoreCase("Premium")) {
                Assert.assertEquals(subscriptionPage.getPlanPrice("currency-premium"), "4.8 KWD/month");
                Assert.assertEquals(subscriptionPage.getCurrency("currency-premium"), "KWD");
            }
        }
    }
}

