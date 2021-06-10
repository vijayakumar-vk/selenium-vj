package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome,driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("")).sendKeys("gdfd");
		driver.findElement(By.xpath())
		
		

	}

}
