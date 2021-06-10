package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
  @FindBy(id="email")
  private WebElement usernametxt;
  
  @FindBy(id="pass")
  private WebElement paswordtxt;
  
  @FindBy(name="login")
  private WebElement loginbtn;
  
  pom1(WebDriver driver){
	  PageFactory.initElements(driver,this);
  }
  
  public void user(String username) {
	  usernametxt.sendKeys(username);
  }
  public void pass(String password) {
	  paswordtxt.sendKeys(password);
  }
  public void login() {
	  loginbtn.click();
	  
  }
}
