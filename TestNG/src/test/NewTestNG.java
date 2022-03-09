package test;
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
}

