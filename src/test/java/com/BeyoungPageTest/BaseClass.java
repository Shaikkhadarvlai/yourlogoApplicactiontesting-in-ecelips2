package com.BeyoungPageTest;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.BeyoungPage.ProductSelectPage;
import com.BeyoungPage.productOptionSelectsPage;
import com.BeyoungPage.youngPageTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import yourlogoutility.helping;




public class BaseClass 
{
	
	public WebDriver driver;
	public youngPageTest yp;
	public ProductSelectPage pp;
	public productOptionSelectsPage prop;
	
	//extend report and test report
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	
	
   @BeforeSuite
	public void ExtendsReports()
	{
	 //create ExtentReport instance
		  extent = new ExtentReports();
		  
		  //Using reporter we can add path
		spark = new ExtentSparkReporter("Reports/Guru99register.html");
		  
		  //setup any configuration
		  spark.config().setDocumentTitle("Sprint1 report");
		  spark.config().setReportName("Guru99registerAutomation Report");
		  spark.config().setTheme(Theme.DARK);
		  
		  
		  //attached the report
	  extent.attachReporter(spark);
		  
		  
		  //Create a test-ExtentTest
		  test=extent.createTest("Guru99register End Report");
		  
	}
	
	@BeforeTest
	public void SetUpTestPages()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.beyoung.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		yp=new youngPageTest (driver);
		pp=new ProductSelectPage(driver);
		prop=new productOptionSelectsPage(driver);
	}
	@BeforeClass
	public void SetUpBrowser()
	{
		System.out.println("***********The Home Page under select the option ToperWear *******");
		Reporter.log("The home page is open",true);
		
		yp.Testtopwear();
		addWait();
		yp.Testlist_of_application();
		addWait();
	    yp.selectTheProduct();
	   
		test.pass("The option is selected!");
		
		
		System.out.println("**********TopWear under select the Full-sleeve  successfull*****");
		
		Reporter.log("The product is selected!",true);
		addWait();
		pp.selecttheproduct();
		test.pass("The product is selected is successfull");
		
		System.out.println("**********Select the product successfull**********");
		
		Reporter.log("The product basid is selcet",true);
		addWait();
		prop.SelectSize();
		test.pass("the product All options is selected");
		
	}
	
	
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterSuite
	public void exiteReport()
	{
		
	}
	
}
