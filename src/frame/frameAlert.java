package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://paytm.com/");
        
        driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
         //driver.findElement(By.xpath("//p[text()='To Login into your Paytm Web account']"));
        
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'     Google Play')]")).click();
        
	}
	
	
}
