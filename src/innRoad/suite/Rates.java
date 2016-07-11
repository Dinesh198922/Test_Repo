package innRoad.suite;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import innRoad.config.BaseTest;
import innRoad.config.TestUtil;
import innRoad.config.Wait;
import innRoad.properties.OR;

public class Rates extends BaseTest {
	
	static final ExtentReports extent = new ExtentReports("U:\\reports\\reports.html", false);
	
	@Test(dataProvider = "testParameterData")
	  public void testUntitled(String URL,String TCN, String Client_Code, String User_Name, String Password, String Home_Page_Title, String Client_Name, String Property_Name, String RateName,
			  String Max_Adult, String Max_Persons, String Base_Amount, String Additional_Adult, String Additional_Persons, String Rate_Display_Name, String Rate_Policy_Name, String Rate_Description_Name,
			  
			 String PromotionYesON, String Promo_code_Text, String Seasons, String Select_Room_class, String Booking_Engine_Source, String Booking_Engine_Source2, String Mobile_BE_Source, String Mobile_BE_Source2
			  
			  ) throws Exception {
		
		 setupBeforeSuite(TCN);
		 
		  ExtentTest test = extent.startTest(TCN, "Executing Rates on Demo");
		 
		 //login to the inncenter
		 try
		 {
		 filllogin2(URL,Client_Code,User_Name,Password);
		 testresultdata.put("2", new Object[] { 1d,
	              "TC1 - Verify site loaded or not ",
	              "System sucessfully navigate to the Site", "Pass" });
		 test.log(LogStatus.PASS, "System successfully logged in the site");}
		  
		  catch (Throwable t) {
            testresultdata.put("2", new Object[] { 1d,
		      "TC1 - Verify site loaded or not",
		      "System Failed to navigate to the site", "Fail" });
            
            test.log(LogStatus.FAIL, "System fail to logged in the site");
         }
		 
		 //Verify home page
		 
		 try
		 {
		 String Get_Home_Page_Title=d.getTitle();
		 Wait.wait15Second();
		if(Get_Home_Page_Title.endsWith(Home_Page_Title))
		{
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Fail to verify title");
		}
		 testresultdata.put("3", new Object[] { 2d,
	              "TC2 - Verify Page title",
	              "System sucessfully verified page title", "Pass" });
		 test.log(LogStatus.PASS, "System successfully verified page title");}
		  
		  catch (Throwable t) {
           testresultdata.put("3", new Object[] { 2d,
		      "TC2 - Verify page title",
		      "System failed to verify page title", "Fail" });
           test.log(LogStatus.FAIL, "System successfully verified page title");
        }
		 
		 
		 
		 
		//Select client from client dropdown
	try
		 { 
		 d.switchTo().frame(0);
		 Wait.wait2Second();
		 d.findElement(OR.Search_Icon).click();
		 Wait.wait10Second();
		 
		 testresultdata.put("4", new Object[] { 3d,
	              "TC3 - Verify by clicking on Search shortcut icon",
	              "System sucessfully clicked search icon", "Pass" });
		 test.log(LogStatus.PASS, "System successfully clicked on Search icon");}
		  
		  catch (Throwable t) {
          testresultdata.put("4", new Object[] { 3d,
		      "TC3 - Verify by clicking on search shortcut icon",
		      "System failed click serach icon", "Fail" });
          test.log(LogStatus.FAIL, "System failed to clicked on Search icon");
       }
		
		
		//Selecting client from client dropdown 
		try
		{
		 d.switchTo().defaultContent();
		 Wait.wait2Second();
		 d.switchTo().frame("main");
		 Wait.wait2Second();
		 d.findElement(By.xpath("//b")).click();
		 Wait.wait5Second();
		 d.findElement(By.id("s2id_autogen1_search")).click();
		 d.findElement(By.id("s2id_autogen1_search")).sendKeys(Client_Name);
		// d.findElement(By.id("s2id_autogen1_search")).sendKeys(Client_Name);
		 d.findElement(By.id("s2id_autogen1_search")).sendKeys(Keys.ENTER);
		 Wait.wait10Second();
		
			testresultdata.put("5", new Object[] { 4d,
		              "TC4 - Verify Page title",
		              "System sucessfully verified page title", "Pass" });
			 test.log(LogStatus.PASS, "System successfully selected client from dropdown");}
			  
			  catch (Throwable t) {
	           testresultdata.put("5", new Object[] { 4d,
			      "TC4 - Verify page title",
			      "System failed to verify page title", "Fail" });
	           test.log(LogStatus.FAIL, "System fail to selected client from dropdown");
	        }
		
		
		
		 //Verify by clicking on Inventory
		try
		{
			d.switchTo().defaultContent();
			Wait.wait2Second();	
			d.switchTo().frame(0);
		 Wait.wait2Second();
		d.findElement(OR.Inventory).click();
		Wait.wait5Second();
		testresultdata.put("6", new Object[] { 5d,
	              "TC5 - Click Set up link",
	              "System should navigate to the set up page", "Pass" });
		test.log(LogStatus.PASS, "System Successfully clicked on Inventory tab");}
		  
		  catch (Throwable t) {
        testresultdata.put("6", new Object[] { 5d,
		      "TC5 - Click Set up link",
		      "System failed to navigate to the set up page", "Fail" });
        test.log(LogStatus.FAIL, "System failed to click on Inventory tab");
     }
		
		
		
		//Click on Rates
		
		try
		{
			 d.switchTo().defaultContent();
			    Wait.wait2Second();
			    d.switchTo().frame("main");
			    Wait.wait2Second();
			d.findElement(OR.Rates).click();
			Wait.wait5Second();
		testresultdata.put("7", new Object[] { 6d,
	              "TC6 - Click Set up link",
	              "System should navigate to the set up page", "Pass" }); 
		test.log(LogStatus.PASS, "System Successfully clicked on Rates");}
		  
		  catch (Throwable t) {
      testresultdata.put("7", new Object[] { 6d,
		      "TC6 - Click Set up link",
		      "System failed to navigate to the set up page", "Fail" });
      test.log(LogStatus.FAIL, "System failed to clicked on Rates");
   }
		
		
		//Click on New Rates
		
		try
		{
		  d.findElement(OR.Click_New_Rate).click();
		  Wait.wait2Second();
		  testresultdata.put("8", new Object[] { 7d,
	              "TC7 - Click Set up link",
	              "System should navigate to the set up page", "Pass" });
		  test.log(LogStatus.PASS, "System Successfully clicked on New Rates button");}
		  
		  catch (Throwable t) {
      testresultdata.put("8", new Object[] { 7d,
		      "TC7 - Click Set up link",
		      "System failed to navigate to the set up page", "Fail" });
      test.log(LogStatus.FAIL, "System Successfully clicked on New Rates button");
       }
		
		
		//Enter Rate Details
	
	  try
		{
			d.findElement(OR.Rate_Name).sendKeys(RateName);
			d.findElement(OR.Max_Adult).sendKeys(Max_Adult);
			d.findElement(OR.Max_Person).sendKeys(Max_Persons);
			d.findElement(OR.Base_Amount).sendKeys(Base_Amount);
			d.findElement(OR.Additional_Adult).sendKeys(Additional_Adult);
			d.findElement(OR.Additional_Persons).sendKeys(Additional_Persons);
			d.findElement(OR.Rate_Display_Name).sendKeys(Rate_Display_Name);
			d.findElement(OR.Rate_Policy_Name).sendKeys(Rate_Policy_Name);
			d.findElement(OR.Rate_Description).sendKeys(Rate_Description_Name);
			if(PromotionYesON.equals("Yes"))
			{
			d.findElement(OR.select_Conditional_Rate).click();
			Wait.wait2Second();
			d.findElement(OR.Text_Promo_code).sendKeys(Promo_code_Text);
			Wait.wait2Second();
			//d.findElement(OR.Rate_Floor).click();
			Wait.wait2Second();
			if(d.findElement(OR.Interval_Rate).isEnabled())
			{
			d.findElement(OR.Interval_Rate).sendKeys("3");
			}
			Wait.wait2Second();
			}
			else
			{
				System.out.println("Skipped");
			}
			//Associate Seasons
			
			d.findElement(OR.Associate_Seasons).click();
			Wait.wait5Second();
			//By executing a java script
			JavascriptExecutor exe = (JavascriptExecutor) d;
			Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			System.out.println("Number of iframes on the page are " + numberOfFrames);
	 
			//By finding all the web elements using iframe tag
			List<WebElement> iframeElements = d.findElements(By.tagName("iframe"));
			System.out.println("The total number of iframes are " + iframeElements.size());
			int size = d.findElements(By.tagName("iframe")).size();
			System.out.println(size);
			
			d.switchTo().frame(d.findElement(By.tagName("iframe")));
			Wait.wait5Second();
			
			d.switchTo().frame(0);
				
			String Get_all_seasons =d.findElement(OR.Get_Seasons).getText();
			System.out.println("Get_all_seasons "+ Get_all_seasons);
				
			List<WebElement> all_Seasons_size = d.findElements(OR.Get_Seasons);
			System.out.println("all_Seasons_size "+ all_Seasons_size.size());
			Wait.wait2Second();
			
			for(int i=0;i<all_Seasons_size.size();i++)
			{
				
				if(all_Seasons_size.get(i).getText().equals(Seasons))
				{
					int var=i+1;
					d.findElement(By.xpath("//select[@id='lstSeasons']/option["+var+"]")).click();
					Wait.wait2Second();
					d.findElement(OR.Pick_one).click();
					Wait.wait2Second();
					d.findElement(OR.Done).click();
					Wait.wait2Second();
					break;
				}
				
			}
			
			 d.switchTo().defaultContent();
			 Wait.wait2Second();
			 d.switchTo().frame("main");
			 Wait.wait2Second();
			    d.findElement(OR.Room_Class_Rates).click();
			    Wait.wait2Second();

				d.switchTo().frame(d.findElement(By.tagName("iframe")));
				Wait.wait5Second();
				
				d.switchTo().frame(0);
				
				String Get_all_list_rooms =d.findElement(OR.Get_list_rooms).getText();
				System.out.println("Get_all_list_rooms "+ Get_all_list_rooms);
				
				String[] Split_Rooms = Get_all_list_rooms.split("\n");
				
				List<WebElement> Get_all_Classes_Size = d.findElements(OR.Get_list_rooms);
				System.out.println("Get_all_Classes_Size "+ Split_Rooms.length);
				Wait.wait2Second();
				

				for(int i=0;i<Split_Rooms.length;i++)
				{
					
					if(Split_Rooms[i].equals(Select_Room_class))
					{
						int var=i+1;
						d.findElement(By.xpath("//select[@id='lstRooms']/option["+var+"]")).click();
						Wait.wait2Second();
						d.findElement(OR.Pick_one).click();
						Wait.wait2Second();
						d.findElement(OR.Done).click();
						Wait.wait2Second();
						break;
					}
					
				}
				
				
				 d.switchTo().defaultContent();
				 Wait.wait2Second();
				 d.switchTo().frame("main");
				 Wait.wait2Second();
				 d.findElement(OR.Get_Source_list).click();
				 Wait.wait2Second();
				 
				 d.switchTo().frame(d.findElement(By.tagName("iframe")));
					Wait.wait5Second();
					
					d.switchTo().frame(0);
					
					selectingSource(Booking_Engine_Source,Booking_Engine_Source2);
					//selectingSource(Mobile_BE_Source,Mobile_BE_Source2);
					//d.findElement(OR.Done).click();
					Wait.wait10Second();
					
					 d.switchTo().defaultContent();
					 Wait.wait2Second();
					 d.switchTo().frame("main");
					 Wait.wait2Second();
					 d.findElement(OR.Get_Source_list).click();
					 Wait.wait2Second();
					 
					 d.switchTo().frame(d.findElement(By.tagName("iframe")));
						Wait.wait5Second();
						
						d.switchTo().frame(0);
						selectingSource(Mobile_BE_Source,Mobile_BE_Source2);
						//d.findElement(OR.Done).click();
						
					
					
					d.switchTo().defaultContent();
					 Wait.wait2Second();
					 d.switchTo().frame("main");
					 Wait.wait2Second();
					d.findElement(OR.Done_Rooms).click();
					Wait.wait2Second();
					Wait.wait10Second();
					
					
					//String[] Split_Rooms = Get_all_list_rooms.split("\n");
					
					
				 
			
			 testresultdata.put("9", new Object[] { 8d,
		              "TC7 - Fill Rate information and clicking on save",
		              "System should save all the details", "Pass" });
			 test.log(LogStatus.PASS, "System Successfully entered Rate information and clicked on Save");}
			  
			  catch (Throwable t) {
	      testresultdata.put("9", new Object[] { 8d,
			      "TC7 - Fill Rate information and clicking on save",
			      "System failed to save details", "Fail" });
	      test.log(LogStatus.FAIL, "System fail to enter Rate information and click on Save");
	       }	
				

			
			
			
					  extent.endTest(test);
		
	}
	
	
	@AfterClass
	public void stop() {
		  extent.flush();
		setupAfterSuite();
		stopDriver();
	}

	@DataProvider(name = "testParameterData", parallel = false)
	public static Object[][] testParameterData(Method method) throws Exception {

		initialize();
		Object data[][] = TestUtil.getData(datatable_suite1, "Rates");
		return data;
	}

}
