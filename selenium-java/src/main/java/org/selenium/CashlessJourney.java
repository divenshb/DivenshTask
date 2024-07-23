//package org.selenium;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;
//import java.util.List;
//
//public class CashlessJourney {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        try {
//            driver.get("https://stag.bajajfinservhealth.in/");
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
//            driver.manage().window().maximize();
//
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//div[text()='Consult Doctors'])[2]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//div[@data-testid='oxR64Xbr1i74HhsqrengxB'])[1]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//div[@data-testid='vBjT8xqYDHV3W2H6FKfW6F'])[1]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//*[@data-testid= 'pejgfGbtQGVv1p6CURGWv4'])[1]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//button[@data-testid='select-date'])[3]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//div[@data-testid='miUPypGHfVDv5KF7UxKpLq'])[3]"));
//            Thread.sleep(2000);
////            scrollToElementAndClick(driver,By.xpath("(//button[@data-testid='appt-slots'])[48]") );
////            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//button[@data-testid='appt-slots'])[5]"));
//            Thread.sleep(3000);
//            clickElements(driver, wait, By.xpath("//div[@class='css-9ik0xp']"));
//            Thread.sleep(3000);
//            clickElements(driver, wait, By.xpath("//*[@class='proceed-btn']"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//button[@type='button'])[3]"));
//            Thread.sleep(3000);
//            clickElements(driver, wait, By.xpath("//img[@data-test-id='bajaj-logo']"));
//            Thread.sleep(4000);
//            clickElements(driver, wait, By.xpath("(//div[text()='Consult Doctors'])[2]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//div[@data-testid='oxR64Xbr1i74HhsqrengxB'])[2]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//div[@data-testid='vBjT8xqYDHV3W2H6FKfW6F'])[2]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//button[@data-testid='book-appt-button-listing-page'])[1]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//button[@type='button'])[7]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//div[@data-testid='rZCXwzpiTPZStECBHWo2HU'])[3]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//button[@data-testid='appt-slots'])[10]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//button[@type='button'])[60]"));
//            Thread.sleep(3000);
//            clickElements(driver, wait, By.xpath("//button[@class='proceed-btn']"));
//            Thread.sleep(4000);
//            clickElements(driver, wait, By.xpath("(//button[@type='button'])[3]"));
////            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("//img[@data-test-id='bajaj-logo']"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//div[@data-jest-id='offer-tabs'])[2]"));
//            Thread.sleep(3000);
//            clickSlickUntilFound(driver, By.xpath("(//button[@data-testid='components-add-to-cart-btn-index-button-1'])[4]"));
//            Thread.sleep(5000);
//            clickElements(driver, wait, By.xpath("(//button[@data-testid='components-provider-select-dialog-display-providers-button-1'])[1]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//button[@data-testid='components-provider-select-dialog-provider-name-card-button-1'])[1]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//*[@type='button'])[4]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("//button[@data-testid='components-cart-dialog-index-button-7']"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("//*[@data-testid='CloseIcon']"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("//a[@title= 'Bajaj Finserv Health']"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("(//div[@data-jest-id='offer-tabs'])[3]"));
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("//button[@data-testid='call-drawer-chip']"));
//            Thread.sleep(1000);
//            clickElements(driver, wait, By.xpath("//div[@class='MuiBackdrop-root e-css-919eu4']"));
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Close the browser
//            driver.quit();
//        }
//    }
//
//    private static void clickSlickUntilFound(WebDriver driver, By xpath) {
//    }
//
//    public static void clickElements(WebDriver driver, WebDriverWait wait, By locator) {
//        try {
//            driver.findElement(locator).click();
//        } catch (ElementClickInterceptedException e) {
//            System.out.println("here -->" + e);
//        }
//    }
//
//    //    public static void slickbutton(WebDriver driver, By locator) {
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Increase timeout if needed
////        try {
////            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
////        } catch (TimeoutException e) {
////            System.out.println("Element not found within timeout!");
////        }
////    }
//    public static void clickSlickUntilFound(WebDriver driver, By Buttonlocator, By targetElementLocator) throws InterruptedException {
//        int MaxClick = 2;
//        int CurrentClick = 0;
//        while (CurrentClick < MaxClick) {
//            List<WebElement> Button = driver.findElements(Buttonlocator);
//            //Check button found or not
//            if (Button.isEmpty()) {
//                System.out.println("Unable to find the button");
//            }
//            Button.get(0).click();
//            CurrentClick++;
//
//            // Check if target element is present after click
//            if (driver.findElements(targetElementLocator).size() > 0) {
//                driver.findElement(targetElementLocator).click();
//                return;
//            }
//            Thread.sleep(2000);
//            // If loop finishes without finding the element, throw an exception
//            throw new RuntimeException("Target element not found after " + MaxClick + " clicks.");
//        }
//    }
//}
//
// // Scrolling function
////    public static void scrollToElementAndClick(WebDriver driver, By locator) throws InterruptedException {
////        WebElement button = driver.findElement(By.xpath("(//button[@data-testid='appt-slots'])[48]"));
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
////        Thread.sleep(2000);
////        button.click();
////    }
//

