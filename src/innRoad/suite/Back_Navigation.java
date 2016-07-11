package innRoad.suite;


import innRoad.config.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Back_Navigation {
	
public WebDriver driver;
	
	@BeforeMethod
	
	public void beforeMethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
       driver = new ChromeDriver();
		//System.setProperty("webdriver.safari.driver","U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\SafariDriver.safariextz");
		//driver= new SafariDriver();
		//driver= new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://dev.icn.inrd.io/login.html");
        driver.findElement(By.id("txtclientCode")).click();
        driver.findElement(By.id("txtclientCode")).clear();
        driver.findElement(By.id("txtclientCode")).sendKeys("itng");
        driver.findElement(By.id("txtLoginID")).click();
        driver.findElement(By.id("txtLoginID")).clear();
        driver.findElement(By.id("txtLoginID")).sendKeys("raghuram");
        driver.findElement(By.id("txtUserPassword")).click();
        driver.findElement(By.id("txtUserPassword")).clear();
        driver.findElement(By.id("txtUserPassword")).sendKeys("Test@1234");
        driver.findElement(By.id("btnLogon")).click();
        Wait.wait10Second();
       driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver,120);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='bpjscontainer_20']/div/div[1]/table/thead/tr/th[1]/div")));
       
	}
	
