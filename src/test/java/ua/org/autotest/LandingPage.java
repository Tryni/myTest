package ua.org.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

public class LandingPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://widr.app/en");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//div[@class='jsx-2711542876 wdr-input-container']"));
        element.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(5000);
      driver.findElement(By.xpath("//div/button[1]']")).sendKeys(Keys.ENTER);

      //driver.sendKeys(Keys.ENTER);
       // driver.quit();
//implicitWait

    }

}
