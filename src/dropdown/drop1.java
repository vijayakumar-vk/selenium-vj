package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        
        
		Select s = new Select(day);
		s.selectByValue("30");
		
		
		Select s1 = new Select(month);
		s1.selectByVisibleText("Nov");
		List<WebElement> totalmonth = s1.getOptions();
		
		Select s2=new Select(year);
		s2.selectByVisibleText("1997");
		
		ArrayList monthName = new ArrayList<>();
		
		for(WebElement m:totalmonth) {
			String t = m.getText();
			System.out.println(t);
			
			
		}
	}

}
