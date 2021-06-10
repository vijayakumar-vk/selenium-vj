package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	@Test(priority= -1,invocationCount=2)
	public static void demo() {
		Reporter.log("hii",true);
	}
	@Test(priority=-2,enabled=false)
	public static void demo2() {
		Reporter.log("hello",true);
	}

}
