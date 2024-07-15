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
	private By checkout=By.xpath("//span[normalize-space()='Proceed to checkout']");


   
	//Methods
	public void clickprcheck()
	{
		driver.findElement(checkout).click();
	}



}
