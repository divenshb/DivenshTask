package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium.Base.BaseScreen;
import org.selenium.Base.Locator;

import java.time.Duration;

import static java.awt.SystemColor.window;


public class MachineTest extends Basescreen {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("http://wma.lighthouseindia.com:9003/WMATEST");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            clickElement(driver, By.xpath("//input[@class='native-input sc-ion-input-md']"));
            Sendkey(driver, By.xpath("//input[@class='native-input sc-ion-input-md']"), " L.V7CERP");
            clickElement(driver, By.xpath("//*[@type='submit']"));
            Thread.sleep(7000);
            clickElement(driver, By.xpath("(//input[@placeholder='Username'])"));
            Sendkey(driver, By.xpath("(//input[@placeholder='Username'])"), "SHASHANK");
            Thread.sleep(1000);
            clickElement(driver, By.xpath("(//input[@placeholder='Password'])"));
            Sendkey(driver, By.xpath("(//input[@placeholder='Password'])"), "123");
            Thread.sleep(1000);
            clickElement(driver, By.xpath("//*[@class='button-round button-round-md ion-color ion-color-primary md button button-block button-solid ion-activatable ion-focusable hydrated']"));
            Thread.sleep(2000);
            clickElement(driver, By.xpath("(//*[@class='ng-untouched ng-pristine ng-invalid ion-untouched ion-pristine ion-invalid md in-item hydrated'])[1]"));
            clickElement(driver, By.xpath("(//*[@role='listitem'])[7]"));
            clickElement(driver, By.xpath("(//*[@class='ng-untouched ng-pristine ng-invalid ion-untouched ion-pristine ion-invalid md in-item hydrated'])"));
            Thread.sleep(3000);
            ScrollToElement(driver, By.xpath("//*[@class='sc-ion-select-popover-md md list-md hydrated']"));
            Thread.sleep(4000);
            clickElement(driver, By.xpath("(//*[text()='23-24 '])[2]"));
            Thread.sleep(1000);
            clickElement(driver, By.xpath("(//*[@class='text-center ion-color ion-color-primary md button button-round button-solid ion-activatable ion-focusable hydrated'])"));
            clickElement(driver,By.xpath("(//*[@class='ion-no-padding item-has-start-slot item md item-fill-none in-list hydrated'])[3]"));
            Thread.sleep(2000);
            scrollToExact(driver, By.xpath("(//*[@class=\"ion-no-padding item-has-start-slot item md item-fill-none in-list hydrated\"])[40]"));
            clickElement(driver,By.xpath("(//*[@class=\"ion-no-padding item-has-start-slot item md item-fill-none in-list hydrated\"])[45]"));
            clickElement(driver,By.xpath("(//*[@class='menu-list md list-md hydrated'])[3]"));
            clickElement(driver,By.xpath("(//*[@class='ion-no-padding item-has-start-slot item md item-fill-none in-list hydrated'])[14]"));
            clickElement(driver,By.xpath("(//*[@class='mr-1 globe-btn md button button-block button-solid ion-activatable ion-focusable hydrated'])[2]"));
//            clickElement(driver,By.xpath("(//*[@class='effect-8 bg-input ng-untouched ng-pristine ng-valid sc-ion-input-md-h sc-ion-input-md-s md hydrated ion-untouched ion-pristine ion-valid'])[1]"));
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[1]"));
            clickElement(driver,By.xpath("//*[text()=\" TENDER MASTER-TM \"]"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}