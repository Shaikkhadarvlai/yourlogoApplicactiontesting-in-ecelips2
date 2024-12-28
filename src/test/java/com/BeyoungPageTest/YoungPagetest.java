package com.BeyoungPageTest;

import org.testng.annotations.*;

public class YoungPagetest extends BaseClass

{
	@Test(priority=1)
	public void TestTop() 
	{
		yp.Testtopwear();
	}

	@Test(priority=2)
	public void Tesalloptions()
	{
		yp.Testlist_of_application();
	}
	
	@Test(priority=3)
	public void SelectTheProduct() 
	{
		yp.selectTheProduct();

	}

}
