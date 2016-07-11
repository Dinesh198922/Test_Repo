package innRoad.suite;

import innRoad.properties.Config;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Pattern;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testng_Learning {
	
	static final ExtentReports extent = new ExtentReports("C:\\reports\\reports.html", true);
	
	@Test

	private static double round (double value, int precision) {
	    int scale = (int) Math.pow(10, precision);
	    return (double) Math.round(value * scale) / scale;
	    
	   }
	
	/*public void test1() {
		
		System.out.println("Reservation");
		 
		double a = 123.53698;
	    double roundOff = Math.round(a*100)/100;

	    System.out.println(roundOff);
		
		
		//double Tax_Cal = 1.25*6/100;
		
		float x = 1.256f;
		String sSelectivityRate = String.valueOf(x);
		
		String[] y = sSelectivityRate.split(Pattern.quote("."));
		
			int ss =y[1].length();
			
			
			double d = round(Double.parseDouble(y[1]), 2);
			
			System.out.println(" double " + d);
			
			System.out.println(ss);
			
			char[] cArray = y[1].toCharArray();
			
			if(cArray.length >= 3)
			{
				System.out.println(cArray[2]);
				
				if(cArray[2] > 4)
				{
					System.out.println("converstion " + ((int)(cArray[1] - '0') + 1));
					System.out.println("converstion " +(((int)(cArray[1] - '0') + 1)));
					
					int t = (((int)( cArray[1] - '0')) + 1);
					
					cArray[1] = Character.toTitleCase((char)t);
					
					
					System.out.println(cArray[1]);
				}
			}
		*/
			
		
		
		
	//}
	
	@Test
	public void test2() throws FindFailed{
		System.out.println("Check in");
		 String Unavailableimage = "Css/img/unavailable_day.png";
		 
     //   String y =   "("+""+""+""+Unavailableimage+""+""+""+")";
        
        String z = "\""+Unavailableimage+"\"";
		  
		String yu = "("+z+")";
		  
		 System.out.println(yu);
		  String theFirst = "Java Programming";
		  String ROM = "\"" + theFirst + "\"";
		  System.out.println(ROM);
		  
		 ExtentTest test = extent.startTest("asda", "Executing on AWS Server");
		 try
		 {
		 Assert.assertEquals("Dinesh", "dsxds");
		 }
		 catch(Exception e)
		 {
			 test.log(LogStatus.FAIL, "Fail due to missmatch");
			 test.addScreenCapture("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
			  
		 }
		  extent.endTest(test);
		  
		
		/*// 
		 double t1 = 3*10.25;
		 //System.out.println(t);
		 double t = 6*3*10.25*2;
		 NumberFormat formatter = new DecimalFormat("#0.00");
		 String x = formatter.format(t);
		 System.out.println("t:"+x);
		
		double a= Math.round(2.55*6);
		System.out.println(a);
		double b = a/100;
		System.out.println(a);
		System.out.println(b);
		
		String Packagename ="Test Package";
		String Packageincrcount ="2";
		 String actual_Packages_count=Packagename+"("+Packageincrcount+")";
		 
		 System.out.println("actual_Packages_count"+actual_Packages_count);*/
		
		
		/* double Tax_value = Double.parseDouble("10");
  	   double Tax_Services_Cal = Math.round(3.60*Tax_value);
  	   System.out.println("Tax_Services_Cal:"+Tax_Services_Cal);
  	   System.out.println("room_Rate*Tax_value:"+Math.round(3.60*Tax_value));
  	   double Tax_Services_Charges=Tax_Services_Cal/100;
  	   double dd=Tax_Services_Charges*5;
  	  String Final_Cal_Tax_Charges = Double.toString(dd);
  	   System.out.println("Tax_Services_Charges"+Tax_Services_Charges);
  	  // Assert.assertEquals(1.80, Final_Cal_Tax_Charges);
  	   
  	   System.out.println("---------------------------");
  	   
  	 double d = 2.48;
     DecimalFormat f = new DecimalFormat("##.00");
     System.out.println(f.format(d));
		
		/*double x = 18.00+1.80;
		 NumberFormat formatter = new DecimalFormat("#0.00");
		 String t = formatter.format(x);
		System.out.println(t);*/
		
		/*int x = (int) (5*4*23.20);
		System.out.println(x);*/
		
		/*int d = (int) 580.0;
	     DecimalFormat f = new DecimalFormat("##");
	     System.out.println(f.format(d));
		*/
		
		/*System.out.println(NumberFormat.getNumberInstance(Locale.US).format(999));*/
		
		System.out.println(NumberFormat.getIntegerInstance().format(1000.00));
	}
	
	@Test
	public void test3(){
		System.out.println("Check Out");
		
	}
	
	@BeforeMethod
	
	public void beforeMethod() {
		
		System.out.println("Login");
		
	}
	
	@AfterMethod
	
   public void afterMethod() {
		
		System.out.println("Logout");
		
	}
	
	@BeforeTest
	
	

	   public void beforeTest() {
			
			System.out.println("DatabaseConnection");
			
		}
	
	
	@org.testng.annotations.AfterTest
	
	 public void AfterTest() {
		extent.flush();
			System.out.println("Dissconnect");
			
		}

}
