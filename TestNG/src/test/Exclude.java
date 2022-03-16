package test;

import org.testng.annotations.Test;

public class Exclude {
	@Test
	public void signlogin() {
		System.out.println("@@@@@@@@@  2nd class - signlogin Exclude ");
	}
	@Test
	public void singuplogin() {
		System.out.println("###########  2nd class - singuplogin Exclude");
	}
	@Test
	public void logoutlogin() {
		System.out.println("$$$$$$$$$$$$  2nd class - logoutlogin Exclude");
	}

}
