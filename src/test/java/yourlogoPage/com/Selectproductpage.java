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
	   private By selectWhite=By.cssSelector("#color_8");
	   private By addcart=By.xpath("//span[normalize-space()='Add to cart']");
	   private By checkout=By.xpath("//span[normalize-space()='Proceed to checkout']");
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
