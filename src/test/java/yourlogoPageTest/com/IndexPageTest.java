package yourlogoPageTest.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseClass
{
  @Test(priority=1)
  public void  testUrl()
  {
	String url= ip.getUrl();
  Assert.assertTrue(url.contains("index"),"This url is not matched");
  System.out.println("This url is matched="+url);
  
  }
  @Test(priority=2)
public void testTitle()
{

   String title= ip.getTitle();
   Assert.assertTrue(title.contains("My Shop"),"This Title is not matched");
   System.out.println("This Title is matched="+title);
   
}
  
  @Test(priority=3)
  public void testsign()
  {
	 ip.Clicksignin();
  }

}
