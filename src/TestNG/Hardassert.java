package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hardassert extends baseclass {
  
	@Test
	public void fun() {
	driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("vijay");
	driver.findElement(By.id("pass")).sendKeys("fgds");
    driver.findElement(By.name("login")).click();
    String title = driver.getTitle();
    Assert.assertEquals(title,"vnbhmjkl");
    Reporter.log(title,true);
	}
}
