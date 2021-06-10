package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classB {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
    
   String url = driver.getCurrentUrl();
   
   
   Thread.sleep(3000);
    if(url.equals("https://demo.actitime.com/login.do"))
    {
    	System.out.println("pass");
    }
    else 
    {
    	System.out.println("fail");
    }
    
    String title = driver.getTitle();
    System.out.println(title);
    
    if(title.equals("actiTIME - Enter Time-Track"))
    	             
    {
    	System.out.println("pass");
    }
    else 
    {
    	System.out.println("fail");
    }
	      }
	
	
	                            
}
