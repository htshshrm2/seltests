package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addressbook {
	WebDriver driver;
	@BeforeMethod()
	public void launch() {
		 System.setProperty("webdriver.chrome.driver","/usr/lib/chromium-browser/chromedriver");
	      driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://35.231.221.197:32768/addressbook/");
	}
  @Test
  public void verfiyaddbook() {
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("Selenium");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("987654321");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("edureka@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("06/11/1985");
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
  }
  @AfterMethod()
	  public void close() {
		  driver.close();
	  }
  }

