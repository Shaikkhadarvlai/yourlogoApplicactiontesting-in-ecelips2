package yourlogoPageTest.com;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void testloginfunction()
  {
	 ip.Clicksignin();
	  lp.setloginfunction();
  }
}
