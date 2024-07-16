package yourlogoPage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selectproductpage 
{

	private WebDriver driver;
	   
	   public Selectproductpage (WebDriver driver)
	   {
		   this.driver=driver;
	   }
	   
	   //Locators
	   private By selectWhite=By.xpath("//a[@title='White']");
	   private By addcart=By.xpath("//span[normalize-space()='Add to cart']");
	
	  
	 //Method
	   public void selecttoaddcart()
	   {
		   driver.findElement(selectWhite).click();
		  
	   }
	   public void selectcolour()
	   {
		   driver.findElement(addcart).click();
		   
	   }
	  
	   
	   
}
