package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class auto {

       @Test		
	
	public void xyz() throws InterruptedException {
		
    	
		
		   WebDriver driver =new EdgeDriver();
			driver.get("http://magnus.jalatechnologies.com");
			
			driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
			driver.findElement(By.id("Password")).sendKeys("jobprogram");
			driver.findElement(By.id("btnLogin")).click();
			

			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class=\"fa fa-th-list\"]")).click();
			
			String pageurl=driver.getCurrentUrl();
			Assert.assertEquals(pageurl,"https://magnus.jalatechnologies.com/Home/Index");
			Thread.sleep(1000);

			
			driver.findElement(By.xpath("//a[@href=\"/Home/Menu\"]")).click();
			driver.navigate().back();
			Assert.assertEquals(pageurl,"https://magnus.jalatechnologies.com/Home/Index");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//i[@class=\"fa fa-th-list\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href=\"/Home/AutoComplete\"]")).click();
			driver.navigate().back();
			
			driver.navigate().refresh();
			 Assert.assertEquals(pageurl, "https://magnus.jalatechnologies.com/Home/Index");
			
			
}}