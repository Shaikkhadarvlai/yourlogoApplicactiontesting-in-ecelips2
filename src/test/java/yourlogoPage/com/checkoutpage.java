package yourlogoPage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpage
{
	private WebDriver driver;
	
  
	public checkoutpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Locators
	private By checkout1=By.xpath("(//i[@class='icon-chevron-right right'])[3]");
    private By procceschekout2=By.xpath("(//i[@class='icon-chevron-right right'])[3]");
  //  private By checkout3=By.name("processAddress");
   
	//Methods
	public void clickprcheck1()
	{
		driver.findElement(checkout1).click();
	}
   public void proccesschekout2()
   {
	   driver.findElement(procceschekout2).click();
   }
   

  

}
