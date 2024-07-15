package yourlogoPage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
  
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//locators
	
	private By email=By.xpath("//input[@id='email']");
	private By password=By.id("passwd");
	private By button=By.xpath("//span[normalize-space()='Sign in']");
	
	
	
	
	
	//Methods
	public void setloginfunction()
	{
		driver.findElement(email).sendKeys("admin@xyz.com");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(button).click();
	}
	
	
	
}
