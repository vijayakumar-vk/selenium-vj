package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
	      
	      Robot r = new Robot();
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_N);
	      
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_N);
	     
	}

}
