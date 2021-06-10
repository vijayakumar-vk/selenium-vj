package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDrag {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	      WebElement ele1 = driver.findElement(By.xpath("//div[@id='block-3']"));
	      WebElement ele2 = driver.findElement(By.xpath("//div[@id='block-2']"));
	      
	      Actions a = new Actions(driver);
	      a.dragAndDrop(ele2, ele1).perform();

	}

}
