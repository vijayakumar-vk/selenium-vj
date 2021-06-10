package basics;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class classtwitter {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
      WebDriver driver = new ChromeDriver();
      driver.get("https://twitter.com/LOGIN");
      WebDriverWait w = new WebDriverWait(driver,5);
      WebElement user = w.until(ExpectedConditions.visibilityOfElementLocated(By.name("session[username_or_email]")));
      if(user.isEnabled()) {
    	  user.sendKeys("vijay");
    	  System.out.println("TEST PASS:::The user element is enabled");
      }
      else 
      {
    	  System.out.println("TEST FAIL:::The user element is not enabled");

      }
      
      
      WebElement pass = w.until(ExpectedConditions.visibilityOfElementLocated(By.name("session[password]")));
      if(pass.isDisplayed()) {
    	  pass.sendKeys("passwordgiven ");
    	  pass.getText();
    	  pass.getAttribute("class");
    	  int height = pass.getSize().getHeight();
    	  int width = pass.getSize().getWidth();
    	 // Point loc = pass.getLocation();
    	  System.out.println("TEST PASS:::The passs element is displayed");
    	  System.out.println("the height iss " +height);
    	  System.out.println("the width is " +width);
         // System.out.println("the x cooordinate is "+ loc.getX());
      }
      else 
      {
    	  System.out.print("TEST FAIL:::The pass element is not displayed");
      }
      
      WebElement logIn = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log in']")));
      if(logIn.isEnabled()) {
    	 logIn.click();
    	  System.out.print("TEST PASS:::The logIn element is enabled");
    	//Point loc = logIn.getLocation();
    	//  int ycoo=logIn.getLocation().getY();
    	//  System.out.println("The x coordinate is " + loc.getX());
    	 // System.out.println("The y coordinate is " + ycoo);
    	  
      }
      else 
      {
    	  System.out.print("TEST FAIL:::The logIn element is not enabled");

      }
 
	}

}
