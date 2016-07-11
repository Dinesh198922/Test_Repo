package innRoad.suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Skuli {

	
		public WebDriver d;
		
		@BeforeMethod
		
		public void xyz() throws InterruptedException {
			
			
			
			System.setProperty("webdriver.chrome.driver",
					"U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
			d = new ChromeDriver();
			
			d.get("https://test.innroad.com/be/sunrisesprings/property.aspx");
			Thread.sleep(1500);
			
		}
		
		
		@org.testng.annotations.Test
		public void sample() throws FindFailed{
		Screen s = new Screen();
		Pattern image = new Pattern("C:\\NoPicture.png");
		s.find(image);
		}
		
		@AfterMethod
		
		 public void afterMethod() {
				
				System.out.println("Logout");
				
			}

}
