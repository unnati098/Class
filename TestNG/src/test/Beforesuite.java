package test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class Beforesuite {
	@BeforeSuite
	public void beore() {
		System.out.println(" @@@@@   BeforeSuite @@@@@@");
	}

}
