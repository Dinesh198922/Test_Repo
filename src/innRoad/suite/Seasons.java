package innRoad.suite;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
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

public class Seasons extends BaseTest{
	
	static final ExtentReports extent = new ExtentReports("U:\\reports\\reports.html", true);
	
	 @Test(dataProvider = "testParameterData")
	  public void testUntitled( String URL, String TCNAME, String Client_Code, String User_Name, String Password, String Home_Page_Title, String Client_Name, String Property_Name, String Season_Name,
			  String Start_Date, String End_Date, String ClientType
			  
			  ) throws Exception {
		 
		 setupBeforeSuite(TCNAME);
		 
		 ExtentTest test = extent.startTest(TCNAME, "Creating Seasons on Demo");
		 
		 //login to the inncenter
		 try
		 {
		 filllogin2(URL,Client_Code,User_Name,Password);
		 testresultdata.put("2", new Object[] { 1d,
		
	              "TC1 - Verify site loaded or not ",
	              "System sucessfully navigate to the Site", "Pass" });
		 test.log(LogStatus.PASS, "User Successfully logged in to the application");
		 }
		  
		  catch (Throwable t) {
             testresultdata.put("2", new Object[] { 1d,
		      "TC1 - Verify site loaded or not",
		      "System Failed to navigate to the site", "Fail" });
             test.log(LogStatus.FAIL, "User Failed to login to the application");
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
		 test.log(LogStatus.PASS, "User Successfully verified Title page");
		 }
		  
		  catch (Throwable t) {
            testresultdata.put("3", new Object[] { 2d,
		      "TC2 - Verify page title",
		      "System failed to verify page title", "Fail" });
            test.log(LogStatus.FAIL, "User failed to verify title page");
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
		 test.log(LogStatus.PASS, "User Successfully clicked on Search icon in Search panel");
		 }
		  
		  catch (Throwable t) {
           testresultdata.put("4", new Object[] { 3d,
		      "TC3 - Verify by clicking on search shortcut icon",
		      "System failed click serach icon", "Fail" });
           
           test.log(LogStatus.FAIL, "User failed to clicked on Search icon in Search panel");
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
			 test.log(LogStatus.PASS, "User Successfully entered and selected client");
			}
			  
			  catch (Throwable t) {
	           testresultdata.put("5", new Object[] { 4d,
			      "TC4 - Verify page title",
			      "System failed to verify page title", "Fail" });
	           
	           test.log(LogStatus.FAIL, "User fail to enter and select client");
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
		
		test.log(LogStatus.PASS, "User Successfully clicked on Inventory tab");
		}
		  
		  catch (Throwable t) {
        testresultdata.put("6", new Object[] { 5d,
		      "TC5 - Click Set up link",
		      "System failed to navigate to the set up page", "Fail" });
        
        test.log(LogStatus.FAIL, "User failed to click on Inventory tab");
     }
		
		
		
		//Click on Seasons
		
				try
				{
					 d.switchTo().defaultContent();
					    Wait.wait2Second();
					    d.switchTo().frame("main");
					    Wait.wait2Second();
					d.findElement(OR.Seasons).click();
					Wait.wait5Second();
				testresultdata.put("7", new Object[] { 6d,
			              "TC6 - Click Set up link",
			              "System should navigate to the set up page", "Pass" }); 
				test.log(LogStatus.PASS, "User Successfully clicked Seasons link");
				}
				  
				  catch (Throwable t) {
		      testresultdata.put("7", new Object[] { 6d,
				      "TC6 - Click Set up link",
				      "System failed to navigate to the set up page", "Fail" });
		      test.log(LogStatus.FAIL, "User failed to click on Season link");
		   }
				
			
				//Click on New Seasons
			//	try
				//{
					
					if(ClientType=="NG")
					{
				d.switchTo().defaultContent();
			    Wait.wait2Second();
			    d.switchTo().frame("nxtgen");
			    Wait.wait2Second();
			    new Select (d.findElement(OR.Select_Seasons_Property)).selectByVisibleText(Property_Name);
				Wait.wait2Second();
				d.findElement(OR.New_Seasons).click();
				Wait.wait2Second();
					}
					else
					{
						new Select (d.findElement(OR.EG_Select_Seasons_Property)).selectByVisibleText(Property_Name);
						Wait.wait2Second();
						d.findElement(OR.EG_New_Seasons).click();
						Wait.wait2Second();
					
					}
					
						
				/*testresultdata.put("8", new Object[] { 7d,
			              "TC7 - Select property and Click on New Seasons button",
			              "System should select property and should click on new Seasons", "Pass" }); 
				test.log(LogStatus.PASS, "User Successfully selected property and clicked on New Seasons button");
				}
				  
				  catch (Throwable t) {
		      testresultdata.put("8", new Object[] { 7d,
				      "TC7 - Select property and click on new Seasons button",
				      "System failed to select property and failed to click on new seasons button", "Fail" });
		      
		      test.log(LogStatus.FAIL, "User Successfully failed to select property and fail to click on New Seasons button");
		   }*/
				
				try
				{
					if(ClientType=="NG")
					{
				d.findElement(OR.Season_Name).sendKeys(Season_Name);
				d.findElement(OR.Season_start_Date).sendKeys(Start_Date);
				Wait.wait2Second();
				d.findElement(OR.Season_End_Date).sendKeys(End_Date);
				Wait.wait2Second();
				d.findElement(OR.Season_Save).click();
				Wait.wait3Second();
					}
					else
					{
						d.findElement(OR.EG_Season_Name).sendKeys(Season_Name);
						d.findElement(OR.EG_start_Picker).click();
						Wait.wait2Second();
						d.findElement(OR.EG_Season_start_Date).click();
						Wait.wait2Second();
						d.findElement(OR.EG_End_picker).click();
						Wait.wait2Second();
						d.findElement(OR.EG_Season_End_Date).sendKeys(End_Date);
						Wait.wait2Second();
						d.findElement(OR.EG_Season_Save).click();
						Wait.wait3Second();
					}
				testresultdata.put("9", new Object[] { 8d,
			              "TC8 - Enter all mandatory fields and click on save button",
			              "System should create seasons", "Pass" }); 
				
				test.log(LogStatus.PASS, "User Successfully entered Season_Name, Start_Date, End_Date and click on Save button");
				}
				  
				  catch (Throwable t) {
		      testresultdata.put("9", new Object[] { 8d,
				      "TC8 - Enter all mandatory fields and click on save button",
				      "System failed to create season", "Fail" });
		      test.log(LogStatus.FAIL, "User fail to entered Season_Name, Start_Date, End_Date and click on Save button");
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
			Object data[][] = TestUtil.getData(datatable_suite1, "Seasons");
			return data;
		}

	

}
