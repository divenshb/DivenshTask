package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LogIn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        driver.manage().window().maximize();
        clickElement(driver,By.xpath("//a[@class='theme-btn register-btn']"));
        clickElement(driver,By.xpath("//input[@type='email']"));
        Thread.sleep(2000);
        sendKeys(driver,By.xpath("//input[@type='email']"), "divenshb1@gmail.com");
        clickElement(driver,By.xpath("//input[@type='password']"));
        Thread.sleep(2000);
        sendKeys(driver,By.xpath("//input[@type='password']"),"Divenshb");
        clickElement(driver,By.xpath("//input[@type='submit']"));
    }
    public static void clickElement(WebDriver driver, By locator){
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            System.out.println("here --->" + e);
        }
    }
    public static void sendKeys(WebDriver driver,By locator,String keys){
        try {
            driver.findElement(locator).sendKeys();
        } catch (Exception e) {
            System.out.println("here --->" + e);
        }
    }
}
