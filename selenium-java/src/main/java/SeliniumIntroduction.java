import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeliniumIntroduction {
    public static void main (String [] args){

        System.setProperty("webDriver.gecko.driver","\"C:\\Users\\Asus\\Desktop\\Selenium_data\\geckodriver-v0.34.0-win-aarch64.zip\"");
        WebDriver driver = new FirefoxDriver();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        try{
            driver.get("https://www.bajajfinservhealth.in/");
            // Locate the username field and enter the username
            WebElement usernamefield = driver.findElement(By.id("Username"));
            usernamefield.sendKeys("Divenshb");

            // Locate the password field and enter the password.
            WebElement passwordField = driver.findElement(By.id("Password"));
            passwordField.sendKeys("Test001");

            // Click the login button
            WebElement loginButton = driver.findElement(By.id("loginButton"));
            loginButton.click();

            //
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        driver.close();
        driver.quit();






    }
}
