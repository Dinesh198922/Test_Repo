package innRoad.suite;

import innRoad.config.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SampleTestScript {
	
	
public WebDriver driver;
	
	@BeforeMethod
	
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
       driver = new ChromeDriver();
		/*System.setProperty("webdriver.ie.driver",
				"U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\IEDriverServer.exe");*/
		//driver= new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://training.innroad.com/");
       
	}
	
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
        Wait.wait15Second();
        
        // Reservation page
        try
        {
        driver.get("https://training.innroad.com/index.html#reservationSearch");
        try
        {
        if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div/div[1]/section")).isDisplayed())
		{
			System.out.println("PASS: System Successfully navigated and loaded Reservation page");
	    }
        }
        catch(Exception e)
        {
        	System.out.println("FAIL: Unable to load page, URL navigated fine from Reservation page");
        }
        {
        	
        }
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to navigate to the reservation page");
        }
        
        
        // TapeChart
        
        try
        {
        driver.get("https://training.innroad.com/index.html#tapeChart");
        try
        {
        if(driver.findElement(By.xpath("//*[@id='bpjscontainer_17']/div")).isDisplayed())
		{
			System.out.println("PASS: System Successfully navigated and loaded Tapechart page ");
	    }
        }
        catch(Exception e)
        {
        	System.out.println("FAIL: Unable to load page, URL navigated fine from Tapechart page");
        }
        {
        	
        }
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to navigate to the TapeChart page");
        }
        
        
        // New Quote
        
        
        try
        {
        driver.get("https://training.innroad.com/index.html#rateQuote");
        try
        {
        if(driver.findElement(By.xpath("//input[@placeholder='Adults']")).isDisplayed())
		{
			System.out.println("PASS: System Successfully navigated and loaded Tapechart page ");
	    }
        }
        catch(Exception e)
        {
        	System.out.println("FAIL: Unable to load page, URL navigated fine from Tapechart page");
        }
        {
        	
        }
        }
        catch (Exception e)
        {
        	System.out.println("FAIL: Unable to navigate to the TapeChart page");
        }
        
        
        
        
        
        
	}
	
	
@AfterMethod
	
	public void afterMethod()
	
	{
		driver.findElement(By.id("logoutLinkMobile")).click();
		   
		driver.quit();
	}


}
