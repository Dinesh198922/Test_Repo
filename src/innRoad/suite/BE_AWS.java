package innRoad.suite;

import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import innRoad.config.BaseTest;
import innRoad.config.TestUtil;
import innRoad.config.Wait;
import innRoad.properties.OR;

public class BE_AWS extends BaseTest {
	
	 static String Unavailableimage = "Css/img/unavailable_day.png";
	 public String get_Checkin;
	 public String get_Checkout;
	 public String get_Month;
	 public String get_Year;
	 public String Get_Room_Charges;
	 public String Get_Tax;
	 public String Get_Total_Charges;

	  @Test(dataProvider = "testParameterData")
	  public void testUntitled(String URL ,String Https, String TCN, String Get_Title_Name, String ArrivalDate, String DepartureDate, String Adultcount, String childrenscount,
	  String Get_Available_Rooms, String StayModifymessage, String propertyName, String Room_Name, String Packageincrcount
			  ) throws Exception {
		  
		  
		  setupBeforeSuite(TCN);
		  
		  fillLogin(URL);
		  verifyURL(Https);
		  
		  
		  
		  String Get_Title=d.findElement(By.xpath("//div[@class='booking_pages_heading']")).getText();
		  Assert.assertEquals(Get_Title.trim(), Get_Title_Name);
		  
		  
		  
		  Wait.wait10Second();
		  
		  if(d.findElement(By.xpath("//*[@id='divNonGroup']/div/div[4]/div[5]/span")).isDisplayed())
		  {
			  d.findElement(By.xpath("//*[@id='divNonGroup']/div/div[4]/div[5]/span")).click();
			  Wait.wait10Second();
			  
			  String Getting_Block_Dates = "\""+Unavailableimage+"\"";
			  String Getting_Block_Date = "("+Getting_Block_Dates+")"; 
			 List<WebElement> Created_Block_Dates_Size = d.findElements(By.xpath("//div[@style='background-image: url"+Getting_Block_Date+";']"));
			 List<WebElement> ClickableDays = d.findElements(By.xpath("//div[@class='onlyDate clickableDays']"));
			 
			 
			 for(int j =0;j<Created_Block_Dates_Size.size();j++)
			 {
				 
				String x = Created_Block_Dates_Size.get(j).getText();
				System.out.println( x.indexOf(Created_Block_Dates_Size.get(j).getText()));
			 }
			 
			 /*for(int i=0; i<ClickableDays.size();i++)
			 {
				 String day = ClickableDays.get(i).getText().split("\n")[0];
				 
				 for(int j =0;j<Created_Block_Dates_Size.size();j++)
				 {
					// System.out.println(Created_Block_Dates_Size.get(j).getText());
					 
					if(Created_Block_Dates_Size.get(j).getText() != day)
					{
						System.out.println(Created_Block_Dates_Size.get(j).getText() != day);
						System.out.println(day);
					}
				 }		
			 }*/
			 
			 
			/* for(int i =0;i<Created_Block_Dates_Size.size();i++)
			 {
				System.out.println(Created_Block_Dates_Size.get(i).getText());
				 
			 }
			 
			 for(int i=1; i<=ClickableDays.size();i++)
			 {
				 if(ClickableDays.get(i).getText().equals(Created_Block_Dates_Size.get(i).getText()))
				 {
					 System.out.println(i);
				 }
			 }*/
			  
			 /// int x = d.findElements(By.xpath("//div[@style='background-image: url("Css/img/unavailable_day.png");']")).size();
			  
			  
			
			  
			 // int x = d.findElements(By.xpath("//div[@style='background-image: url("Css/img/unavailable_day.png"); background-color: rgb(255, 255, 255);']")).s
			  
			//  System.out.println(Created_Block_Dates_Size);
			  
			  
			  SelectingDates(ArrivalDate,DepartureDate);
			  
			  get_Checkin =d.findElement(By.xpath("//div[@class='checkin_checkout_strip']/div[2]/span[2]/span")).getText();
			  get_Checkout =d.findElement(By.xpath("//div[@class='checkin_checkout_strip']/div[3]/span[2]/span")).getText();
			  get_Month = d.findElement(By.xpath("//span[@class='selectedServiceMonth']")).getText();
			  get_Year =d.findElement(By.xpath("//span[@class='selectedServiceYear']")).getText();
			  
			  Adcount = Integer.parseInt(Adultcount);
			
			for(int i=1; i<= Adcount-1; i++)
			{
				d.findElement(By.xpath("//a[@class='incRoomCount flL grayGradient'] [@data-bind='click: incAdults']")).click();
				Wait.wait2Second();
			}
			
			int ChildCount = Integer.parseInt(childrenscount);
			 
			for(int i=1; i<= ChildCount; i++)
			{
			d.findElement(By.xpath("//a[@class='incRoomCount flL grayGradient'] [@data-bind='click: incChildren']")).click();
			Wait.wait2Second();
			}
			
			d.findElement(By.xpath("//*[@id='AvailabilitySearch1_btnAvailabilitySearch']")).click();
			Wait.wait2Second();
			 
			 }
		  else
		  {
			  System.out.println("Flexiable Dates link is not dsiplayed");
		  }
		  
		  
		  
		  String Get_Available_Rooms_Title=d.findElement(By.xpath("//div[@class='booking_pages_heading']")).getText();
		  Assert.assertEquals(Get_Available_Rooms_Title.trim(), Get_Available_Rooms);
		  verifyURL(Https);
		  
		  if(d.findElement(By.xpath("//*[@id='hrefModifyProperty']")).isDisplayed())
		  {	  
		  d.findElement(By.xpath("//*[@id='hrefModifyProperty']")).click();
		  Wait.wait10Second();
		  String Get_staymodify_message=d.findElement(OR.stay_modify_link).getText();
		  Assert.assertEquals(Get_staymodify_message, StayModifymessage);
		  d.findElement(OR.stay_Modify_No).click();
		  Wait.wait3Second();
		  d.findElement(By.id("hrefModifyProperty")).click();
		  Wait.wait5Second();
		  Assert.assertEquals(StayModifymessage, Get_staymodify_message);
		  d.findElement(OR.stay_modify_Yes).click();
		  Wait.wait15Second();
		  String pagetitle=d.getTitle();
		  Assert.assertEquals(Get_Title.trim(), Get_Title_Name);
		  }
		  else
		  {
			  System.out.println("Modify link is not displayed");
		  }
		  
		
		  Assert.assertEquals(d.findElement(By.xpath("//div[@class='checkin_checkout_strip']/div[2]/span[2]/span")).getText(), get_Checkin);
		  Assert.assertEquals(d.findElement(By.xpath("//div[@class='checkin_checkout_strip']/div[3]/span[2]/span")).getText(), get_Checkout);
		//  Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_txtAdults']")).getAttribute("vaule"), Adultcount);
		//  Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_txtChildren']")).getAttribute("vaule"), childrenscount);
		  
		  d.findElement(By.xpath("//*[@id='AvailabilitySearch1_btnAvailabilitySearch']")).click();
		  Wait.wait15Second();
		
		  
		  String[] split_Get_Checkin =get_Checkin.split(",");
		  String[] split_Get_Checkout =get_Checkout.split(",");
	
		  String[] Split_date_Checkin= split_Get_Checkin[1].split(" ");
		 
		  String[] Split_Date_Checkout=split_Get_Checkout[1].split(" ");
		
		 
		Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_chkInPanel']/fieldset/legend")).getText().trim(), "CHECK IN");
		Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_chkOutPanel']/fieldset/legend")).getText().trim(), "CHECK OUT");
		Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkInMonthAndYear']")).getText().trim(), get_Month+"'16");
		Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkInDayOfTheWeek']")).getText().trim(), split_Get_Checkin[0].trim());
		Assert.assertEquals(d.findElement(By.xpath(".//*[@id='AvailabilitySearch1_lbkChkInDate']")).getText().trim(), Split_date_Checkin[2].trim());
		Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkOutMonthAndYear']")).getText().trim(), get_Month+"'16");
		Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkOutDayOfTheWeek']")).getText().trim(), split_Get_Checkout[0].trim());
		Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lbkChkOutDate']")).getText().trim(), Split_Date_Checkout[2].trim());
		Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblPropertyName']")).getText().trim(),propertyName);
		
		 int ArrivalDates = Integer.parseInt(ArrivalDate);
		   int DepartureDates = Integer.parseInt(DepartureDate);
		   int Num_of_Nights=ArrivalDates-DepartureDates;
		   System.out.println("Num_of_Nights:"+Num_of_Nights);
		   String Cov_int_to_String=Integer.toString(Num_of_Nights);
		   System.out.println("Cov_int_to_String:"+Cov_int_to_String);
		   String spliting_Minus=Cov_int_to_String.substring(1);
		   System.out.println("spliting_Minus:"+spliting_Minus);
		   int value = Integer.parseInt(spliting_Minus);
		   
		   if(value>1)
		   {
			   String Numofnights=d.findElement(OR.Rooms_Num_of_Nights).getText();
			   System.out.println("Numofnights:"+Numofnights);
			   String Exp_Number_of_Nights=spliting_Minus+" "+"Nights";
			   System.out.println("Exp_Number_of_Nights:"+Exp_Number_of_Nights);
			   Assert.assertEquals(Numofnights, Exp_Number_of_Nights);
		   }
		   else
		   {
			   String Numofnights=d.findElement(OR.Rooms_Num_of_Nights).getText();
			   System.out.println("Numofnights:"+Numofnights);
			   String Exp_Number_of_Nights=spliting_Minus+" "+"Night";
			   System.out.println("Exp_Number_of_Nights:"+Exp_Number_of_Nights);
			   Assert.assertEquals(Numofnights, Exp_Number_of_Nights);
		   }
		
	    String Get_Rate_Name=d.findElement(By.xpath("//span[@class='room_grid_rateplanname']")).getText().trim();
	    d.findElement(By.xpath("//*[@id='lnkMoreInfo']")).click();
	    Wait.wait3Second();
	    Assert.assertEquals(d.findElement(By.xpath("//*[@id='TB_ajaxWindowTitle']")).getText().trim(), Get_Rate_Name);
	    d.findElement(By.xpath("//*[@id='TB_closeWindowButton']")).click();
	    Wait.wait3Second();
	    
	    String get_Room_Rate =d.findElement(By.xpath("//td[@id='MainContent_rptrPropertyList_rptPropertyRooms_0_tdRateDescription_0']/span")).getText();
	    String[] Split_Dollar= get_Room_Rate.split("$");
	    Assert.assertEquals(d.findElement(By.xpath("//*[@id='MainContent_rptrPropertyList_lblMinRate_0']")).getText().trim(), get_Room_Rate);
	    d.findElement(By.xpath("//*[@id='MainContent_rptrPropertyList_rptPropertyRooms_0_btnSelect_0']")).click();
	    Wait.wait10Second();
	    
	    if(d.findElement(By.xpath("//div[@class='booking_pages_heading']/span[1]")).isDisplayed())
	    {
	    	Assert.assertEquals(d.findElement(By.xpath("//div[@class='booking_pages_heading']/span[1]")).getText().trim(), "Enhance Your Stay");
	    	 verifyURL(Https);
	    	 
	    	  /*String[] split_Get_Checkin =get_Checkin.split(",");
			  String[] split_Get_Checkout =get_Checkout.split(",");
		
			  String[] Split_date_Checkin= split_Get_Checkin[1].split(" ");
			 
			  String[] Split_Date_Checkout=split_Get_Checkout[1].split(" ");*/
			
			 
			Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_chkInPanel']/fieldset/legend")).getText().trim(), "CHECK IN");
			Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_chkOutPanel']/fieldset/legend")).getText().trim(), "CHECK OUT");
			Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkInMonthAndYear']")).getText().trim(), get_Month+"'16");
			Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkInDayOfTheWeek']")).getText().trim(), split_Get_Checkin[0].trim());
			Assert.assertEquals(d.findElement(By.xpath(".//*[@id='AvailabilitySearch1_lbkChkInDate']")).getText().trim(), Split_date_Checkin[2].trim());
			Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkOutMonthAndYear']")).getText().trim(), get_Month+"'16");
			Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkOutDayOfTheWeek']")).getText().trim(), split_Get_Checkout[0].trim());
			Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lbkChkOutDate']")).getText().trim(), Split_Date_Checkout[2].trim());
			
			
			Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblRoomType']")).getText().trim(), Room_Name);

	    	 	 
	    	 d.findElement(By.xpath("//*[@id='hrefModifyProperty']")).click();
			 Wait.wait10Second();
			 
			 Assert.assertEquals(d.findElement(By.xpath("//div[@class='checkin_checkout_strip']/div[2]/span[2]/span")).getText(), get_Checkin);
			  Assert.assertEquals(d.findElement(By.xpath("//div[@class='checkin_checkout_strip']/div[3]/span[2]/span")).getText(), get_Checkout);
			  d.findElement(By.xpath("//*[@id='AvailabilitySearch1_btnAvailabilitySearch']")).click();
			  Wait.wait15Second();
			  d.findElement(By.xpath("//*[@id='MainContent_rptrPropertyList_rptPropertyRooms_0_btnSelect_0']")).click();
			  Wait.wait15Second();
			  
			  d.findElement(By.xpath("//*[@id='hrefModifyRoomClass']")).click();
			  Wait.wait10Second();
			  String Get_staymodify_message=d.findElement(OR.stay_modify_link).getText();
			  Assert.assertEquals(Get_staymodify_message, StayModifymessage);
			  d.findElement(OR.stay_Modify_No).click();
			  Wait.wait3Second();
			  d.findElement(By.xpath("//*[@id='hrefModifyRoomClass']")).click();
			  Wait.wait5Second();
			  Assert.assertEquals(StayModifymessage, Get_staymodify_message);
			  d.findElement(OR.stay_modify_Yes).click();
			  Wait.wait15Second();
			  d.findElement(By.xpath("//*[@id='MainContent_rptrPropertyList_rptPropertyRooms_0_btnSelect_0']")).click();
			  Wait.wait15Second();
			  
			  Get_Room_Charges= d.findElement(By.xpath("//*[@id='FolioSummary1_lblResRoomCharges']")).getText();
			  Get_Tax = d.findElement(By.xpath("//*[@id='FolioSummary1_lblResTaxSurcharge']")).getText();
			  
			  int Get_Room_Charges_int = Integer.parseInt(Get_Room_Charges);
			  int Get_Tax_int = Integer.parseInt(Get_Tax);
			  Get_Total_Charges =d.findElement(By.xpath("//*[@id='FolioSummary1_lblResTotalCharges']")).getText();
			  
			  int Total_charge_Cal = Get_Room_Charges_int+Get_Tax_int;
			  String Total_Charges = Total_charge_Cal+"";
			  Assert.assertEquals(d.findElement(By.xpath("//*[@id='FolioSummary1_lblResTotalCharges']")).getText(), Total_Charges);
			  
			  d.findElement(By.xpath("//*[@id='OpenRatesDialog']")).click();
			  Wait.wait2Second();
			  d.findElement(By.xpath("//*[@id='TB_closeWindowButton']")).click();
			  Wait.wait2Second();
			  
			  int package_Incer_Count=Integer.parseInt(Packageincrcount);
			     for(int i=1;i<=package_Incer_Count;i++)
			     {
			     d.findElement(OR.Package_incr).click();
			     Wait.wait2Second();
			     }
			  
			     d.findElement(By.xpath("//*[@id='MainContent_imgbContinueReservation']")).click();
			     Wait.wait10Second();	
			     
			     
			        Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_chkInPanel']/fieldset/legend")).getText().trim(), "CHECK IN");
					Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_chkOutPanel']/fieldset/legend")).getText().trim(), "CHECK OUT");
					Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkInMonthAndYear']")).getText().trim(), get_Month+"'16");
					Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkInDayOfTheWeek']")).getText().trim(), split_Get_Checkin[0].trim());
					Assert.assertEquals(d.findElement(By.xpath(".//*[@id='AvailabilitySearch1_lbkChkInDate']")).getText().trim(), Split_date_Checkin[2].trim());
					Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkOutMonthAndYear']")).getText().trim(), get_Month+"'16");
					Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkOutDayOfTheWeek']")).getText().trim(), split_Get_Checkout[0].trim());
					Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lbkChkOutDate']")).getText().trim(), Split_Date_Checkout[2].trim());
					
					Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblRoomType']")).getText().trim(), Room_Name);
					
					
					 d.findElement(By.xpath("//*[@id='hrefModifyPackage']")).click();
					 Wait.wait5Second();
					 String Get_staymodify_message1=d.findElement(OR.stay_modify_link).getText();
					  Assert.assertEquals(Get_staymodify_message1, StayModifymessage);
					  d.findElement(OR.stay_Modify_No).click();
					  Wait.wait3Second();
					  d.findElement(By.xpath("//*[@id='hrefModifyRoomClass']")).click();
					  Wait.wait5Second();
					  Assert.assertEquals(StayModifymessage, Get_staymodify_message1);
					  d.findElement(OR.stay_modify_Yes).click();
					  Wait.wait15Second();
					  int package_Incer_Count1=Integer.parseInt(Packageincrcount);
					     for(int i=1;i<=package_Incer_Count1;i++)
					     {
					     d.findElement(By.xpath("//*[@id='btnPachageDecrease']")).click();
					     Wait.wait2Second();
					     }
					 
					     d.findElement(By.xpath("//*[@id='MainContent_imgbContinueReservation']")).click();
					     Wait.wait10Second();
					     
					     
					     
					     
					     
					     
					     
					     
			     
			     
			     
	    }
	    else
	    {
	    	System.out.println("Skipped Enhance your stay");
	    	
	    	 Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_chkInPanel']/fieldset/legend")).getText().trim(), "CHECK IN");
				Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_chkOutPanel']/fieldset/legend")).getText().trim(), "CHECK OUT");
				Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkInMonthAndYear']")).getText().trim(), get_Month+"'16");
				Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkInDayOfTheWeek']")).getText().trim(), split_Get_Checkin[0].trim());
				Assert.assertEquals(d.findElement(By.xpath(".//*[@id='AvailabilitySearch1_lbkChkInDate']")).getText().trim(), Split_date_Checkin[2].trim());
				Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkOutMonthAndYear']")).getText().trim(), get_Month+"'16");
				Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblChkOutDayOfTheWeek']")).getText().trim(), split_Get_Checkout[0].trim());
				Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lbkChkOutDate']")).getText().trim(), Split_Date_Checkout[2].trim());
				
				Assert.assertEquals(d.findElement(By.xpath("//*[@id='AvailabilitySearch1_lblRoomType']")).getText().trim(), Room_Name);
				
				
				 d.findElement(By.xpath("//*[@id='hrefModifyPackage']")).click();
				 Wait.wait5Second();
				 String Get_staymodify_message1=d.findElement(OR.stay_modify_link).getText();
				  Assert.assertEquals(Get_staymodify_message1, StayModifymessage);
				  d.findElement(OR.stay_Modify_No).click();
				  Wait.wait3Second();
				  d.findElement(By.xpath("//*[@id='hrefModifyRoomClass']")).click();
				  Wait.wait5Second();
				  Assert.assertEquals(StayModifymessage, Get_staymodify_message1);
				  d.findElement(OR.stay_modify_Yes).click();
				  Wait.wait15Second();
				  int package_Incer_Count1=Integer.parseInt(Packageincrcount);
				     for(int i=1;i<=package_Incer_Count1;i++)
				     {
				     d.findElement(By.xpath("//*[@id='btnPachageDecrease']")).click();
				     Wait.wait2Second();
				     }
				 
				     d.findElement(By.xpath("//*[@id='MainContent_imgbContinueReservation']")).click();
	    	
	    }
		
	    
		
		  
		  
		  
		  
	  }
	
	
	  
	  
	  @AfterClass
		public void stop() {
			setupAfterSuite();
			stopDriver();
		}

		@DataProvider(name = "testParameterData", parallel = false)
		public static Object[][] testParameterData(Method method) throws Exception {

			initialize();
			Object data[][] = TestUtil.getData(datatable_suite1, "BE_AWS");
			return data;
		}

}
