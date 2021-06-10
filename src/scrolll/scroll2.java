package scrolll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll2 {
        public static void main(String[] args) throws InterruptedException {
        	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        	WebDriver driver = new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	driver.get("https://www.snapdeal.com/");
        	
        	JavascriptExecutor js = (JavascriptExecutor)driver;
        	WebElement ele = driver.findElement(By.xpath("(//a[@class='product-card dp-widget-link'])[6]"));
        	Point coo = ele.getLocation();
        	int x = coo.x;
        	int y = coo.y;
        	
        	
        	js.executeScript("window.scrollBy("+x+","+y+")");
        	Thread.sleep(3000);
        	//driver.close();
}
}