@Test
	
	public void oneLevelReservation() throws InterruptedException
	{
	
	System.out.println("***************** Reservation Level one Starts ***********************");
	//Navigation from Reservation to Groups
	try
	{
		driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
		waitForElement("//*[@id='StayInfo']/div/div/div[2]/div[1]/div[4]/div");
	}
	catch(Exception e)
	{
		System.out.println("FAIL: System unable to New Reservation page");
	}
	try
	{
	 driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Tape Chart']")).click();
	 waitForElement("//*[@id='bpjscontainer_17']/div");
	}
	catch (Exception e)
	{
		System.out.println("FAIL: System unable to load Tape Chart page");
	}
	
	try
	{
	 driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='New Quote']")).click();
	 waitForElement("//input[@placeholder='Adults']");
	}
	catch (Exception e)
	{
		System.out.println("FAIL: System unable to load New Quote page");
	}
	
	try
	{
	 driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Guest History']")).click();
	 waitForElementbycss("li.guest-history.open > a > span.sn_span3");
	}
	catch (Exception e)
	{
		System.out.println("FAIL: System unable to load Guest History page");
	}
	
	try
	{
	 driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Groups']")).click();
	 waitForElement("//*[@id='MainContent_btnNew']");
	}
	catch (Exception e)
	{
		System.out.println("FAIL: System unable to load Groups page");
	}
	
	
	//Back navigation from groups to till reservation page
	
	
	//1. Groups to Guest History
	
	try
	{
	
		driver.navigate().back();
		Wait.wait10Second();
		if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/index.html#guestHistory"));
		try
		{
		waitForElementbycss("li.guest-history.open > a > span.sn_span3");	
		if(driver.findElement(By.cssSelector("li.guest-history.open > a > span.sn_span3")).isDisplayed())
    	{
    		System.out.println("PASS: System Successfully navigated and loaded Guest history page from Groups");
    	}
    	}
    	catch (Exception e)
    	{
    		System.out.println("FAIL: Unable to load page, URL navigated fine from Groups to Guest history");
    	}
	   }

     catch (Exception e)
    {
	System.out.println("FAIL: Unable to Navigate to the Guest history page from Groups");
    }
	
	// 2. Guest History to New Quote
	
	
	 try
     {
		 driver.navigate().back();
		 Wait.wait10Second();
     	if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/index.html#rateQuote"));
     	
     	try
     	{
     	waitForElement("//input[@placeholder='Adults']");
     	if(driver.findElement(By.cssSelector("li.guest-history.open > a > span.sn_span3")).isDisplayed())
     	{
     		System.out.println("PASS: System Successfully navigated and loaded New Quote page from Guest History");
     	}
     	}
     	catch (Exception e)
     	{
     		System.out.println("FAIL: Unable to load page, URL navigated fine from Guest History to New Quote");
     	}
     	
     }
     catch (Exception e)
     {
     	System.out.println("FAIL: Unable to Navigate to the Guest history page from New Quote");
     }
	
	 //New Quote to Tape chart
	 
	 try
     {
		 driver.navigate().back();
		 Wait.wait10Second();
     	if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/index.html#tapeChart"));
     	
     	try
     	{
     	waitForElement("//*[@id='bpjscontainer_17']/div");
     	if(driver.findElement(By.xpath("//input[@placeholder='Adults']")).isDisplayed())
     	{
     		System.out.println("PASS: System Successfully navigated and loaded Tape Chart from New Quote");
     	}
     	}
     	catch (Exception e)
     	{
     		System.out.println("FAIL: Unable to load page, URL navigated fine from New Quote to TapeChart");
     	}
     }
     catch (Exception e)
     {
     	System.out.println("FAIL: Unable to Navigate to the TapeChart page from New Quote");
     }
	 
	 
	 //Tape Chart to Reservation
	 
	 try
	 {
	 driver.navigate().back();
	 Wait.wait10Second();
	 if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/index.html#reservationSearch"));
 	
 	
 	try
 	{
 		waitForElement("//*[@id='bpjscontainer_17']/div");	
 	if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div")).isDisplayed())
 	{
 		System.out.println("PASS: System Successfully navigated and loaded Reservation page page from Tapechart");
 	}
 	}
 	 catch(Exception e)
 	{
 		System.out.println("FAIL: Unable to load page, URL navigated fine from TapeChart to Reservation");
 	}
	 }
	 catch (Exception e)
     {
     	System.out.println("FAIL: Unable to Navigate to the Reservation page from Tapechart");
     }
	
	 System.out.println("***************** Reservation Level one Ends ***********************");
	 
	 
	 
	 System.out.println("***************** Accounts Level one Starts ***********************");
		try
		{
			try
			{
		driver.findElement(By.xpath("//img[@src='images/accounts.png']")).click();
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//*[@id='bpjscontainer_15']/header[1]/div/div/ul/li[2]/a")).click();
			}
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//*[@id='head_accounts']/a")).click();
		}
		waitForElement("//*[@id='accountSearchFilter']/div/div[2]/div/div/div/div");
		
		// Accounts to Account Distribution
		try
		{
			driver.findElement(By.xpath("//li[@class='statements open']")).click();
			waitForElement("//select[@name='ctl00$MainContent$drpPeriodDate']");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Statements page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_2")).click();
			waitForElement("//section[@class='main_content_out']");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Unit Owneritems page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_3")).click();
			waitForElement("//section[@class='main_content_out']");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Travel Agent Items page");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_4")).click();
			waitForElement("//section[@class='main_content_out']");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Manage Transfers page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_5")).click();
			waitForElement("//section[@class='main_content_out']");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Account Distribution page");
		}
		
		
		
		// Back Navigation from Account distribution to Accounts
		
		try
		{
			driver.navigate().back();
			 Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/management_items.aspx"));
			try
			{
				waitForElement("//section[@class='main_content_out']");
				if(driver.findElement(By.xpath("//section[@class='main_content_out']")).isDisplayed())
			 	{
			 		System.out.println("PASS: System Successfully navigated and loaded Manage Transfers page from Account Distribution");
			 	}
			 	}
			 	 catch(Exception e)
			 	{
			 		System.out.println("FAIL: Unable to load page, URL navigated fine from Account Distribution to Manage Transfers");
			 	}
			}
		catch(Exception e)
		{
			
			System.out.println("FAIL: Unable to navigate to the Manage Transfers page");
		}
		
		// Back navigation from Manage Transfers page to Travel agent items
		
		try
		{
			driver.navigate().back();
			 Wait.wait10Second();
			 if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/travelAgent_items.aspx"));
			 try
			 {
				 waitForElement("//section[@class='main_content_out']");
					if(driver.findElement(By.xpath("//section[@class='main_content_out']")).isDisplayed())
				 	{
				 		System.out.println("PASS: System Successfully navigated and loaded Travel agent items page from Manage Transfers");
				 	}
				 	}
				 	 catch(Exception e)
				 	{
				 		System.out.println("FAIL: Unable to load page, URL navigated fine from Manage Transfers to Travel agent items");
				 	}
			 }
		
		   catch(Exception e)
		{
			   System.out.println("FAIL: Unable to navigate to the Travel agent item");
		}
		
		// Back navigation from Travel agent items to Unit owner items
		
		try
		{
			driver.navigate().back();
			 Wait.wait10Second();
			 if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/unitOwner_items.aspx"));
			 try
			 {
				 waitForElement("//section[@class='main_content_out']");
					if(driver.findElement(By.xpath("//section[@class='main_content_out']")).isDisplayed())
				 	{
				 		System.out.println("PASS: System Successfully navigated and loaded Unit owner items page from Travel agent items");
				 	}
				 	}
				 	 catch(Exception e)
				 	{
				 		System.out.println("FAIL: Unable to load page, URL navigated fine from Travel agent items to Unit owner items");
				 	}
			 }
		
		   catch(Exception e)
		{
			   System.out.println("FAIL: Unable to navigate to the Unit owners");
		}
		
		
		//Back Navigation from Unit owner items to Statements 
		
		
		
		try
		{
			driver.navigate().back();
			 Wait.wait10Second();
			 if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/accountStatement.aspx"));
			 try
			 {
				 waitForElement("//select[@name='ctl00$MainContent$drpPeriodDate']");
				 if(driver.findElement(By.xpath("//select[@name='ctl00$MainContent$drpPeriodDate']")).isDisplayed())
				 	{
				 		System.out.println("PASS: System Successfully navigated and loaded Statements page from Unit owner items");
				 	}
				 	}
				 	 catch(Exception e)
				 	{
				 		System.out.println("FAIL: Unable to load page, URL navigated fine from Unit owner items to Statements");
				 	}
			 }
		
		   catch(Exception e)
		{
			   System.out.println("FAIL: Unable to navigate to the StateMents");
		}
		
		
		//Back Navigation from Statements to Accounts
		
		
		
		try
		{
			driver.navigate().back();
			 Wait.wait10Second();
			 if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/index.html#accounts"));
			 try
			 {
				 waitForElement("//*[@id='accountSearchFilter']/div/div[2]/div/div/div/div");
				 
					if(driver.findElement(By.xpath("//*[@id='accountSearchFilter']/div/div[2]/div/div/div/div")).isDisplayed())
				 	{
				 		System.out.println("PASS: System Successfully navigated and loaded Accounts page from Statements");
				 	}
				 	}
				 	 catch(Exception e)
				 	{
				 		System.out.println("FAIL: Unable to load page, URL navigated fine from Statements to Accounts");
				 	}
			 }
		
		   catch(Exception e)
		{
			   System.out.println("FAIL: Unable to navigate to the StateMents");
		}
		
		System.out.println("***************** Accounts Level one Ends ***********************");
		
		
		
		System.out.println("***************** Guest Services Level one Starts ***********************");
		
		
		try
		{
			driver.findElement(By.xpath("//*[@id='head_guest_services']/a")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			try
			{
			driver.findElement(By.xpath("//img[@src='images/guest-services.png']")).click();
			waitForElement("//*[@id='tdTitle']/font");
			}
			catch(Exception E)
			{
				driver.findElement(By.xpath("//*[@id='bpjscontainer_15']/header[1]/div/div/ul/li[3]/a")).click();
				waitForElement("//*[@id='tdTitle']/font");
			}
		}
		
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load house keeping Status");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
			waitForElement("//*[@id='MainContent_dgTaskList_div']");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Task List");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_2")).click();
			waitForElement("//*[@id='tdTitle']");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Room Maintenance");
		}
		
		//Back navigation from Room Maintenance
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/taskList.aspx"));
			try
			{
			waitForElement("//*[@id='MainContent_dgTaskList_div']");
			if(driver.findElement(By.xpath("//*[@id='MainContent_dgTaskList_div']")).isDisplayed())
			{
				System.out.println("PASS: System Successfully navigated and Task list page from Room Maintenance");
			}
			
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Room Maintenance to Task list");
			}
		}
		catch(Exception e)
		{
			 System.out.println("FAIL: Unable to navigate to the Task list page");
		}
		
		//Task list to House keeping status page
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/houseKeeping_Status.aspx"));
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
			if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
			{
				System.out.println("PASS: System Successfully navigated and House keeping page from Task list");
			}
			
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Task list to House keeping status page");
			}
		}
		catch(Exception e)
		{
			 System.out.println("FAIL: Unable to navigate to the House keeping page");
		}
		
		System.out.println("***************** Guest Services Level one Ends ***********************");
		
		
		
		System.out.println("***************** Inventory Level one Starts ***********************");
		
		
		try
		{
		driver.findElement(By.xpath("//*[@id='head_inventory']/a")).click();
		waitForElement("//*[@id='tdTitle']/font");
		}
		catch (Exception e)
		{
			System.out.println("System unable to load inventory page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
			waitForElement("//*[@id='dvDoc']");
		}
		catch (Exception e)
		{
			System.out.println("System unable to load Overview page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
			waitForElement("//*[@id='bpjscontainer_19']/div/div[2]/div/div/div[2]/div");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Season page");
		}
		
		try
		{
			driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[3]/a")).click();
			waitForElement("//*[@id='form1']/section");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Rates page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_3")).click();
			waitForElement("//*[@id='bpjscontainer_19']/div/div[2]/div[2]/div/div");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Rules page");
		}
		
		try
		{
			driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[5]/a")).click();
			waitForElement("//*[@id='bpjscontainer_26']/div/div[2]/div/div");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load Distribution page");
		}
		
		try
		{
			driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[6]/a")).click();
			waitForElement("//*[@id='tab_1']/div/div[2]/div[2]/div/div");
		}
		catch(Exception e)
		{
			System.out.println("System unable to load policies page");
		}
		
		//Back navigation from policies page to overview page
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/index.html#distribution"));
			try
			{
				waitForElement("//*[@id='bpjscontainer_26']/div/div[2]/div/div");
				if(driver.findElement(By.xpath("//*[@id='bpjscontainer_26']/div/div[2]/div/div")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Distribution page from policies page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from policies to Distribution page");
			}
		}
		catch (Exception e)
		{
			 System.out.println("FAIL: Unable to navigate to the Distribution page");
		}
		
		//Distribution page to Rules page
		
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/index.html#rules"));
			try
			{
				waitForElement("//*[@id='bpjscontainer_19']/div/div[2]/div[2]/div/div");
				if(driver.findElement(By.xpath("//*[@id='bpjscontainer_19']/div/div[2]/div[2]/div/div")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Rules page from Distribution page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Distribution page to Rules page");
			}
		}
		catch (Exception e)
		{
			 System.out.println("FAIL: Unable to navigate to the Rules page");
		}
		
		//Rules page to Rate page
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/rates.aspx"));
			try
			{
				waitForElement("//*[@id='form1']/section");
				if(driver.findElement(By.xpath("//*[@id='form1']/section")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Rates page from Rules page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Rules page to Rates page");
			}
		}
		catch (Exception e)
		{
			 System.out.println("FAIL: Unable to navigate to the Rates page");
		}
		
		//Rates to Seasons page
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/rates.aspx"));
			try
			{
				waitForElement("//*[@id='bpjscontainer_19']/div/div[2]/div/div/div[2]/div");
				if(driver.findElement(By.xpath("//*[@id='bpjscontainer_19']/div/div[2]/div/div/div[2]/div")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Seasons page from Rates page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Rates page to Seasons page");
			}
		}
		catch (Exception e)
		{
			 System.out.println("FAIL: Unable to navigate to the Seasons page");
		}
		
		//Seasons page to overview page
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/rates_grid.aspx"));
			try
			{
				waitForElement("//*[@id='bpjscontainer_19']/div/div[2]/div/div/div[2]/div");
				if(driver.findElement(By.xpath("//*[@id='bpjscontainer_19']/div/div[2]/div/div/div[2]/div")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Overview page from Seasons page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from seasons page to Overview page");
			}
		}
		catch (Exception e)
		{
			 System.out.println("FAIL: Unable to navigate to the Overview page");
		}
		
		
		
		System.out.println("***************** Inventory Level one Ends ***********************");	
		
		
		
		
		
		System.out.println("***************** Set Up Level one Starts ***********************");
		
		
		try
		{
			driver.findElement(By.xpath("//*[@id='head_setup']/a")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Setup page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
			waitForElement("//*[@id='form1']/section");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Properties page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
			waitForElement("//*[@id='roomClassSearch']/div/div[2]/div/div/div");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Room classes page");
		}
		
		try
		{
			driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[3]/a")).click();
			waitForElement("//*[@id='MainContent_TaxItems_DIV']");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Taxes page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_3")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Ledger accounts page");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_4")).click();
			waitForElement("//*[@id='tdTitle']/font");
			
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Merchant services page");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_5")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Document templates page");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_6")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the List Management page");
		}
		
		//Back navigation from list management tab
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/Documents.aspx"));
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Document page from List Management page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from List Management page to Document page");
			}
		}
		catch(Exception e)
		{
			System.out.println("FAIL: Unable to navigate to the Document template page");
		}
		
		
		// Document templates to Merchant services
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/merchantService.aspx"));
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Merchant services page from Document templates page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Document templates page to Merchant services page");
			}
		}
		catch(Exception e)
		{
			System.out.println("FAIL: Unable to navigate to the Merchant services page");
		}
		
		// Merchant services page to Ledger accounts
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/ledgerAccounts.aspx"));
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Ledger accounts page from Merchant services page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Merchant services page to Ledger accounts page");
			}
		}
		catch(Exception e)
		{
			System.out.println("FAIL: Unable to navigate to the Ledger accounts page");
		}
		
		
		//Ledger accounts to Taxes
		

		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/tax_items.aspx"));
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Taxes page from Ledger accounts page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Ledger accounts page to Taxes page");
			}
		}
		catch(Exception e)
		{
			System.out.println("FAIL: Unable to navigate to the Taxes page");
		}
		
		
		//Taxes to Room classes
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/index.html#roomclasses"));
			try
			{
				waitForElement("//*[@id='roomClassSearch']/div/div[2]/div/div/div");
				if(driver.findElement(By.xpath("//*[@id='roomClassSearch']/div/div[2]/div/div/div")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Room classes page from Taxes page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Taxes page to Room classes");
			}
		}
		catch(Exception e)
		{
			System.out.println("FAIL: Unable to navigate to the Room classes page");
		}
		
		//Room classes to Properties page
		
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/properties.aspx"));
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Propertiess page from Room classes page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Room classes page to Properties");
			}
		}
		catch(Exception e)
		{
			System.out.println("FAIL: Unable to navigate to the Properties page");
		}
		
		
		System.out.println("***************** Set Up Level one Ends ***********************");
		
		
		System.out.println("***************** Admin Level one Starts ***********************");
		
		try
		{
		driver.findElement(By.xpath("//*[@id='head_admin']/a")).click();
		waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Admin module");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Client info page");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Users page");
		}
		
		try
		{
			driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[3]/a")).click();
			waitForElement("//*[@id='tab_1']/div/div[2]/div/div/div");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Roles page");
		}
			
		
		//Back navigation from Roles to Client info
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/index.html#users"));
			try
			{
				waitForElement("//*[@id='tab_1']/div/div[2]/div/div/div");
				if(driver.findElement(By.xpath("//*[@id='tab_1']/div/div[2]/div/div/div")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Users page from Roles page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Roles to Users");
			}
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Users page");
		}
		
		//Users to client info
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/clients.aspx"));
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Client info page from Users page");
				}
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Users to Roles");
			}
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Client info page");
		}
		
		
		System.out.println("***************** Admin Level one Ends ***********************");
		
		
		System.out.println("***************** Reports Level one Starts ***************");
		
		try
		{
			driver.findElement(By.xpath("//*[@id='head_reports']/a")).click();
			waitForElement("//*[@id='tdTitle']/font");
			
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Reports");
		}
		
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Account Balances");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Ledger Balances");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_2")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Merchant Trans");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_3")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Daily flash");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_4")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Room Forecast");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_5")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Net Sales");
		}
		try
		{
			driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_6")).click();
			waitForElement("//*[@id='tdTitle']/font");
		}
		catch(Exception e)
		{
			System.out.println("System unable to navigate to the Net Sales");
		}
		
		
		//Back navigation from Advance deposit to all tabs
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/netsaleReport.aspx"))
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Net Sales page from Advance deposit page");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Advance Deposit to Net Sales");
			}
		}
		catch (Exception e)
		{
			System.out.println("System unable to navigate to the Net sales page");
		}
		
		//Net sales to Room Forecast
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/DailyForeCastReport.aspx"))
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Room Forecast page from Net sales page");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Net salest to Room Forecast");
			}
		}
		catch (Exception e)
		{
			System.out.println("System unable to navigate to the Room Forecast");
		}
		
		
		//Room Forecast to Daily flash
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/dailyFlashReport.aspx"))
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Daily flash page from Room Forecast page");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Room Forecast to Daily flash");
			}
		}
		catch (Exception e)
		{
			System.out.println("System unable to navigate to the Daily flash");
		}
		
		
		// Daily flash to Merchant trans
		
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/merchantTransactions.aspx"))
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Merchant trans page from Daily flash page");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Daily flash to Merchant trans");
			}
		}
		catch (Exception e)
		{
			System.out.println("System unable to navigate to the Merchant trans");
		}
		
		
		// Merchant Trans to Ledger Balance
		
		

		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/dailyTransactions.aspx"))
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Ledger Balance page from Merchant Trans page");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Merchant Trans to Ledger Balance");
			}
		}
		catch (Exception e)
		{
			System.out.println("System unable to navigate to the Ledger Balance");
		}
		
		
		
		//Ledger Balance to Account balances
		
		
		
		try
		{
			driver.navigate().back();
			Wait.wait10Second();
			if(driver.getCurrentUrl().equals("http://dev.icn.inrd.io/accountBalanceSummary.aspx"))
			try
			{
				waitForElement("//*[@id='tdTitle']/font");
				if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
				{
					System.out.println("PASS: System Successfully navigated and loaded Account balances page from Ledger Balance page");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("FAIL: Unable to load page, URL navigated fine from Ledger Balance to Account balances");
			}
		}
		catch (Exception e)
		{
			System.out.println("System unable to navigate to the Account balances");
		}
		
		
		System.out.println("***************** Reports Level one Ends ***************");
		
		
		
		
	}
	
	
