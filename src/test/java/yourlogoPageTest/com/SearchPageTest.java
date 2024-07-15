package yourlogoPageTest.com;

import org.testng.annotations.Test;

public class SearchPageTest extends BaseClass
{
  @Test(priority=1)
  public void testsearchbox() 
  {
	  sp.sebdsearchbox();
  }
  @Test(priority=2)
  public void TestItem()
  {
	  sp.SelectTheItem();
 
  }
  

}
