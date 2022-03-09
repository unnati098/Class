package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@AfterTest
	public void hello() {
		System.out.println(" this will run after every test");
	}
	@BeforeTest
	public void testlogin() {
		System.out.println("2nd class - login test this will run before every test");
	}
	@Test
	public void signlogin() {
		System.out.println("2nd class - signlogin ");
	}
	@Test
	public void singuplogin() {
		System.out.println("2nd class - singuplogin ");
	}
	@Test
	public void logoutlogin() {
		System.out.println("2nd class - logoutlogin");
	}
	@Test
	public void login() {
		System.out.println("2nd class - login ");
	}

}
