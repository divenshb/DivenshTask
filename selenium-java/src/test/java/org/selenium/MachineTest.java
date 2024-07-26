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
            clickElement(driver, By.xpath("//*[@class='button-round button-round-md ion-color ion-color-primary md button button-block button-solid ion-activatable ion-focusable hydrated']"));//loginbutton
            Thread.sleep(4000);
            clickElement(driver, By.xpath("//*[@aria-label='Entity']"));//Entity
            Thread.sleep(5000);
            clickElement(driver, By.xpath("(//*[@class='select-interface-option md sc-ion-select-popover-md item item-fill-none in-list ion-activatable ion-focusable hydrated item-label'])[2]"));//3rdEntity
            clickElement(driver, By.xpath("//*[@aria-label='Acc. Year']"));
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
            clickElement(driver,By.xpath("(//*[@class='h-100'])[10]"));
            clickElement(driver,By.xpath("(//*[@class='ion-no-padding item-has-start-slot item md item-fill-none in-list hydrated'])[14]"));
            clickElement(driver,By.xpath("(//*[@class='mr-1 globe-btn md button button-block button-solid ion-activatable ion-focusable hydrated'])[2]"));
//          clickElement(driver,By.xpath("(//*[@class='effect-8 bg-input ng-untouched ng-pristine ng-valid sc-ion-input-md-h sc-ion-input-md-s md hydrated ion-untouched ion-pristine ion-valid'])[1]"));
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[1]"));
            clickElement(driver,By.xpath("//*[text()=\"Tender Master\"]"));
            clickElement(driver,By.xpath("//*[@id='WEML0207-I-10']"));
            Thread.sleep(2000);
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[1]"));
            Thread.sleep(2000);
            clickElement(driver,By.xpath("//*[text()=' TENDER MASTER-TM ']"));
            Thread.sleep(3000);
//            clickElement(driver,By.xpath("(//*[@class='input-group justify-content-end'])[4]"));
            clickElement(driver,By.xpath("(//*[@class='input-group justify-content-end'])[4]"));
            Thread.sleep(1000);
//            Sendkey(driver,By.xpath("(//*[@class='input-group justify-content-end'])[4]"),"Testing Purpose");
            Sendkey(driver,By.xpath("(//*[@type='text'])[21]"),"Testing Purpose");
            Thread.sleep(1000);
            clickElement(driver,By.xpath("//*[@aria-haspopup='listbox']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("//*[@id='ace4e486f32f-4']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[7]"));
            Thread.sleep(5000);
            clickElement(driver,By.xpath("//*[text()=' SILVER TUBES. ']"));
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[11]"));
            Thread.sleep(5000);
            clickElement(driver,By.xpath("//*[text()=' SILVER TUBES. ']"));
            clickElement(driver,By.xpath("(//*[@type='submit'])"));
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[15]"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("//*[text()=' BF ']"));
            Thread.sleep(2000);
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[5]"));
            Thread.sleep(2000);
            clickElement(driver,By.xpath("(//*[text()=' AAAA SSSS AAAA '])"));
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[9]"));
            Thread.sleep(3000);
            clickElement(driver,By.xpath("//*[text()=' ASHUTOSH  STEEL INDUSTRIES(MGG) ']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[13]"));
            Thread.sleep(3000);
            clickElement(driver,By.xpath("//*[text()=' NIRANJA ']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@name='calendar'])[1]"));
            clickElement(driver,By.xpath("//*[@aria-label='Friday, July 26, 2024']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@name='calendar'])[2]"));
            clickElement(driver,By.xpath("//*[@aria-label='Monday, July 1, 2024']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@name='calendar'])[3]"));
            clickElement(driver,By.xpath("//*[@aria-label='Friday, July 26, 2024']"));
            clickElement(driver,By.xpath("(//*[@name='calendar'])[4]"));
            clickElement(driver,By.xpath("(//*[@aria-label='Tuesday, July 2, 2024'])"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@name='calendar'])[5]"));
            clickElement(driver,By.xpath("//*[@aria-label='Friday, July 26, 2024']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@name='calendar'])[6]"));
            clickElement(driver,By.xpath("//*[@aria-label='Wednesday, July 3, 2024']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@name='calendar'])[7]"));
            clickElement(driver,By.xpath("//*[@aria-label='Wednesday, July 3, 2024']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@name='calendar'])[8]"));
            clickElement(driver,By.xpath("//*[@aria-label='Friday, July 26, 2024']"));
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@class='input-group-append'])[19]"));
            Thread.sleep(2000);
            clickElement(driver,By.xpath("//*[text()=' WEME0192 ']"));
            clickElement(driver,By.xpath("(//*[@class='input-group justify-content-end'])[22]"));
            Sendkey(driver,By.xpath("(//*[@type='number'])[1]"),"2");
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@class='input-group justify-content-end'])[23]"));
            Sendkey(driver,By.xpath("(//*[@type='number'])[2]"),"3000000");
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@class='input-div'])[28]"));
            Sendkey(driver,By.xpath("//*[@id='REMARK']"),"TestTest");
            Thread.sleep(1000);
            clickElement(driver,By.xpath("(//*[@class='input-group justify-content-end'])[21]"));
            Sendkey(driver,By.xpath("//*[@id='TENDER_CLOSURE_REMARK']"),"//*[@id='TENDER_CLOSURE_REMARK']");
            Thread.sleep(1000);
            clickElement(driver,By.xpath("//*[@role='checkbox']"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}