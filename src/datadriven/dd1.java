package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dd1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
     
	      Properties p = new Properties();
	      p.load(new FileInputStream("./data.properties"));
	      driver.get(p.getProperty("url"));
	      
	  	
	}

}
