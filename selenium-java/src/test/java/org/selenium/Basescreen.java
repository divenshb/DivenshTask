package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Basescreen {
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
        sleep(2000);
        button.click();
    }
    public static void scrollToExact(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        if (!element.isDisplayed()) {
            System.out.println("Element is not visible: " + locator);
            return;
        }
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        try {
            jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center', inline: 'center' });", element);
            System.out.println("Scrolled to element: " + locator);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));

        } catch (Exception e) {
            System.out.println("Error scrolling to element: " + e.getMessage());
        }
    }
    }




