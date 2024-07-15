package yourlogoPage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage 
{
	private WebDriver driver;
	
	public IndexPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Locators
	
	private By sign=By.xpath("//a[normalize-space()='Sign in']");
	
	
	
	
	//methods
	public String getUrl()
	{
		
	return 	driver.getCurrentUrl();
		
	}
	
	public String getTitle()
	{
	 return driver.getTitle();
		
	}
	public void Clicksignin()
	{
		driver.findElement(sign).click();
	}
	
	

}
