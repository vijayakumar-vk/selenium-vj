package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frameFileup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.findElement(By.xpath("//button[@title='I am a Professional']")).click();
		Thread.sleep(5000);
		WebDriverWait w = new WebDriverWait(driver,15);
		w.until(ExpectedConditions.elementToBeClickable(By.name("uploadCV"))).click();
		//driver.findElement(By.name("uploadCV")).click();
		
	 

	}

}
