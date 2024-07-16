package yourlogoPageTest.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import yourlogoPage.com.IndexPage;
import yourlogoPage.com.LoginPage;
import yourlogoPage.com.SearchItemPage;
import yourlogoPage.com.Selectproductpage;
import yourlogoPage.com.checkoutpage;



public class BaseClass 
{
	public WebDriver driver;
	public IndexPage ip;
	public LoginPage lp;
	public SearchItemPage sp;
	public Selectproductpage sel;
	public checkoutpage cp;
	
	@BeforeTest
	
	public void setUpBrowse()
	{
		driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    
	    
	    ip=new IndexPage (driver);
	    lp=new LoginPage(driver);
	    sp=new SearchItemPage (driver);
	   sel=new Selectproductpage (driver);
	   cp=new checkoutpage(driver);
	
	}
	
	
	@BeforeClass
	public void SetUpPage()
	{
		ip.Clicksignin();
		addWait();
    	lp.setloginfunction();
		addWait();
		sp.sebdsearchbox();
		addWait();
		sp.SelectTheItem();
		addWait();
		 sel.selecttoaddcart();
		 addWait();
		 sel.selectcolour();
		 addWait();
	     cp.clickprcheck1();
	     addWait();
	     cp.proccesschekout2();
	     addWait();
	    
		
	
	}

	
	
	
	
	
	
	
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
