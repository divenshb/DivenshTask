package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class SignUp{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        // Thread.sleep(10000);
//        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        clickElement(driver, By.className("theme-btn"));
        clickElement(driver, By.xpath("//*[@value='email']"));
        Thread.sleep(2000);
        clickElement(driver, By.xpath("//input[@id='user_name']"));
        sendKeys(driver,By.xpath("//input[@id='user_name']"),"Divensh Balpande");
        clickElement(driver, By.xpath("//*[@id='user_email']"));
        sendKeys(driver, By.xpath("//*[@id='user_email']"), "divenshb1@gmail.com");
        clickElement(driver, By.xpath("//*[@id='password']"));
        sendKeys(driver,  By.xpath("//*[@id='password']"), "Divenshb");
        clickElement(driver, By.xpath("//*[@value='Sign up']"));
        clickElement(driver, By.xpath("//a[text()='Log in']"));
        clickElement(driver, By.xpath("//a[text()='Log in']"));
        sendKeys(driver, By.xpath("//input[@type='email']"), "divenshb1@gmail.com");
        Thread.sleep(2000);
        sendKeys(driver, By.xpath("//input[@type='password']"), "Divenshb");
        clickElement(driver, By.xpath("//input[@type='submit']"));
        Thread.sleep(10000);
        clickElement(driver, By.xpath("//input[@type='checkbox']"));
        Thread.sleep(1000);
    }


    private static void clickElement(WebDriver driver, By locator) {
        try {
            driver.findElement(locator).click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("here -->" + e);
        }
    }
    //        public static WebDriverWait getWebDriverWait (WebDriver driver,int TimeOfSeconds){
//        return new WebDriverWait(driver,Duration.ofSeconds(TimeOfSeconds));
//        }
    public static void sendKeys(WebDriver driver, By Locator, String keys) {
        try {
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
            driver.findElement(Locator).sendKeys(keys);
        } catch (Exception e) {
            System.out.println("here --->" + e);
        }
    }
}
