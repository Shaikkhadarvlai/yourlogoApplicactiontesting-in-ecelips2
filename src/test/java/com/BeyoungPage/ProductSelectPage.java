package com.BeyoungPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSelectPage 

{
	private WebDriver driver;
	public ProductSelectPage (WebDriver driver)
	{
		this.driver=driver;}



	//Locators
	private  By selectpro=By.xpath("//div//h2[normalize-space()='Plain Burgundy Women Full Sleeves T-shirt']");

	
	public void selecttheproduct()
	{
		driver.findElement(selectpro).click();
	}
	
}
