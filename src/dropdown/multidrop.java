package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multidrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoapp.skillrary.com/");
WebElement obj =driver.findElement(By.id("cars"));
Select s = new Select(obj);
s.selectByIndex(5);
s.selectByValue("299");
Thread.sleep(3000);
s.deselectByIndex(5);
s.deselectByValue("299");

List<WebElement> fin = s.getOptions();
System.out.println(s.isMultiple());

for(WebElement a: fin)
{
	System.out.println(a.getText());
}
	}

}
