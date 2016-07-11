package innRoad.suite;

import innRoad.config.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Back_Navigation_Level_Two {
	
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
        WebDriverWait wait = new WebDriverWait(driver,60);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='bpjscontainer_20']/div/div[1]/table/thead/tr/th[1]/div")));
       
	}
	
@Test
	
	public void leveltwo() throws InterruptedException
	{
	
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
	driver.close();
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

}
