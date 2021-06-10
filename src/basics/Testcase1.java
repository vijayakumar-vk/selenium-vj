package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
public static boolean test1() {
		return true;
}
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("nvjvijay1997@gmail.com");
		driver.findElement(By.name("password")).sendKeys("janarama");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(3000);

		String actualurl = "https://www.instagram.com/";
		if(actualurl==driver.getCurrentUrl()) {
			System.out.print("pass");
		}
		else {
			System.out.print("fail");
		}
	}

}
