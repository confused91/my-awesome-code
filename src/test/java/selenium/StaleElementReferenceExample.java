package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class StaleElementReferenceExample extends SetupDriver {

    @Test
    public void testStaleElement() {
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("stale element reference exception " + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Exceptions | Selenium')]")));
        WebElement seleniumDevLink = driver.findElement(By.xpath("//h3[contains(text(),'Exceptions | Selenium')]"));
        wait.until(ExpectedConditions.visibilityOf(seleniumDevLink));
        seleniumDevLink.click();
        WebElement heading = driver.findElement(By.cssSelector("#invalid_selector_exception"));
        wait.until(ExpectedConditions.visibilityOf(heading));
        System.out.println(heading.getText());
        driver.navigate().refresh();
       /* heading = driver.findElement(By.cssSelector("#invalid_selector_exception"));
        System.out.println(heading.getText());*/
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(heading)));
        System.out.println(heading.getText());
    }
}
