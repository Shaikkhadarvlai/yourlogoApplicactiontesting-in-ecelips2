package yourlogoPageTest.com;

import org.testng.annotations.Test;

public class chekoutpageTest extends BaseClass
{
  @Test(priority=1)
  public void testcheckout() 
  {
	  
	  cp.clickprcheck1();
  }
  @Test(priority=2)
  public void testproccesscheckout()
  {
	  cp.proccesschekout2();
  }
//  @Test(priority=3)
//  public void testcheckout3()
//  {
//	  cp.checkout3();
//  }

  
  
  
  
}