package org.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
public class CashlessJourney {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.bajajfinservhealth.in/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            driver.manage().window().maximize();
            clickElements(driver, wait, By.xpath("(//div[text()='Consult Doctors'])[2]"));
            clickElements(driver, wait, By.xpath("(//div[@data-testid='oxR64Xbr1i74HhsqrengxB'])[1]"));
            clickElements(driver, wait, By.xpath("(//div[@data-testid='vBjT8xqYDHV3W2H6FKfW6F'])[1]"));
            clickElements(driver, wait, By.xpath("(//*[@data-testid= 'pejgfGbtQGVv1p6CURGWv4'])[1]"));
            clickElements(driver, wait, By.xpath("(//button[@data-testid='select-date'])[3]"));
            clickElements(driver, wait, By.xpath("(//div[@data-testid='miUPypGHfVDv5KF7UxKpLq'])[3]"));
            clickElements(driver, wait, By.xpath("(//button[@data-testid='appt-slots'])[5]"));
            clickElements(driver, wait, By.xpath("//div[@class='css-9ik0xp']"));
            clickElements(driver, wait, By.xpath("//*[@class='proceed-btn']"));
            clickElements(driver, wait, By.xpath("(//button[@type='button'])[3]"));
            clickElements(driver, wait, By.xpath("//img[@data-test-id='bajaj-logo']"));
            clickElements(driver, wait, By.xpath("(//div[text()='Consult Doctors'])[2]"));
            clickElements(driver, wait, By.xpath("(//div[@data-testid='oxR64Xbr1i74HhsqrengxB'])[2]"));
            clickElements(driver, wait, By.xpath("(//div[@data-testid='vBjT8xqYDHV3W2H6FKfW6F'])[2]"));
            clickElements(driver, wait, By.xpath("(//button[@data-testid='book-appt-button-listing-page'])[1]"));
            clickElements(driver, wait, By.xpath("(//button[@type='button'])[7]"));
            clickElements(driver, wait, By.xpath("(//div[@data-testid='rZCXwzpiTPZStECBHWo2HU'])[3]"));
            clickElements(driver, wait, By.xpath("(//button[@data-testid='appt-slots'])[10]"));
            clickElements(driver, wait, By.xpath("(//button[@type='button'])[60]"));
            clickElements(driver, wait, By.xpath("//button[@class='proceed-btn']"));
            clickElements(driver, wait, By.xpath("(//button[@type='button'])[3]"));
            clickElements(driver, wait, By.xpath("//img[@data-test-id='bajaj-logo']"));
            clickElements(driver, wait, By.xpath("(//div[@data-jest-id='offer-tabs'])[2]"));
            Thread.sleep(5000);
            clickSlickUntilFound(driver, By.xpath("(//div[@data-testid='components-slick-btn-fix-div-1'])[2]"), By.xpath("(//button[@data-testid='components-add-to-cart-btn-index-button-1'])[4]"));
            clickElements(driver, wait, By.xpath("(//button[@data-testid='components-provider-select-dialog-display-providers-button-1'])[1]"));
            clickElements(driver, wait, By.xpath("(//button[@data-testid='components-provider-select-dialog-provider-name-card-button-1'])[1]"));
            clickElements(driver, wait, By.xpath("(//*[@type='button'])[4]"));
            clickElements(driver, wait, By.xpath("//button[@data-testid='components-cart-dialog-index-button-7']"));
            clickElements(driver, wait, By.xpath("//*[@data-testid='CloseIcon']"));
            clickElements(driver, wait, By.xpath("//a[@title= 'Bajaj Finserv Health']"));
            clickElements(driver, wait, By.xpath("(//div[@data-jest-id='offer-tabs'])[3]"));
//            clickElements(driver, wait, By.xpath("//button[@data-testid='call-drawer-chip']"));
//            clickElements(driver, wait, By.xpath("//div[@class='MuiBackdrop-root e-css-919eu4']"));
            //Unable to find the unique element to close the drawer so Used parent xpath to close the drawer
//            Thread.sleep(2000);
//            clickElements(driver, wait, By.xpath("//body[@class='light-theme']"));
            Thread.sleep(3000);
            clickElements(driver,wait,By.xpath("(//a[@data-testid='AllServices'])[1]"));
            // Scrolling function
            ScrollToElement(driver,wait,By.xpath("//div[@data-testid='26ycX6hiNpctLWryevTcLL']"));
            Thread.sleep(2000);
            clickElements(driver,wait,By.xpath("(//a[@data-testid='sshrYh9vi2UtpEJbK9Co9t'])[10]"));
            ScrollToElement(driver,wait,By.xpath("//div[@data-testid='26ycX6hiNpctLWryevTcLL']"));
            Thread.sleep(2000);
            clickElements(driver,wait,By.xpath("(//div[@data-testid='bYAUDurPtodsgwysBXBZZV'])[5]"));
            clickElements(driver,wait,By.xpath("(//button[@data-testid='select-date'])[3]"));
            clickElements(driver,wait,By.xpath("(//button[@data-testid='appt-slots'])[7]"));
            clickElements(driver,wait,By.xpath("(//button[@type='button'])[23]"));
            clickElements(driver,wait,By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl e-css-1clk8e0']"));
            Thread.sleep(1000);
            clickElements(driver,wait,By.xpath("//input[@placeholder='1234567890']"));
            Thread.sleep(1000);
            sendKeys(driver,By.xpath("//input[@placeholder='1234567890']"),"7972279331");
            Thread.sleep(1000);
            clickElements(driver,wait,By.xpath("//input[@type='checkbox']"));
            clickElements(driver,wait,By.xpath("//button[@data-testid='continue-button']"));
            clickElements(driver,wait,By.xpath("(//button[@type='button'])[4]"));
            clickElements(driver,wait,By.xpath("//img[@data-test-id='bajaj-logo']"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            driver.quit();
        }
    }

    public static void clickElements(WebDriver driver, WebDriverWait wait, By locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        } catch (Exception e) {
            System.out.println("Error clicking element: " + e.getMessage());
        }
    }

