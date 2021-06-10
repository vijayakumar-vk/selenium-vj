package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class classD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		WebDriverWait w = new WebDriverWait (driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("vijsay");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("23458967");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Log In')]"))).click();
		//driver.findElement(By.name("username")).sendKeys("vijay");
		//driver.findElement(By.name("password")).sendKeys("34f562347");
		//driver.findElement(By.xpath("//div[contains(text(),'Log In')]")).click();
}

}
