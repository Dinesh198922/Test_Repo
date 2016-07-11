package innRoad.suite;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		WebDriver driver ;
		/*double d=418.0;
		 DecimalFormat f = new DecimalFormat("##");
	     System.out.println(f.format(d));*/
		
		double d = 427.37999999999994;
		
		/*DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		for (Number n : Arrays.asList(42.738)) {
		    Double d1 = n.doubleValue();
		    System.out.println(df.format(d1));
		}*/
		
		/*double a = 123.13698;
	    double roundOff = Math.round(a*100)/100;

	    System.out.println(roundOff);*/
		
		//double roundOff = Math.round(d);
		/*DecimalFormat f = new DecimalFormat("##.00");*/
	   
	     String Package_Cal_Count = String.format("%,.2f", d);
	     
	    /* DecimalFormat f = new DecimalFormat("##.00");
	     System.out.println(f.format(Package_Cal_Count));
			*/
	     
	     System.out.println(Package_Cal_Count);
		//System.out.println(roundOff);
		
		/*BigDecimal a = new BigDecimal(d);
		BigDecimal roundOff = a.setScale(, BigDecimal.ROUND_HALF_EVEN);
		System.out.println(roundOff);*/
		
		/*System.out.printf("%.3f",d);
		*/
				
				System.setProperty("webdriver.chrome.driver","U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				Map<String, Object> deviceMetrics = new HashMap<String, Object>();
				deviceMetrics.put("width", 360);
				deviceMetrics.put("height", 640);
				deviceMetrics.put("pixelRatio", 3.0);
				options.addArguments("--user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 8_0_2 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) Version/8.0 Mobile/12A366 Safari/600.1.4"); //iPhone 4
				options.addArguments("--start-maximized");
				driver = new ChromeDriver(options);
		
		//driver.get("https://test.innroad.com/mbe/lakewoodlodge/property.aspx");
				
				//driver.get("https://paytm.com/");
				driver.get("https://www.youtube.com");
		//driver.findElement(By.id("mobileNumber")).sendKeys("99999978609");
		}

	}


