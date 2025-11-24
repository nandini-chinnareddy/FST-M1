package Project;
 
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class projectactivity6 {
 
    WebDriver driver;
 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
 
    
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();
    }
 
    @Test
    public void editUserInfo() throws InterruptedException {
       
        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
 
        username.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.className("button")).click();
        
      
        
        String Menuheading = driver.findElement(By.id("menu_directory_viewDirectory")).getText();
	    System.out.println(Menuheading);
	    Assert.assertEquals("Directory", Menuheading);
	    driver.findElement(By.id("menu_directory_viewDirectory")).click();
        
        
      String Dirheading = driver.findElement(By.xpath("//h1[contains(text(), 'Search Directory')]")).getText();
	    System.out.println(Dirheading);
	    Assert.assertEquals("Search Directory", Dirheading);
 
    }
 
    @AfterClass
    public void afterClass() {
        // Close the browser
        driver.close();
    }
}
