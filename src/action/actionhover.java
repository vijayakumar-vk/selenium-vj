package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionhover {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://luxire.com/");
	     WebElement shirt = driver.findElement(By.xpath("(//a[text()='Shirts'])[3]"));
	     
	     Actions a = new Actions(driver);
	     a.moveToElement(shirt).perform();
	     Thread.sleep(5000);
	     driver.findElement(By.linkText("Denim Shirts")).click();
	     Thread.sleep(3000);
	    String  ele =driver.getCurrentUrl();
	     System.out.print(ele);
	      if(ele.equals("https://luxire.com/collections/denim-shirts")) {
	    	  System.out.print("pass");
	      }
	      else {
	    	  System.out.print("fail");
	      }
	}

	}


