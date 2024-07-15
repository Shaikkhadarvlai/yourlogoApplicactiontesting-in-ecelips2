package yourlogoPage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchItemPage 
{
   private WebDriver driver;
   
   public SearchItemPage (WebDriver driver)
   {
	   this.driver=driver;
   }
   
   //Locators
   private By serchbox=By.xpath("//input[@id='search_query_top']");
   private By selectitem=By.xpath("(//img[@class='replace-2x img-responsive'])[4]");
   
   
   
   //Method
   
   public void sebdsearchbox()
   {
	   driver.findElement(serchbox).sendKeys("T-shirt",Keys.ENTER);
   }
   public void SelectTheItem()
   {
	   driver.findElement(selectitem).click();
	  
   }
   
   
   
}
