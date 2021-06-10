package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actiondouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
	      driver.get("https://demoapp.skillrary.com/");
	     WebElement w = driver.findElement(By.xpath("//select[@name='addresstype']"));
	     
	     Select s = new Select(w);
	     s.selectByValue("category.php?category=testing");
	     driver.findElement(By.linkText("Cucumber")).click();
	     WebElement w1 = driver.findElement(By.xpath("//button[@id='add']"));
	     Actions a = new Actions(driver);
	     a.doubleClick(w1).perform();
	   
	}

}
