package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MachineTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("http://wma.lighthouseindia.com:9003/WMATEST/#/appkey-validation");
            driver.manage().window().maximize();
            clickElement(driver,By.xpath("//input[@class='native-input sc-ion-input-md']"));
            Sendkey(driver,By.xpath("//input[@class='native-input sc-ion-input-md']"), " L.V7CERP");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickElement(WebDriver driver, By locator){
        try{
            driver.findElement(locator).click();
        } catch (Exception e) {
            System.out.println("Error clicking element: " + e.getMessage());
        }
    }
    public static void Sendkey(WebDriver driver,By locator,String Keys){
        try {
            driver.findElement(locator).sendKeys(Keys);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}