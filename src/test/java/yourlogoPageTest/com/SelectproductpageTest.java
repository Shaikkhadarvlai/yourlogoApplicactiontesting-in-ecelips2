package yourlogoPageTest.com;

import org.testng.annotations.Test;

public class SelectproductpageTest extends BaseClass
{
  @Test(priority=1)
  public void Testproductselect () 
  {
	  sel.selecttoaddcart();
	
  }
  
  @Test(priority=2)
  public void testcolour()
  {
	  sel.selectcolour();
  }
  
}
