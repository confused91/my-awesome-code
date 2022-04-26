package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class JavascriptExecutorExample extends SetupDriver {

    @Test
    public void fetchElementById() {
        driver.get("https://www.facebook.com");
        WebElement password= (WebElement) ((JavascriptExecutor)driver)
                .executeScript("return document.getElementById('pass')");
        password.sendKeys("hello");
    }

    @Test
    public void fetchElementByName() {
        driver.get("https://www.facebook.com");
        List<WebElement> loginButton = (List<WebElement>) ((JavascriptExecutor) driver)
                .executeScript("return document.getElementsByName('login')");
      loginButton.get(0).click();
    }

    @Test
    public void highlightElement() throws InterruptedException {
        driver.get("https://www.facebook.com");
        WebElement element = driver.findElement(By.id("pass"));
        String originalStyle= element.getCssValue("border");
        System.out.println(element.getCssValue("border"));
        ((JavascriptExecutor)driver)
                .executeScript("arguments[0].setAttribute(arguments[1],arguments[2])"
                ,element,"style","border: 2px solid red;");
        element.sendKeys("Hello");
        ((JavascriptExecutor)driver)
                .executeScript("arguments[0].setAttribute(arguments[1],arguments[2])"
                        ,element,"style",originalStyle);
    }
    @Test
    public void querySelectorExample() {
        driver.get("http://www.facebook.com/");
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        List<WebElement> allLinks = (List<WebElement>) jsExec.executeScript("var elements = document.querySelectorAll('div>a'); return elements;");
        for (WebElement element : allLinks) {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
