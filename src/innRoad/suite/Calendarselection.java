package innRoad.suite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendarselection {

	 static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
	      // driver = new ChromeDriver();
		driver= new FirefoxDriver();
	       driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        driver.get("https://test.innroad.com/be/paynesville/property.aspx");
	        
	        driver.findElement(By.xpath("//div[@class='onlyDate clickableDays'][2]")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//div[@class='onlyDate clickableDays'][7]")).click();
        	Thread.sleep(3000);
        	
        	int size=driver.findElements(By.xpath("//div[@class='onlyDate unClickableDays']")).size();
        	System.out.println(size);
        	String size1= size+"";
        	
        	if(size1.equals("2"))
        	{
        		System.out.println("Pass");
        	}
        	else
        	{
        		System.out.println("Fail");
        	}
	        
	        List<WebElement> elements =driver.findElements(By.xpath("//div[@class='onlyDate clickableDays']"));
	        
	        
	        
	        for(int i=0; i<elements.size(); i++)
	        {
	        	System.out.println(elements.get(i).getText());
	        	
	        	
	        }
	        
	        
	        
	        
		

	}

}
