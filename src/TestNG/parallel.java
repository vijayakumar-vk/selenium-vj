package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel {
	WebDriver driver;

	@BeforeMethod
	public void open() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");

	}

	@Parameters({ "BrowserName" })
	@Test
	public void met(String browser) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} 
		else
		{
			driver = new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("vijay");
		driver.findElement(By.id("pass")).sendKeys("fgds");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		Reporter.log(title);
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