@AfterMethod
	
	public void afterMethod() throws InterruptedException
	
	{
	
	    try
	    {
	    Wait.wait15Second();	
	    driver.findElement(By.xpath("//div[@class='user_des']//span")).click();
	    }
	    catch(Exception e)
	    {
	    	driver.findElement(By.xpath("//*[@id='Span1']")).click();
	    }
	    
	    Wait.wait5Second();
	    try
	    {
		driver.findElement(By.xpath("//*[@id='logoutlink']")).click();
	    }
	    catch(Exception e)
	    {
	    	try
	    	{
	    	driver.findElement(By.xpath("//*[@id='logoutLinkMobile']")).click();
	    	}
	    	catch(Exception E)
	    	{
	    		System.out.println("Screen got hang up");
	    	}
	    }
	    
		 Wait.wait5Second();   
		driver.quit();
	}
	
public void waitForElement(String string) {
	// TODO Auto-generated method stub
	WebDriverWait wait = new WebDriverWait(driver,30);
    WebElement element = wait.until(
                        ExpectedConditions.presenceOfElementLocated(By.xpath(string)));
    
}

public void waitForElementbycss(String string) {
	// TODO Auto-generated method stub
	WebDriverWait wait = new WebDriverWait(driver,30);
    WebElement element = wait.until(
                        ExpectedConditions.presenceOfElementLocated(By.cssSelector(string)));
    
}
	

}
