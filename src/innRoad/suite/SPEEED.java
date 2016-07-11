package innRoad.suite;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import java.io.FileOutputStream;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.browsermob.core.har.Har;
import org.browsermob.proxy.ProxyServer;

import com.google.common.base.Stopwatch;

import static org.openqa.selenium.OutputType.*;


public class SPEEED {
	
	 static WebDriver driver;

   public static void main(String[] args) throws Exception {
      // FirefoxDriver wd;
     //  wd = new FirefoxDriver();
		
	   String strFilePath = "U:\\InnRoad_DataDriven_FrameWork\\harPerformance.har";
	   
	// start the proxy
	   ProxyServer server = new ProxyServer(4444);
	   server.start();
	   //captures the moouse movements and navigations
	   server.setCaptureHeaders(true);
	   server.setCaptureContent(true);
	   
	// get the Selenium proxy object
	   Proxy proxy = server.seleniumProxy();
	   
	// configure it as a desired capability
	   DesiredCapabilities capabilities = new DesiredCapabilities();
	   capabilities.setCapability(CapabilityType.PROXY, proxy);
	   
		// start the browser up
	  // System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	  // WebDriver driver=new  FirefoxDriver(); 
	  WebDriver driver = new FirefoxDriver(capabilities);
	   
	   /*System.setProperty("webdriver.chrome.driver","U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();	*/

	   // create a new HAR with the label "apple.com"
	   server.newHar("assertselenium.com");
	   
	   
		
			
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://rediscache.dev.icn.inrd.io/login.html");
		driver.manage().window().maximize();
		Instant start = Instant.now();
		driver.findElement(By.id("txtclientCode")).click();
		driver.findElement(By.id("txtclientCode")).clear();
		driver.findElement(By.id("txtclientCode")).sendKeys("itng");
		driver.findElement(By.id("txtLoginID")).click();
		driver.findElement(By.id("txtLoginID")).clear();
		driver.findElement(By.id("txtLoginID")).sendKeys("loukya");
		driver.findElement(By.id("txtUserPassword")).click();
		driver.findElement(By.id("txtUserPassword")).clear();
		driver.findElement(By.id("txtUserPassword")).sendKeys("Ngt@12345");
		driver.findElement(By.id("btnLogon")).click();
	//	WebDriverWait wait = new WebDriverWait(driver,5000);
	  //  WebElement element = wait.until(
	               //ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='bpjscontainer_20']/div/div[1]/div[3]/div/select")));
		
		
		//driver.findElement(By.xpath("//div[@class='propertyclickbutton']/input")).click();
	
		//driver.findElement(By.cssSelector("div.user_des")).click();
	               WebDriverWait wait = new WebDriverWait(driver,5000);
	               WebElement element = wait.until(
	    	               ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='bpjscontainer_15']/header[1]/div/div/div[1]")));
		driver.findElement(By.xpath("//*[@id='bpjscontainer_15']/header[1]/div/div/div[1]")).click();
		
		
		
		
		driver.findElement(By.id("logoutlink")).click();
		Instant end = Instant.now();
		
	
		System.out.println(Duration.between(start, end));
		Har har = server.getHar();
		FileOutputStream fos = new FileOutputStream(strFilePath);
		har.writeTo(fos);
		server.stop();
		driver.quit();
		
		
   }
   
   public static boolean isAlertPresent(FirefoxDriver wd) {
       try {
           wd.switchTo().alert();
           return true;
       } catch (NoAlertPresentException e) {
           return false;
       }
   }

		// TODO Auto-generated method stub
   
   
   public void executionTime()
   {

	   long startTime = System.currentTimeMillis();

	      long total = 0;
	      for (int i = 0; i < 10000000; i++) {
	         total += i;
	      }

	      long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      System.out.println(elapsedTime);
   }

	}


