package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class casefb extends baseclass {
	
	@Test
	public void func() {
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("vijay");
		driver.findElement(By.id("pass")).sendKeys("fgds");
        driver.findElement(By.name("login")).click();
        String title = driver.getTitle();
        Reporter.log(title,true);
	}

}
