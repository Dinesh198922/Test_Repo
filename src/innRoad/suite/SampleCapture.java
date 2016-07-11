package innRoad.suite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleCapture {
	
	static final ExtentReports extent = new ExtentReports("U:\\reports\\reports2.html", true);
	 ExtentTest test = extent.startTest("Sample Test", "For Capturing Screen shot");
	
	public WebDriver d;
	
	@BeforeMethod
	
	public void intailization() throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
		d = new ChromeDriver();
		
		d.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		Thread.sleep(1500);
		
	}
	
	@Test
	
	public void test() throws IOException
	{
		try
		{
		d.findElement(By.xpath("//*[@id='ddd']"));
		 test.log(LogStatus.PASS, "identified xapth Successfully");
		}
		catch(Exception e)
		{
			File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("U:\\capturescreen15.jpg"));
			test.log(LogStatus.FAIL, "Unable to identify the xpath");
			 test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("U:\\capturescreen15.jpg"));
		}
	}
	
	
	@AfterMethod
	
	public void close()
	{
		  extent.endTest(test);
		  extent.flush();
		d.close();
	}
	
	

}
