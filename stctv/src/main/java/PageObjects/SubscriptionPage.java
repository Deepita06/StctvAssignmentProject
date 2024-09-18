package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SubscriptionPage {
    private WebDriver driver;

    public SubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentCountry() {
        return driver.findElement(By.xpath("//div[@class='country-current']/a/div/span")).getText();
    }

    public List<WebElement> getPlanNames() {
        return driver.findElements(By.xpath("//div[@class='plan-row plan-header sticky']/div/div/strong"));
    }

    public String getPlanPrice(String planId) {
        return driver.findElement(By.id(planId)).getText();
    }

    public String getCurrency(String planId) {
        String currency = driver.findElement(By.xpath("//div[@id='" + planId + "']/i")).getText();
        return currency.split("/")[0].trim();
    }
}
