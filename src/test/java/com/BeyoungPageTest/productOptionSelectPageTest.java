package com.BeyoungPageTest;

import org.testng.annotations.*;

public class productOptionSelectPageTest extends BaseClass
{
	@Test(priority=1)
	public void SelctOptionsSize() throws InterruptedException
	{
//		yp.Testtopwear();
//		Thread.sleep(2000);
//		yp.Testlist_of_application();
//		Thread.sleep(2000);
//		yp.selectTheProduct();
//         Thread.sleep(2000);
//		pp.selecttheproduct();
//		
		try {
			
		} catch (Exception e) {
			prop.SelectSize();
		}
		
	}

	@Test(priority=2)
	public void SelectAddcart()
	{
		prop.Addtocartclick();
	}
	
}
