package TestNG;

import org.testng.annotations.Test;

public class pom2 extends baseclass {
	@Test
	public void login() {
	pom1 p = new pom1(driver);
	 p.user("vihsd");
	 p.pass("fgd");
	 p.login();
	}

}
