package innRoad.suite;

import innRoad.config.Wait;
import innRoad.properties.OR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSeasons {
	
	public static WebDriver d;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
        d = new ChromeDriver();
        
        d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("http://demo.innroad.com/login.aspx");
		Wait.wait15Second();
		
		 d.findElement(By.xpath("//*[@id='txtclientCode']")).sendKeys("innroad");
		   d.findElement(By.xpath("//*[@id='txtLoginID']")).sendKeys("loukya");
		   d.findElement(By.xpath("//*[@id='txtUserPassword']")).sendKeys("nvkgkm08");
		   d.findElement(By.xpath("//*[@id='btnLogon']")).click();
		   Wait.wait15Second();
		   
		   
		 //Verify home page
			 
			
			 String Get_Home_Page_Title=d.getTitle();
			 Wait.wait15Second();
			if(Get_Home_Page_Title.endsWith("innCenter : Home"))
			{
				System.out.println("Title verified");
			}
			else
			{
				System.out.println("Fail to verify title");
			}
			
			
			 
			//Select client from client dropdown
		
			 d.switchTo().frame(0);
			 Wait.wait2Second();
			 d.findElement(By.id("ucNavShortcut_rptrMenu_btnMenuItem_0")).click();
			 Wait.wait10Second();
			 
			
			 
			//Selecting client from client dropdown 
			
				 d.switchTo().defaultContent();
				 Wait.wait2Second();
				 d.switchTo().frame("main");
				 Wait.wait2Second();
				 d.findElement(By.xpath("//b")).click();
				 Wait.wait5Second();
				 d.findElement(By.id("s2id_autogen1_search")).click();
				 d.findElement(By.id("s2id_autogen1_search")).sendKeys("Churchill Pointe Inn");
				// d.findElement(By.id("s2id_autogen1_search")).sendKeys(Client_Name);
				 d.findElement(By.id("s2id_autogen1_search")).sendKeys(Keys.ENTER);
				 Wait.wait10Second();
				 
				 
				//Verify by clicking on Inventory
				
						d.switchTo().defaultContent();
						Wait.wait2Second();	
						d.switchTo().frame(0);
					 Wait.wait2Second();
					d.findElement(By.xpath("//*[@id='rptrMenu_btnMenuItem_3']")).click();
					Wait.wait5Second();
					
					
					
					//Click on Seasons
					
				
						 d.switchTo().defaultContent();
						    Wait.wait2Second();
						    d.switchTo().frame("main");
						    Wait.wait2Second();
						d.findElement(By.id("rptrMenu_lbtnAltMenuItem_1")).click();
						Wait.wait5Second();
						
						
						
						//Click on New Seasons
						
						d.switchTo().defaultContent();
					    Wait.wait2Second();
					    d.switchTo().frame("nxtgen");
					    Wait.wait2Second();
						new Select (d.findElement(By.xpath("//select[starts-with(@data-bind,'options: PropertiesList')]"))).selectByVisibleText("Churchill Pointe Inn");
						Wait.wait2Second();
						d.findElement(By.xpath("//div[@class='footer_buttons']/button[1]")).click();
						Wait.wait2Second();
						
						
						
						
						d.findElement(By.xpath("//input[@placeholder='Season Name']")).sendKeys("Test Season");
						d.findElement(By.xpath("//input[@placeholder='Start Date']")).sendKeys("Jun 28, 2016");
						Wait.wait2Second();
						d.findElement(By.xpath("//input[@placeholder='End Date']")).sendKeys("Jun 14, 2017");
						Wait.wait2Second();
						d.findElement(By.xpath("//button[contains(@data-bind, 'saveSeasonDetail')]")).click();
						Wait.wait3Second();
						
						
						
					  d.quit();
					
				
				
		
		
	}
	

}
