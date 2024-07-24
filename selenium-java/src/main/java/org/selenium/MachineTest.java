package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.window;

public class MachineTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("http://wma.lighthouseindia.com:9003/WMATEST");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            clickElement(driver,By.xpath("//input[@class='native-input sc-ion-input-md']"));
            Sendkey(driver,By.xpath("//input[@class='native-input sc-ion-input-md']"), " L.V7CERP");
            clickElement(driver,By.xpath("//*[@type='submit']"));
            Thread.sleep(7000);
            clickElement(driver,By.xpath("(//input[@placeholder='Username'])"));
            Sendkey(driver,By.xpath("(//input[@placeholder='Username'])"), "SHASHANK");
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//input[@placeholder='Password'])"));
            Sendkey(driver,By.xpath("(//input[@placeholder='Password'])"),"123");
            Thread.sleep(1000);
            clickElement(driver,By.xpath("//*[@class='button-round button-round-md ion-color ion-color-primary md button button-block button-solid ion-activatable ion-focusable hydrated']"));
            clickElement(driver,By.xpath("(//*[@class='ng-untouched ng-pristine ng-invalid ion-untouched ion-pristine ion-invalid md in-item hydrated'])[1]"));
            clickElement(driver,By.xpath("(//*[@role='listitem'])[7]"));
            clickElement(driver,By.xpath("(//*[@class='ng-untouched ng-pristine ng-invalid ion-untouched ion-pristine ion-invalid md in-item hydrated'])"));
            Thread.sleep(3000);
            ScrollToElement(driver,By.xpath("//*[@class='sc-ion-select-popover-md md list-md hydrated']"));
            Thread.sleep(4000);
            clickElement(driver,By.xpath("(//*[@class='sc-ion-select-popover-md sc-ion-label-md-h sc-ion-label-md-s md hydrated'])[7]"));
            clickElement(driver,By.xpath("(//*[text()='23-24 '])[2]"));

            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@class='text-center ion-color ion-color-primary md button button-round button-solid ion-activatable ion-focusable hydrated'])"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickElement(WebDriver driver, By locator) {
    try {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    } catch (Exception e) {
        System.out.println("Error clicking element: " + e.getMessage());
    }
}
    public static void Sendkey(WebDriver driver, By locator, String keys) {
        try {
            WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.sendKeys(keys);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
     public static void ScrollToElement(WebDriver driver, By locator) throws InterruptedException {
        WebElement button = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight",button);
        Thread.sleep(2000);
        button.click();
    }

}