    public static void clickSlickUntilFound(WebDriver driver, By buttonLocator, By targetElementLocator) throws InterruptedException {
        int maxClicks = 5; // Increased maximum clicks for better handling
        int currentClick = 0;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Added WebDriverWait

        while (currentClick < maxClicks) {
            List<WebElement> buttons = driver.findElements(buttonLocator);

            if (buttons.isEmpty()) {
                System.out.println("Unable to find the button");
                break;
            }
            buttons.get(0).click();
            currentClick++;
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(targetElementLocator));
                if (wait.until(ExpectedConditions.elementToBeClickable(targetElementLocator)).isDisplayed()) {
                    wait.until(ExpectedConditions.elementToBeClickable(targetElementLocator)).click();
                    return;
                }
            } catch (TimeoutException e) {
                System.out.println("Target element not found within timeout: " + targetElementLocator);
            }
            Thread.sleep(2000); // Consider using a smaller wait with a loop for responsiveness
        }
        throw new RuntimeException("Target element not found after " + maxClicks + " clicks.");
    }

    // Header Button
    public static void HeaderButton(WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Scroll method
    public static void ScrollToElement(WebDriver driver, WebDriverWait Wait, By locator) throws InterruptedException {
        WebElement button = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", button);
        Thread.sleep(2000);

    }
    public static void sendKeys(WebDriver driver, By locator,String keys){
        driver.findElement(locator).sendKeys(keys);
    }

}

