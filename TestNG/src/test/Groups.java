package test;

import org.testng.annotations.Test;

public class Groups {
	@Test (groups = { "logout"})
	public void Logout1() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");
	}
	@Test
	public void logout2() {
		System.out.println("################################# ");
	}
	@Test (groups = { "logout"})
	public void logout3() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
}
