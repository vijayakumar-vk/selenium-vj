package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multidrop1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
 WebElement w = driver.findElement(By.name("q"));
w.sendKeys("seleniumpyth");
Thread.sleep(3000);
List<WebElement> w1 = driver.findElements(By.xpath("//li[@class='sbct']"));
System.out.print( w1.size());
for(WebElement b:w1) {
	System.out.println(b.getText());
}

driver.close();

	}
}
