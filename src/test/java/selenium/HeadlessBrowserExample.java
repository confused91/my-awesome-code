package selenium;

import com.gargoylesoftware.htmlunit.html.Html;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;

public class HeadlessBrowserExample {

    @Test
    public void testHeadlessMode()
    {
        HtmlUnitDriver driver= new HtmlUnitDriver();
        driver.get("https://www.facebook.com");
        WebElement createAccountButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccountButton.click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        System.out.println(driver.findElement(By.name("firstname")).isDisplayed());
        driver.findElement(By.name("firstname")).sendKeys("rdbatch2");

    }
}
