package com.BeyoungPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class youngPageTest 
{ 
	private WebDriver driver;
	
	public youngPageTest (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Locators=private the locators
	
	private By topwear=By.xpath("(//p[text()='Topwear'])[1]");
	private By selectalloptions=By.xpath("//ul//li[1]");
	private By selectOption=By.xpath("//a[normalize-space()='Full Sleeves']");
	
	
	
	
	
	//Methds
	public void Testtopwear()
	{
		driver.findElement(topwear).click();

	}
	public void Testlist_of_application()
	{
		List <WebElement>li=driver.findElements(selectalloptions);
		System.out.println("********************allOptions Are********");
		for(WebElement i:li)
		{
			
			
			System.out.println(i.getText());
		}
	}
	public void selectTheProduct()
	{
		
		driver.findElement(selectOption).click();
	}
	
	

	
	
}
