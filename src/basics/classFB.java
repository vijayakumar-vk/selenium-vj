package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classFB {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.facebook.com/");
		    driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("vijay");
		    driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("sdfxgch");
		    driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
