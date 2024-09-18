package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	    private WebDriver driver;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void selectCountry(String countryId) {
	        driver.findElement(By.id("country-name")).click();
	        driver.findElement(By.id(countryId)).click();
	    }

	    public String getSelectedCountry() {
	        return driver.findElement(By.id("country-name")).getText();
	    }
	}



