package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=11436308751979068025&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
            clickElement(driver,By.xpath(""));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickElement(WebDriver driver, By locator){
        driver.findElement(locator).click();
    }
    public static void sendkeys(WebDriver driver, By locator, String Keys){
        driver.findElement(locator).sendKeys(Keys);
    }
}
