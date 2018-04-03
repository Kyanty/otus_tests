package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class ClickFindFlights {
  @Test
  public void test(){
    WebDriver driver = new ChromeDriver();
    driver.get("http://blazedemo.com");
    WebElement findFlights = driver.findElement(By.cssSelector("input.btn.btn-primary"));
    findFlights.click();
    WebElement listFlights = ((ChromeDriver) driver).findElementByCssSelector("input.btn.btn-small");
    assertTrue(listFlights.isDisplayed());
    ExpectedConditions.elementToBeClickable(listFlights);

    driver.quit();
  }
}
