package innRoad.suite;


import innRoad.config.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class navigationTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver",
				//"U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\IEDriverServer.exe");
		//driver= new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://training.innroad.com/");
       
	}
	
	@Test
	
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("txtclientCode")).click();
        driver.findElement(By.id("txtclientCode")).clear();
        driver.findElement(By.id("txtclientCode")).sendKeys("itng");
        driver.findElement(By.id("txtLoginID")).click();
        driver.findElement(By.id("txtLoginID")).clear();
        driver.findElement(By.id("txtLoginID")).sendKeys("Pravallika");
        driver.findElement(By.id("txtUserPassword")).click();
        driver.findElement(By.id("txtUserPassword")).clear();
        driver.findElement(By.id("txtUserPassword")).sendKeys("Test@1234");
        driver.findElement(By.id("btnLogon")).click();
       // Wait.wait25Second();
       WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='bpjscontainer_17']/div/div[1]/section")));
       
       
        //Reservation module - all to Reservation
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Tape Chart']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#reservationSearch"));
        	
        	
        	    try
        	    {
        	    	waitForElement("//*[@id='bpjscontainer_17']/div/div[1]/section");
        		if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div/div[1]/section")).isDisplayed())
        		{
        			System.out.println("PASS: System Successfully navigated and loaded Reservation page from Tapechart ");
        	    }
        	    }
        	    catch(Exception e)
        	    {
        			System.out.println("FAIL: Unable to load page, URL navigated fine from Reservation page to Tapechart");
        	    }
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Reservation page from Tapechart");
        }
       		
        
        //NewQuote to Reservation
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='New Quote']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#reservationSearch"));
        	
        	
        	
        	    try
        	    {
        	    	waitForElement("//*[@id='bpjscontainer_17']/div/div[1]/section");	
        		if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div/div[1]/section")).isDisplayed())
        		{
        			System.out.println("PASS: System Successfully navigated and loaded Reservation page from NewQuote ");
        	    }
        	    }
        		catch(Exception e)
        		{
        			System.out.println("FAIL: Unable to load page, URL navigated fine from New Quote to Reservation");
        		}
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Reservation page from New Quote");
        }
        
       
        //Guest History to Reservation 
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Guest History']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#reservationSearch"));
        	
        	
        	    try
        	    {
        	    waitForElement("//*[@id='bpjscontainer_17']/div/div[1]/section");	
        		if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div/div[1]/section")).isDisplayed())
        		{
        			System.out.println("PASS: System Successfully navigated and loaded Reservation page from Guest History");
        		}
        	    }
        	    catch(Exception e)
        		{
        			System.out.println("FAIL: Unable to load page, URL navigated fine from Guest history to Reservation");
        		}
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Reservation page from Guest History");
        }
        
        
        //Groups to Reservation
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Groups']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#reservationSearch"));
        	
        	
        	    try
        	    {
        	    	waitForElement("//*[@id='bpjscontainer_17']/div/div[1]/section");	
        		if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div/div[1]/section")).isDisplayed())
        		{
        			System.out.println("PASS: System Successfully navigated and loaded Reservation page from Groups");
        	    }
        	    }
        	    catch(Exception e)
        		{
        			System.out.println("FAIL: Unable to load page, URL navigated fine from Groups to Reservation");
        		}
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Reservation page from Groups");
        }
        
        
        //TapeChart to all tabs
        
        driver.findElement(By.xpath("//*[@id='ucNavSecondary_rptrNavMain_lbtnNavMainItem_1']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[1]/a")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#tapeChart"));
        	
        	
        	try
        	{
        		waitForElement("//*[@id='bpjscontainer_17']/div");	
        	if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded TapeChart page from Reservation");
        	}
        	}
        	 catch(Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from reservation to Tapechart");
        	}
        	
        }
        
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Tapechart page from Reservation");
        }
        
        
        // New Quote to TapeChart
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='New Quote']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#tapeChart"));
        	
        	
        	try
        	{
        		waitForElement("//*[@id='bpjscontainer_17']/div");
        	if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded TapeChart page from New Quote");
        	}
        	}
        	catch(Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from new quote to tapechart");
        	}
         }
        
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Tapechart page from NewQuote");
        }
        
        
        //Guest History to TapeChart
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Guest History']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#tapeChart"));
        	
        	
        	try
        	{
        		waitForElement("//*[@id='bpjscontainer_17']/div");
        	if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded TapeChart page from Guest History");
        	}
        	}
        	catch(Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Guest history to Tapechart");
        	}
        	
        }
        
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Tapechart page from Guest History");
        }
        
        
        
        //Groups to TapeChart
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Groups']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#tapeChart"));
        	
        	
        	
                try
                {
                	waitForElement("//*[@id='bpjscontainer_17']/div");
        		if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div")).isDisplayed())
        		{
        			System.out.println("PASS: System Successfully navigated and loaded TapeChart page from Groups");
        		}
                }
                catch(Exception e)
        		{
        			System.out.println("FAIL: Unable to load page, URL navigated fine from Groups to Tapechart");
        		}
        }
        
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the TapeChart page from Groups");
        }
        
        
        //New Quote to all
        
        driver.findElement(By.xpath("//*[@id='ucNavSecondary_rptrNavMain_lbtnNavMainItem_2']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[1]/a")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#rateQuote"));
        	
        	
        	try
        	{
        		waitForElement("//input[@placeholder='Adults']");
        	if(driver.findElement(By.xpath("//input[@placeholder='Adults']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded New quote page from Reservation");
        	}
        	}
        	catch(Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Reservation to New quote");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("PASS: Unable to Navigate to the New Quote page from Reservation");
        }
        
        
       // New Quote to Tapechart
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Tape Chart']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        try
        {
        	
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#rateQuote"));
        	
        	try
        	{
        		waitForElement("//input[@placeholder='Adults']");
        	if(driver.findElement(By.xpath("//input[@placeholder='Adults']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded New quote page from TapeChart");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from TapeChart to New quote");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the New Quote page from TapeChart");
        }
        
        
        //New Quote to Guest History
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Guest History']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        try
        {
        	
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#rateQuote"));
        	
        	try
        	{
        		waitForElement("//input[@placeholder='Adults']");
        	if(driver.findElement(By.xpath("//input[@placeholder='Adults']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded New quote page from Guest History");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Guest History to New quote");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the New Quote page from Guest History");
        }
        
        
        //New Quote to Group
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Groups']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        try
        {
        	
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#rateQuote"));
        	
        	try
        	{
        		waitForElement("//input[@placeholder='Adults']");
        	if(driver.findElement(By.xpath("//input[@placeholder='Adults']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded New quote page from Groups");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Groups to New quote");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the New Quote page from Groups");
        }
        
        
        
        // Guest History to all
        
        driver.findElement(By.xpath("//*[@id='ucNavSecondary_rptrNavMain_lbtnNavMainItem_3']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[1]/a")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#guestHistory"));
        	
        	
        	
        	try
        	{
        		waitForElementbycss("li.guest-history.open > a > span.sn_span3");
        	if(driver.findElement(By.cssSelector("li.guest-history.open > a > span.sn_span3")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Guest history page from Reservation");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Reservation to Guest history");
        	}
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Guest history page from Reservation");
        }
        
        
        //Guest History to Tapechart
        
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Tape Chart']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#guestHistory"));
        	
        	
        	try
        	{
        		waitForElementbycss("li.guest-history.open > a > span.sn_span3");
        	if(driver.findElement(By.cssSelector("li.guest-history.open > a > span.sn_span3")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Guest history page from TapeChart");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from TapeChart to Guest history");
        	}
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Guest history page from TapeChart");
        }
        
        
        //Guest History to New Quote
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='New Quote']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#guestHistory"));
        	
        	try
        	{
        		waitForElementbycss("li.guest-history.open > a > span.sn_span3");
        	if(driver.findElement(By.cssSelector("li.guest-history.open > a > span.sn_span3")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Guest history page from New Quote");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from New Quote to Guest history");
        	}
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Guest history page from New Quote");
        }
        
        
        //Guest History to Groups
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Groups']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#guestHistory"));
        	
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
        
        
        
        //Groups to all
        try
        {
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Groups']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//*[@id='ucNavSecondary_rptrNavMain_lbtnNavMainItem_0']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/accounts.aspx"));
        	
        	try
        	{
        		waitForElement("//*[@id='MainContent_btnNew']");
        	if(driver.findElement(By.xpath("//*[@id='MainContent_btnNew']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Groups page from Reservation");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Reservation to Groups");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Groups page from Reservation");
        }
       
        
       //Groups to Tapechart
        
        
        driver.findElement(By.xpath("//*[@id='ucNavSecondary_rptrNavMain_lbtnNavMainItem_1']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/accounts.aspx"));
        	
        	try
        	{
        		waitForElement("//*[@id='MainContent_btnNew']");
        	if(driver.findElement(By.xpath("//*[@id='MainContent_btnNew']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Groups page from Tapechart");
        	}
        	}
        	 catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Tapechart to Groups");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Groups page from Tapechart");
        }
        
        
        //Groups to New Quote
        
        driver.findElement(By.xpath("//*[@id='ucNavSecondary_rptrNavMain_lbtnNavMainItem_2']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/accounts.aspx"));
        	
        	try
        	{
        		waitForElement("//*[@id='MainContent_btnNew']");
        	
        	if(driver.findElement(By.xpath("//*[@id='MainContent_btnNew']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Groups page from New Quote");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from New Quote to Groups");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Groups page from New Quote");
        }
        
        //Groups to Guest History
        
        driver.findElement(By.xpath("//*[@id='ucNavSecondary_rptrNavMain_lbtnNavMainItem_3']")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/accounts.aspx"));
        	
        	try
        	{
        		waitForElement("//*[@id='MainContent_btnNew']");
        	if(driver.findElement(By.xpath("//*[@id='MainContent_btnNew']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Groups page from Guest History");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Guest History to Groups");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Groups page from Guest History");
        }
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to navigate from groups to all other tabs");
        }
        
        
        
        System.out.println("*******************************Groups to Reservation page*******************"); 
        
        
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Tape Chart']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='New Quote']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Guest History']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Groups']")).click();
        Wait.wait10Second();
       //Page navigating to Guest History 
        try
        {
        	driver.navigate().back();
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#guestHistory"));
        	
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
        	System.out.println("System unable to navigate to the Guest History page");
        }
        //Page navigating to the New Quote
        try
        {
        	driver.navigate().back();
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#rateQuote"));
        	
        	try
        	{
        	waitForElement("//input[@placeholder='Adults']");	
        	if(driver.findElement(By.xpath("//input[@placeholder='Adults']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded New quote page from Guest History");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Guest History to New quote");
        	}
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the New Quote page from Guest History");
        }
        
        // Page navigating to the Tape Chart
        
        try
        {
        	driver.navigate().back();
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#tapeChart"));
        	
        	try
        	{
        		waitForElement("//*[@id='bpjscontainer_17']/div");	
        		if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div")).isDisplayed())
        	{
        			System.out.println("PASS: System Successfully navigated and loaded TapeChart page from New Quote");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from new quote to tapechart");
        	}
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Tapechart page from NewQuote");
        }
        
       
        //Page navigating to the Reservation page
        
        try
        {
        	driver.navigate().back();
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#reservationSearch"));
        	
        	try
        	{
        		waitForElement("//*[@id='bpjscontainer_17']/div/div[1]/section");	
        		if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div/div[1]/section")).isDisplayed())
        	{
        			System.out.println("PASS: System Successfully navigated and loaded Reservation page from Tapechart ");
        	}
        	}
        	catch (Exception e)
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Reservation page to Tapechart");
        	}
        	
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Reservation page from Tapechart");
        }
        
        
        
        
        

    	
   		
        
        
        
        
        
        System.out.println("*******************************Reservation Module completed*******************");
        
        
        
        /*System.out.println("*******************************Account Module Started*******************");
        Wait.wait25Second();
        
        //Accounts to all tabs
        driver.findElement(By.xpath("//*[@id='bpjscontainer_15']/header[1]/div/div/ul/li[2]/a/img")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[2]/a")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#accounts"));
        	if(driver.findElement(By.xpath("//span[@id='bpjscontainer_17']/section/div/div/div/div/div/div[4]/button[2]")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Accounts page from Statements");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from statements to Accounts");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Accounts page from Statements");
        }
        
        
       //Accounts to Unit Owner items
        
        
        driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[3]/a")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#accounts"));
        	if(driver.findElement(By.xpath("//span[@id='bpjscontainer_17']/section/div/div/div/div/div/div[4]/button[2]")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Accounts page from Unit Owner items");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Unit Owner items to Accounts");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Accounts page from Unit Owner items");
        }
        
        // Accounts to Travel Agent items 
        
        driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[4]/a")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#accounts"));
        	if(driver.findElement(By.xpath("//span[@id='bpjscontainer_17']/section/div/div/div/div/div/div[4]/button[2]")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Accounts page from Travel Agent items");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Travel Agent items to Accounts");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Accounts page from Travel Agent items");
        }
        
       //Accounts to Management Transfer
        
        driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[5]/a")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#accounts"));
        	if(driver.findElement(By.xpath("//span[@id='bpjscontainer_17']/section/div/div/div/div/div/div[4]/button[2]")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Accounts page from Management Transfer");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Management Transfer to Accounts");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Accounts page from Management Transfer");
        }
        
        
       //Accounts to Account Distributions
        
        driver.findElement(By.xpath("//*[@id='bpjscontainer_16']/div/ul/li[6]/a")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/index.html#accounts"));
        	if(driver.findElement(By.xpath("//span[@id='bpjscontainer_17']/section/div/div/div/div/div/div[4]/button[2]")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Accounts page from Account Distributions");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Account Distributions to Accounts");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Accounts page from Account Distributions");
        }*/
        
        
        System.out.println("********************************Guest Services***********************************");
        Wait.wait25Second();
        System.out.println("********************************Guest Services***********************************");
        Wait.wait25Second();
        System.out.println("********************************Guest Services***********************************");
        //House Keeing to all
        
        driver.findElement(By.xpath("//li[@id='head_guest_services']//a")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/houseKeeping_Status.aspx"));
        	if(driver.findElement(By.xpath("//*[@id='MainContent_dgHousekeepingStatus_DIV']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded House keeping page from Task List");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Task List to House keeping");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the House keeping page from Task List");
        }
        
        
        
        
        //House keeping to Room Maintenance
        
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_2")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/houseKeeping_Status.aspx"));
        	if(driver.findElement(By.xpath("//*[@id='MainContent_dgHousekeepingStatus_DIV']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded House keeping page from Room Maintenance");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Room Maintenance to House keeping");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the House keeping page from Room Maintenance");
        }
        
        
        
        // Task List to all
        
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/taskList.aspx"));
        	
        	if(driver.findElement(By.xpath("//*[@id='MainContent_dgTaskList_div']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Task List page from House keeping");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from House keeping to Task List");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Task List page from House keeping");
        }
        
        
        //Task List to Room Maintenance
        
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_2")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/taskList.aspx"));
        	
        	if(driver.findElement(By.xpath("//*[@id='MainContent_dgTaskList_div']")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Task List page from Room Maintenance");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Room Maintenance to Task List");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Task List page from Room Maintenance");
        }
        
        
        //Room Maintenance to all
        
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_2")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/RoomMaintenanceList.aspx"));
        	
        	if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Room Maintenance page from House keeping");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from House keeping to Room Maintenance");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Room Maintenance page from House keeping");
        }
        
        
        //Room Maintenance to Task List
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
        Wait.wait10Second();
        driver.navigate().back();
        Wait.wait10Second();
        try
        {
        	if(driver.getCurrentUrl().equals("https://training.innroad.com/RoomMaintenanceList.aspx"));
        	
        	if(driver.findElement(By.xpath("//*[@id='tdTitle']/font")).isDisplayed())
        	{
        		System.out.println("PASS: System Successfully navigated and loaded Room Maintenance page from Task List");
        	}
        	else
        	{
        		System.out.println("FAIL: Unable to load page, URL navigated fine from Task List to Room Maintenance");
        	}
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to Navigate to the Room Maintenance page from Task List");
        }
        
        
        
        
        
        
        
      
        
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Guest History']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Groups']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//li[@id='head_accounts']/a/img")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Statements']")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_2")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_3")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_4")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_5")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//li[@id='head_guest_services']/a")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_2")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//li[@id='head_inventory']/a/img")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Rates']")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_3")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Distribution']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']/li[6]/a")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='nav_des']//a[normalize-space(.)='Setup']")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Taxes']")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_3")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_4")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_5")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_6")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//li[@id='head_admin']/a")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='sec_nav']//span[.='Roles']")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//ul[@class='nav_des']/li[7]/a")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//li[@id='head_night_audit']/a")).click();
        Wait.wait10Second();
        driver.findElement(By.xpath("//li[@id='head_reports']/a")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_0")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_1")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_2")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_3")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_4")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_5")).click();
        Wait.wait10Second();
        driver.findElement(By.id("ucNavSecondary_rptrNavMain_lbtnNavMainItem_6")).click();
        Wait.wait10Second();
        driver.findElement(By.id("Span1")).click();
        Wait.wait10Second();
       
	}
	
	public void waitForElement(String string) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,60);
	    WebElement element = wait.until(
	                        ExpectedConditions.presenceOfElementLocated(By.xpath(string)));
	    
	}
	
	public void waitForElementbycss(String string) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,60);
	    WebElement element = wait.until(
	                        ExpectedConditions.presenceOfElementLocated(By.cssSelector(string)));
	    
	}

	@AfterMethod
	
	public void afterMethod()
	
	{
		driver.findElement(By.id("logoutLinkMobile")).click();
		   
		driver.quit();
	}

}
