package innRoad.suite;

import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class Package extends BaseTest {
	
	static final ExtentReports extent = new ExtentReports("U:\\reports\\reports.html", true);
	
	JavascriptExecutor js;
	
	@Test(dataProvider = "testParameterData")
	  public void testUntitled(String URL,String TCN, String Client_Code, String User_Name, String Password, String Home_Page_Title, String Client_Name, String Property_Name,
			  String ValidationText, String PackageName, String PackageDisplay, String Package_Rate_Policy, String PackageDes, String Rack_Rate, String Category,
			  String Calculation_Method,String PackageRate, String Room_Name, String Season_Filter, String Select_Year) throws Exception {
		
		 setupBeforeSuite(TCN);
		 
		 ExtentTest test = extent.startTest(TCN, "Executing Options on Demo");
		 
		 
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
		 
		 
		/* ScriptEngineManager manager = new ScriptEngineManager();
		 ScriptEngine engine = manager.getEngineByName("JavaScript");
		 // read script file
		 engine.eval(Files.newBufferedReader(Paths.get("D:/test.js"), StandardCharsets.UTF_8));

		 Invocable inv = (Invocable) engine;
		 // call function from script file
		 inv.invokeFunction("alert", "");*/
		 
		
		 
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
		 
		 
		 try
		 {
		 d.findElement(OR.Package).click();
		 Wait.wait10Second();
		 new Select (d.findElement(OR.Rate_property)).selectByVisibleText(Property_Name);
		 Wait.wait5Second();
		//int Validation_Text=d.findElements(OR.validation_message).size()
		// System.out.println(Validation_Text);
		 
		 if(d.findElements(OR.validation_message).size()!=0)
		 {
			 d.findElement(OR.New_Package).click();
			 Wait.wait10Second();
			 d.findElement(OR.package_Name).sendKeys(PackageName);
			 if(d.findElement(OR.Packageradio).isDisplayed())
			 {
				 System.out.println("Selected");
			 }
			 else
			 {
				 d.findElement(OR.Packageradio).click();
				 Wait.wait2Second();
			 }
			 
			 d.findElement(OR.Package_Dsiplay_text).sendKeys(PackageDisplay);
			 d.findElement(OR.Package_Rate_policy).sendKeys(Package_Rate_Policy);
			 d.findElement(OR.Package_Description).sendKeys(PackageDes);
			 new Select (d.findElement(OR.select_Rate)).selectByVisibleText(Rack_Rate);
			 
			 if(d.findElement(OR.Select_Addon).isSelected())
			 {
				 System.out.println("Selected");
				 d.findElement(OR.Add_Compenents).click();
				 Wait.wait5Second();
				 try
				 {
				 new Select (d.findElement(OR.Select_Category)).selectByVisibleText(Category);
				 
				 }
				 catch(Exception e)
				 {
					 try
					 {
					 new Select (d.findElement(OR.Select_Category)).selectByVisibleText("Bar");
					 }
					 catch(Exception e2)
					 {
						 new Select (d.findElement(OR.Select_Category)).selectByVisibleText("cot");
					 }
				 }
				 Wait.wait5Second();
				 
				 new Select (d.findElement(OR.Calculation_Method)).selectByVisibleText(Calculation_Method);
				 d.findElement(OR.Calculation_amount).sendKeys(PackageRate);
				 
				 if(d.findElement(OR.always_Avaliable).isSelected())
				 {
					 d.findElement(OR.always_Avaliable).click();
					 d.findElement(OR.Associate_Rate).click();
					 Wait.wait5Second();
					 
					 d.switchTo().frame(d.findElement(By.tagName("iframe")));
						Wait.wait5Second();
						
						
						
						//d.switchTo().frame(0);
					 new Select (d.findElement(OR.Rate_property)).selectByVisibleText(Property_Name);
					 Wait.wait2Second();
					 new Select (d.findElement(OR.Room_Classes_filter)).selectByVisibleText(Room_Name);
					 Wait.wait2Second();
					 new Select (d.findElement(OR.Seasons_Filter)).selectByVisibleText(Season_Filter);
					 Wait.wait2Second();
					 new Select (d.findElement(OR.Rate_plan)).selectByVisibleText(Rack_Rate);
					 Wait.wait2Second();
					 new Select (d.findElement(OR.Rate_plan)).selectByVisibleText(Select_Year);
					 Wait.wait2Second();
					 d.findElement(OR.Go_button).click();
					 Wait.wait2Second();
					 d.findElement(OR.select_Rate_Package).click();
					 Wait.wait2Second();
					 d.findElement(OR.Select_button_package).click();
					 Wait.wait2Second();
					 d.switchTo().defaultContent();
					    Wait.wait2Second();
					    d.switchTo().frame("main");
					    Wait.wait2Second();
					    d.findElement(OR.Done_Rate_Package).click();
					    Wait.wait10Second();
				 }
			 }
			 
			 
			 else
			 {
				 d.findElement(OR.Select_Addon).click();
				 Wait.wait5Second();
				 d.findElement(OR.Add_Compenents).click();
				 Wait.wait5Second();
				 try
				 {
				 new Select (d.findElement(OR.Select_Category)).selectByVisibleText(Category);
				 
				 }
				 catch(Exception e)
				 {
					 try
					 {
					 new Select (d.findElement(OR.Select_Category)).selectByVisibleText("Bar");
					 }
					 catch(Exception e2)
					 {
						 new Select (d.findElement(OR.Select_Category)).selectByVisibleText("cot");
					 }
				 }
				 Wait.wait5Second();
			 }
			 new Select (d.findElement(OR.Calculation_Method)).selectByVisibleText(Calculation_Method);
			 d.findElement(OR.Calculation_amount).sendKeys(PackageRate);
			 
			 if(d.findElement(OR.always_Avaliable).isSelected())
			 {
				 d.findElement(OR.always_Avaliable).click();
				 d.findElement(OR.Associate_Rate).click();
				 Wait.wait5Second();
				 
				 d.switchTo().frame(d.findElement(By.tagName("iframe")));
					Wait.wait5Second();
					
					 /*WebElement element = d.findElement(By.id("NSF_Rates"));
					 js.executeScript("arguments[0].style.width=95%", element);*/
					
					//js.executeScript("document.getElementById('NSF_Rates').setAttribute('width', '95%')");
					

          
					
					
					//d.switchTo().frame(0);
				 new Select (d.findElement(OR.Rate_property)).selectByVisibleText(Property_Name);
				 Wait.wait2Second();
				 new Select (d.findElement(OR.Room_Classes_filter)).selectByVisibleText(Room_Name);
				 Wait.wait2Second();
				 new Select (d.findElement(OR.Seasons_Filter)).selectByVisibleText(Season_Filter);
				 Wait.wait2Second();
				 new Select (d.findElement(OR.Rate_plan)).selectByVisibleText(Rack_Rate);
				 Wait.wait2Second();
				 new Select (d.findElement(OR.Select_Year)).selectByVisibleText(Select_Year);
				 Wait.wait2Second();
				 d.findElement(OR.Go_button).click();
				 Wait.wait2Second();
				 Wait.wait2Second();
				 d.findElement(OR.select_Rate_Package).click();
				 Wait.wait2Second();
				 
				 ((JavascriptExecutor)d).executeScript("document.getElementById('btnSelect').click()");
					
				 d.switchTo().defaultContent();
				    Wait.wait2Second();
				    d.switchTo().frame("main");
				    Wait.wait2Second();
				    d.findElement(OR.Done_Rate_Package).click();
				    Wait.wait10Second();
				 
			 }
			 
		 }
		 else
		 {
			 
			 List<WebElement> Get_Package_Count = d.findElements(OR.Get_Num_Packges);
			 System.out.println("Get_Package_Count: "+Get_Package_Count.size());
			
			 for(int i=0; i<Get_Package_Count.size();i++)
			 {
				 System.out.println(i);
				 d.findElement(By.id("dgPackageList_chkPackageSelected_"+i+"")).click();
				 Wait.wait2Second();
			 }
			 
			 d.findElement(OR.Delete_Packages).click();
			 Wait.wait5Second();
			 
			 
			 d.findElement(OR.New_Package).click();
			 Wait.wait10Second();
			 d.findElement(OR.package_Name).sendKeys(PackageName);
			 if(d.findElement(OR.Packageradio).isDisplayed())
			 {
				 System.out.println("Selected");
			 }
			 else
			 {
				 d.findElement(OR.Packageradio).click();
				 Wait.wait2Second();
			 }
			 
			 d.findElement(OR.Package_Dsiplay_text).sendKeys(PackageDisplay);
			 d.findElement(OR.Package_Rate_policy).sendKeys(Package_Rate_Policy);
			 d.findElement(OR.Package_Description).sendKeys(PackageDes);
			 new Select (d.findElement(OR.select_Rate)).selectByVisibleText(Rack_Rate);
			 
			 if(d.findElement(OR.Select_Addon).isSelected())
			 {
				 System.out.println("Selected");
				 d.findElement(OR.Add_Compenents).click();
				 Wait.wait5Second();
				 try
				 {
				 new Select (d.findElement(OR.Select_Category)).selectByVisibleText(Category);
				 
				 }
				 catch(Exception e)
				 {
					 try
					 {
					 new Select (d.findElement(OR.Select_Category)).selectByVisibleText("Bar");
					 }
					 catch(Exception e2)
					 {
						 new Select (d.findElement(OR.Select_Category)).selectByVisibleText("cot");
					 }
				 }
				 Wait.wait5Second();
				 
				 new Select (d.findElement(OR.Calculation_Method)).selectByVisibleText(Calculation_Method);
				 d.findElement(OR.Calculation_amount).sendKeys(PackageRate);
				 
				 if(d.findElement(OR.always_Avaliable).isSelected())
				 {
					 d.findElement(OR.always_Avaliable).click();
					 d.findElement(OR.Associate_Rate).click();
					 Wait.wait5Second();
					 
					 d.switchTo().frame(d.findElement(By.tagName("iframe")));
						Wait.wait5Second();
						
						
					 new Select (d.findElement(OR.Rate_property)).selectByVisibleText(Property_Name);
					 Wait.wait2Second();
					 new Select (d.findElement(OR.Room_Classes_filter)).selectByVisibleText(Room_Name);
					 Wait.wait2Second();
					 new Select (d.findElement(OR.Seasons_Filter)).selectByVisibleText(Season_Filter);
					 Wait.wait2Second();
					 new Select (d.findElement(OR.Rate_plan)).selectByVisibleText(Rack_Rate);
					 Wait.wait2Second();
					 new Select (d.findElement(OR.Select_Year)).selectByVisibleText(Select_Year);
					 d.findElement(OR.Go_button).click();
					 Wait.wait2Second();
					 Wait.wait2Second();
					 ((JavascriptExecutor)d).executeScript("document.getElementById('btnSelect').click()");
					 Wait.wait5Second();
					 d.switchTo().defaultContent();
					    Wait.wait2Second();
					    d.switchTo().frame("main");
					    Wait.wait2Second();
					    d.findElement(OR.Done_Rate_Package).click();
					    Wait.wait10Second();
					 
				 }
			 }
			 
			 
			 else
			 {
				 d.findElement(OR.Select_Addon).click();
				 Wait.wait5Second();
				 d.findElement(OR.Add_Compenents).click();
				 Wait.wait5Second();
				 try
				 {
				 new Select (d.findElement(OR.Select_Category)).selectByVisibleText(Category);
				 
				 }
				 catch(Exception e)
				 {
					 try
					 {
					 new Select (d.findElement(OR.Select_Category)).selectByVisibleText("Bar");
					 }
					 catch(Exception e2)
					 {
						 new Select (d.findElement(OR.Select_Category)).selectByVisibleText("cot");
					 }
				 }
				 Wait.wait5Second();
			 }
			 new Select (d.findElement(OR.Calculation_Method)).selectByVisibleText(Calculation_Method);
			 d.findElement(OR.Calculation_amount).sendKeys(PackageRate);
			 
			 if(d.findElement(OR.always_Avaliable).isSelected())
			 {
				 d.findElement(OR.always_Avaliable).click();
				 d.findElement(OR.Associate_Rate).click();
				 Wait.wait5Second();
				 
				 d.switchTo().frame(d.findElement(By.tagName("iframe")));
					Wait.wait5Second();
					
					
					
					//d.switchTo().frame(0);
				 new Select (d.findElement(OR.Rate_property)).selectByVisibleText(Property_Name);
				 Wait.wait2Second();
				 new Select (d.findElement(OR.Room_Classes_filter)).selectByVisibleText(Room_Name);
				 Wait.wait2Second();
				 new Select (d.findElement(OR.Seasons_Filter)).selectByVisibleText(Season_Filter);
				 Wait.wait2Second();
				 new Select (d.findElement(OR.Select_Year)).selectByVisibleText(Select_Year);
				 Wait.wait2Second();
				 d.findElement(OR.Go_button).click();
				 Wait.wait5Second();
				 
				 Wait.wait2Second();
				 d.findElement(OR.select_Rate_Package).click();
				 Wait.wait2Second();
				 
				 ((JavascriptExecutor)d).executeScript("document.getElementById('btnSelect').click()");
				 Wait.wait5Second();
				 d.switchTo().defaultContent();
				    Wait.wait2Second();
				    d.switchTo().frame("main");
				    Wait.wait2Second();
				    d.findElement(OR.Done_Rate_Package).click();
				    Wait.wait10Second();
				 
				 
			 }
			 
		 }
		 
		 testresultdata.put("8", new Object[] { 6d,
	              "TC7 - verify by entering all details and click on save button",
	              "System should allow user to enter all details and should aslo save", "Pass" });
		test.log(LogStatus.PASS, "System Successfully entered all required detailsa and clicked on save");}
		  
		  catch (Throwable t) {
     testresultdata.put("8", new Object[] { 6d,
		      "TC7 - verify by entering all details and click on save button",
		      "System failed to enter details", "Fail" });
     test.log(LogStatus.FAIL, "System failed to enter all required details");
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
		Object data[][] = TestUtil.getData(datatable_suite1, "Package");
		return data;
	}

}
