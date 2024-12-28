package com.BeyoungPage;

import org.openqa.selenium.*;

public class productOptionSelectsPage
{
	private WebDriver driver;
	
	public productOptionSelectsPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//Locators
	private By sizeSelect=By.xpath("(//p[@class='sizevalue-main'])[1]");
	private By AddToCart=By.xpath("//a[text()='Add to Cart']");
	
	
	//Methods 
	public void SelectSize()
	{
		driver.findElement(sizeSelect).click();
		
	}
	public void Addtocartclick()
	{
		driver.findElement(AddToCart).click();
	}
	
}
