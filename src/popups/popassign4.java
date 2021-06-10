package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popassign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.get("https://www.naukri.com/");
     
	      String parent = driver.getWindowHandle();
	      Set<String> child = driver.getWindowHandles();
	      String exptit = "Apisero";
	      for(String a:child) {
	    	  driver.switchTo().window(a);
	    	  String acttit = driver.getTitle();
	    	  if(acttit.equals(exptit)) {
	    		  driver.close();
	    		  
	    	  }
	      }
	}

}
