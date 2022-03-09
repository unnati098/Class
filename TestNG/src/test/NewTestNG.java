package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestNG {

@Test(priority = 3)
  public void firstname() {
	  System.out.println("This is 1 testNG");
  }
  @Test(priority = 4)
  public void secondname() {
	  System.out.println("This is 2 testNG");
  }
  @Test(enabled=false)
  public void thirdname() {
	  System.out.println("This is 3 testNG");
  }
  @Test(priority = 1)
  public void forthname() {
	  System.out.println("This is 4 testNG");
  }
  @Test()
  public void fithname() {
	  System.out.println("This is 5 testNG");
  }
  @BeforeTest
	public void hello1() {
		System.out.println(" this will run before every test from NewTestNG");
	}
  @AfterTest
	public void hello12() {
		System.out.println(" this will run after every test from NewTestNG");
	}
}

