package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity21 {
	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/tabs");
        System.out.println("Page title: " + driver.getTitle());
        
        driver.findElement(By.xpath("//button[text()= 'Open A New Tab']")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Current tab: " + driver.getWindowHandle());
        System.out.println("All open tab handles: " + driver.getWindowHandle());

        for(String handle : driver.getWindowHandles()) {
        	driver.switchTo().window(handle);
        }
        
        System.out.println("Current tab: " + driver.getWindowHandle());
        System.out.println("Current Hadle tab: " + driver.getTitle());
        System.out.println("Message on the new tab: " + driver.findElement(By.cssSelector("h2.text-gray-800")).getText());
        
        driver.quit();
}
}
