package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ss1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		TakesScreenshot t= (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./picture/pic1.png");
		FileUtils.copyFile(source, dest);

	}

}
