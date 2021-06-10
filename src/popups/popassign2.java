package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popassign2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.get("https://www.naukri.com/");
      
	      String parent = driver.getWindowHandle();
	      Set<String> child = driver.getWindowHandles();
	      System.out.println(child.size());
	      
	      for(String a:child) {
	    	  driver.switchTo().window(a);
	    	  System.out.println(driver.getTitle());
	    	  
	      }
	      driver.quit();
	      

	}

}
