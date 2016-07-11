package innRoad.suite;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import innRoad.config.BaseTest;
import innRoad.config.TestUtil;
import innRoad.config.Wait;
import innRoad.properties.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AWS_BE_Automation extends BaseTest {
		
		static final ExtentReports extent = new ExtentReports("C:\\reports\\reports.html", false);
		
		public String Weekday;
		
		public String GetCheckintext;
		
		public String GetCheckinDate;
		
		public String GetCheckouttext;
		
		public String GetCheckoutDate;
		
		public int Adcount;
		
		 public String Get_Room_Name;
		 
		 public String spliting_Minus;
		 
		 public String Room_Charge_Cal;
		 
		 public String Get_Tax_Charges;
		 
		 public String Total_Charges;
		 
		 public int Number_of_rooms;
		 
		 public int latestadult_Count;
		 
		 public double room_Rate;
		 
		 public String Final_Cal_Tax_Charges;
		 
		 public double Total_Charges_Cal;
		 
		 public String Package_Cal_Count;
		 
		 public String Final_Reservation_Number;
		 
		 public String Adults_Count_Verification;
		 
		 public double Get_Tax_Charge;
		 
		 public double Room_Charge;
		 
		 public String Room_Charges;
		 
		 
		
		
		
		
		
		  @Test(dataProvider = "testParameterData")
		  public void testUntitled( String URL,String Https,String TCN, String PageTitle,String Month, String ArrivalDate, String DepartureDate, String Adultcount, String childrenscount,
				  
				  
				  String Promocode, String Promotionvalue, String Room_PageTitle, String Test_Mode_Verification,String StayDetailsmodify, String StayModifymessage,String month2,
				  String ModifyAdult, String ModifyChild,String propertyName, String RackRateTitle,
				  String GetRateName, String GetpolicyName,String RoomClassName,String Rate, String RoomsPackageModify, String CurrencyType, String RoomRate,String PackageRate, String PackageName,
				  String PackageDes, String Packageincrcount, String TaxValue, String GuestDetailsTitle, String Email, String FirstName, String LastName, String PhnNumber, String Address1,
				  String Address2, String City, String State, String Zip, String Country, String IsBilling, String BillingFname, String BillingLName, String BillingPhn, String BillingEmail,
				  String BillingAddress1, String BillingAddress2, String BillingCity, String BillingState, String BillingZip,String BillingCountry, String CardType,
				  String CardNumber, String ExpriyMonth, String ExpriyYear, String CVV, String SpecialInstructionText, String ReferralText, String Review_Guest_Name, String Review_Phn_Number,
				  String Review_Billing_Guest_Name, String Review_Billing_Phn_Number,String Review_Card_Type, String Review_Expiry_Date,String Review_CVV_Code, String Modify_Email, String Modify_FirstName,
				  String Modify_LastName, String Modify_PhnNumber, String Modify_Address1, String Modify_Address2, String Modify_City, String Modify_State, String Modify_Zip, String Modify_Country,
				  String Modify_IsBilling, String Modify_BillingFname, String Modify_BillingLName, String Modify_BillingPhn, String Modify_BillingEmail, String Modify_BillingAddress1, String Modify_BillingAddress2,
				  String Modify_BillingCity, String Modify_BillingState, String Modify_BillingZip, String Modify_BillingCountry,String Modify_CardType, String Modify_CardNumber, String Modify_ExpriyMonth, String Modify_ExpriyYear, String Modify_CVV, String Modify_Review_Guest_Name, String Modify_Review_Phn_Number,
				  String Modify_Review_Billing_Guest_Name, String Modify_Review_Billing_Phn_Number, 
				  String Modify_Review_Card_Type, String Modify_Review_Expiry_Date, String Modify_Review_CVV_Code
				  
				  
				  
				  ) throws Exception {
			 
			  
			  setupBeforeSuite(TCN);
			  
			  ExtentTest test = extent.startTest(TCN, "Executing on AWS Server");
			  
			  try
			  {
			  fillLogin(URL);
			  test.log(LogStatus.PASS, "Driver opens and loads application Successfully");
			  Assert.assertEquals("Dinesh", "dsxds");
			  
			  verifyURL(Https);
			  test.log(LogStatus.PASS, "Verified Https in the URL");
			  testresultdata.put("2", new Object[] { 1d,
		              "TC1 - Verify site loaded or not ",
		              "System sucessfully navigate to the Site", "Pass" }); }
			  
			  catch (Throwable t) {
				  test.log(LogStatus.FAIL, "Fail due to missmatch");
				  test.addScreenCapture("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
				  
	              testresultdata.put("2", new Object[] { 1d,
			      "TC1 - Verify site loaded or not",
			      "System Failed to navigate to the site", "Fail" });
	           }
			  
			  
			  
			  // Verifying page title
			  
			  try
			  {
				  
			  String pagetitle=d.getTitle();
			  test.log(LogStatus.INFO, "Getting Page Title from the application");
			  Assert.assertEquals(PageTitle, pagetitle);
			  test.log(LogStatus.PASS, "Comparing the title of the page");
				  
				  testresultdata.put("3", new Object[] { 2d,
			              "TC2 - Verify page title ",
			              "Page title verification Successfully", "Pass" }); }
			  catch
			  (Throwable t) {
				  test.log(LogStatus.PASS, "Comparing the title of the page");
	              testresultdata.put("3", new Object[] { 2d,
			      "TC2 - Verify page title",
			      "System Failed to verify page title", "Fail" });
	           }
			  
			  
			  //Selecting arrival Dates
			  
			  try
			 {
			  selectingMonth(Month);
			  test.log(LogStatus.PASS, "System Successfully selected date from the calendar");
			  SelectingDates(ArrivalDate,DepartureDate);
			  test.log(LogStatus.PASS, "System Successfully selected ArrivalDate and DepartureDate from the calendar  ");
			    GetCheckintext = d.findElement(OR.Getcheckintext).getText();
				GetCheckinDate = d.findElement(OR.GetCheckinDates).getText();
				GetCheckouttext= d.findElement(OR.GetCheckouttext).getText();
				GetCheckoutDate= d.findElement(OR.GetCheckoutDate).getText();
				 test.log(LogStatus.INFO, "Getting checkin and Checkout text after selecting arriavl and Departure dates for further verification");
				 System.out.println(GetCheckintext +GetCheckinDate+ GetCheckouttext + GetCheckoutDate );
			  testresultdata.put("4", new Object[] { 3d,
	              "TC3 - Verify whether user able to select arrivalDate and Departuredate ",
	              "System should allow user to select arrival and departure dates", "Pass" }); }
		     catch(Throwable t) {
		    	 test.log(LogStatus.PASS, "System Successfully selected ArrivalDate and DepartureDate from the calendar  ");
	         testresultdata.put("4", new Object[] { 3d,
		      "TC3 - Verify whether user able to select arrival and Departuredate",
		      "User Failed to select arrival and departure dates", "Fail" });
	     }
			  
			  
			  
			  //Select Adults and childrens 
			  
			 try
				{
				
				Adcount = Integer.parseInt(Adultcount);
				  test.log(LogStatus.INFO, "Converting Adult count from string to integer, in ordre to pass this value in for loop");
				for(int i=1; i<= Adcount-1; i++)
				{
					//d.findElement(By.xpath("//a[@class='incRoomCount flL grayGradient'] [@data-bind='click: incAdults']")).click();
					 test.log(LogStatus.PASS, "System Successfully added the adult count");
					Wait.wait2Second();
				}
				testresultdata.put("5", new Object[] { 4d,
			              "TC4 - Verify whether user able to select adultcount ",
			              "System should allow user to select adultcount", "Pass" }); }
			  catch
			  (Throwable t) {
				  test.log(LogStatus.PASS, "System Successfully added the adult count");
		          testresultdata.put("5", new Object[] { 4d,
			      "TC4 - Verify whether user able to select adultcount",
			      "User Failed to select Adultcount", "Fail" });
		       }
			  
			  
			  try
				{
			
				  int ChildCount = Integer.parseInt(childrenscount);
				  test.log(LogStatus.INFO, "Converting Child count from string to integer, in ordre to pass this value in for loop");
				for(int i=1; i<= ChildCount; i++)
				{
				d.findElement(By.xpath("//a[@class='incRoomCount flL grayGradient'] [@data-bind='click: incChildren']")).click();
				 test.log(LogStatus.PASS, "System Successfully added the Child count");
				Wait.wait2Second();
				}
				testresultdata.put("6", new Object[] { 5d,
			              "TC5 - Verify whether user able to select childrens",
			              "System should allow user to select childrens", "Pass" }); }
			  catch
			  (Throwable t) {
				  test.log(LogStatus.PASS, "System Successfully added the Child count");
		          testresultdata.put("6", new Object[] { 5d,
			      "TC5 - Verify whether user able to select childrens",
			      "User failed to select childrenscount ", "Fail" });
		       }
			  
			  
			  //Checkavailability
			  
			  try
			  {
				  d.findElement(By.xpath("//*[@id='AvailabilitySearch1_btnAvailabilitySearch']")).click();
				  Wait.wait15Second();
				  test.log(LogStatus.PASS, "System Successfully clicked on Check availability button");
			  testresultdata.put("7", new Object[] { 6d,
		              "TC7 - Verify by clicking on Check availability",
		              "User able to click check availability", "Pass" }); }
		  catch
		  (Throwable t) {
			  test.log(LogStatus.PASS, "System Successfully clicked on Check availability button");
	          testresultdata.put("7", new Object[] { 6d,
		      "TC7 - Verify by clicking on Check availability",
		      "User unable to click check availability", "Fail" });
	       }
			  
			  
			  //Select Rooms page
			  
				 // Verify page title
				  
				  try
				  {
					  
				  String Room_Page_Title=d.getTitle();
				  test.log(LogStatus.INFO, "Getting Title from Select Rooms page");
				  System.out.println(Room_Page_Title);
				  Assert.assertEquals(Room_PageTitle, Room_Page_Title);
				  test.log(LogStatus.PASS, "System Successfully verified Page title of the select Room class page");
				  verifyURL(Https);
				  test.log(LogStatus.PASS, "System Successfully verified https in the url in Select Rooms Class page");
					  
					  testresultdata.put("8", new Object[] { 7d,
				              "TC8 - Verify page title and Https for Select Rooms page ",
				              "Page title and https verification Successfully", "Pass" }); }
				  catch
				  (Throwable t) {
					  test.log(LogStatus.PASS, "System Successfully verified Page title of the select Room class page");
		              testresultdata.put("8", new Object[] { 7d,
				      "TC8 - Verify page title and https for Select Rooms page",
				      "System Failed to verify page title and https", "Fail" });
		           }
				  
				  
				  //Verifying stay details in Select Room page
				  
					 try
					 {
					  //Checkin date
					  String Checkindate = d.findElement(OR.Rooms_Checkin_Date).getText();
					  test.log(LogStatus.INFO, "Getting Check in Date from the application");
					  String[] Get_Arrival_Date= GetCheckinDate.split(",");
					  test.log(LogStatus.INFO, "Spliting the text by comma");
					  String[] Get_Arrival_Date2=Get_Arrival_Date[1].trim().split(" ");
					  test.log(LogStatus.INFO, "Getting the actual value which need to verify the checkin date");
					  try
					  {
					  Assert.assertEquals(Checkindate, Get_Arrival_Date2[1]);
					  test.log(LogStatus.PASS, "System Successfully verified checkindate");
					  }
					  catch(Throwable t)
					  {
						  test.log(LogStatus.PASS, "System Successfully verified checkindate");
					  }
					  
					  //Checkout date
					  String Checkoutdate = d.findElement(OR.Rooms_Checkout_Date).getText();
					  test.log(LogStatus.INFO, "Getting Check out Date from the application");
					  String[] Get_Depature_Date=GetCheckoutDate.split(",");
					  test.log(LogStatus.INFO, "Spliting the text by comma");
					  String[] Get_Depature_Date2=Get_Depature_Date[1].trim().split(" ");
					  test.log(LogStatus.INFO, "Getting the actual value which need to verify the checkin date");
					  try
					  {
					  Assert.assertEquals(Checkoutdate, Get_Depature_Date2[1]);
					  test.log(LogStatus.PASS, "System Successfully verified checkoutdate");
					  }
					  catch(Throwable t)
					  {
						  test.log(LogStatus.PASS, "System Successfully verified checkoutdate"); 
					  }
					  
					  
					  
					  //Checkin Week
					  
					  String checkinWeek = d.findElement(OR.Rooms_Checkin_Week).getText();
					  test.log(LogStatus.INFO, "Getting Checkin week from the application");
					  String GetCheckinWeek = Get_Arrival_Date[0];
					  try
					  {
					  Assert.assertEquals(checkinWeek, GetCheckinWeek);
					  test.log(LogStatus.PASS, "System Successfully verified checkin weekday");
					  }
					  catch(Throwable t)
					  {
						  test.log(LogStatus.PASS, "System Successfully verified checkin weekday");
					  }
					  
					  //Checkout Week
					  
					  String CheckoutWeek = d.findElement(OR.Rooms_Checkout_Week).getText();
					  test.log(LogStatus.INFO, "Getting Checkout week from the application");
					  String GetCheckoutWeek = Get_Depature_Date[0];
					  try
					  {
					  Assert.assertEquals(CheckoutWeek, GetCheckoutWeek);
					  test.log(LogStatus.PASS, "System Successfully verified checkout weekday");
					  }
					  catch(Throwable t)
					  {
						  test.log(LogStatus.PASS, "System Successfully verified checkout weekday");
					  }
					  
					  //Checkin Month and Year
					  
					  String Checkin_Mon_Year=d.findElement(OR.Rooms_Checkin_Mon_Year).getText();
					  test.log(LogStatus.INFO, "Getting Checkin month and year from the application");
					  String Split_Year_Checkin=Get_Arrival_Date[2].trim().substring(2);
					  String Exp_Checkin_Mon_Year=Get_Arrival_Date2[0]+"'"+Split_Year_Checkin;
					  try
					  {
					  Assert.assertEquals(Checkin_Mon_Year, Exp_Checkin_Mon_Year);
					  test.log(LogStatus.PASS, "System Successfully verified checkin month and year");
					  }
					  catch(Throwable t)
					  {
						  test.log(LogStatus.PASS, "System Successfully verified checkin month and year");
					  }
					  
					  
					  //Checkout Month and Year
					  
					  String Checkout_Mon_Year=d.findElement(OR.Rooms_Checkout_Mon_Year).getText();
					  test.log(LogStatus.INFO, "Getting Checkout month and year from the application");
					  String Split_Year_Checkout=Get_Depature_Date[2].trim().substring(2);
					  String Exp_Checkout_Mon_Year=Get_Depature_Date2[0]+"'"+Split_Year_Checkout;
					  try
					  {
					  Assert.assertEquals(Checkout_Mon_Year, Exp_Checkout_Mon_Year);
					  test.log(LogStatus.PASS, "System Successfully verified checkout month and year");
					  }
					  catch(Throwable t)
					  {
						  test.log(LogStatus.PASS, "System Successfully verified checkout month and year");
					  }
					  
					  
					  //Check In and Check out text
					  
					  String Checkin_Text=d.findElement(OR.Rooms_Checkin_Text).getText();
					  String Checkout_Text=d.findElement(OR.Rooms_Checkout_Text).getText();
					  Assert.assertEquals(Checkin_Text, "CHECK IN");
					  Assert.assertEquals(Checkout_Text, "CHECK OUT");
					  
					  
					  //Property Name
					   String Property_Name=d.findElement(OR.Rooms_Property_Name).getText();
					   test.log(LogStatus.INFO, "Getting Property Namefrom the application");
					   try
					   {
					   Assert.assertEquals(Property_Name, propertyName);
					   test.log(LogStatus.PASS, "System successfully verified Property name");
					   }
					   catch(Throwable t)
						  {
						   test.log(LogStatus.PASS, "System successfully verified Property name");
						  }
					   
					   //Number of nights
					   
					   int ArrivalDates = Integer.parseInt(ArrivalDate);
					   int DepartureDates = Integer.parseInt(DepartureDate);
					   int Num_of_Nights=ArrivalDates-DepartureDates;
					   System.out.println("Num_of_Nights:"+Num_of_Nights);
					   String Cov_int_to_String=Integer.toString(Num_of_Nights);
					   System.out.println("Cov_int_to_String:"+Cov_int_to_String);
					   spliting_Minus=Cov_int_to_String.substring(1);
					   System.out.println("spliting_Minus:"+spliting_Minus);
					   int value = Integer.parseInt(spliting_Minus);
					   
					   if(value>1)
					   {
						   String Numofnights=d.findElement(OR.Rooms_Num_of_Nights).getText();
						   System.out.println("Numofnights:"+Numofnights);
						   String Exp_Number_of_Nights=spliting_Minus+" "+"Nights";
						   test.log(LogStatus.INFO, "Counting number of Nights based on arrival and Departure dates");
						   System.out.println("Exp_Number_of_Nights:"+Exp_Number_of_Nights);
						   try
						   {
						   Assert.assertEquals(Numofnights, Exp_Number_of_Nights);
						   test.log(LogStatus.PASS, "System successfully verified number of Nights");
						   }
						   catch(Throwable t)
							  {
							   test.log(LogStatus.PASS, "System successfully verified number of Nights");
							  }
					   }
					   else
					   {
						   String Numofnights=d.findElement(OR.Rooms_Num_of_Nights).getText();
						   System.out.println("Numofnights:"+Numofnights);
						   String Exp_Number_of_Nights=spliting_Minus+" "+"Night";
						   System.out.println("Exp_Number_of_Nights:"+Exp_Number_of_Nights);
						   test.log(LogStatus.INFO, "Counting number of Nights based on arrival and Departure dates");
						   try
						   {
						   Assert.assertEquals(Numofnights, Exp_Number_of_Nights);
						   test.log(LogStatus.PASS, "System successfully verified number of Nights");
						   }
						   catch(Throwable t)
						   {
							   test.log(LogStatus.PASS, "System successfully verified number of Nights");
						   }
					   }
					   
					   //Number of Adults and and childs
					   
					   int Cov_int_Adult = Integer.parseInt(Adultcount);
					   
					   if(Cov_int_Adult>1)
					   {
						   String GetAdchild=d.findElement(OR.Rooms_Adchild).getText();
						   String[] Split_Adults_Childs=GetAdchild.split(",");
						   String Adults_Count_Verification= Adultcount+" "+ "Adults";
						   try
						   {
						   Assert.assertEquals(Split_Adults_Childs[0].trim(), Adults_Count_Verification);
						   test.log(LogStatus.PASS, "System successfully verified selected adult count");
						   }
						   catch(Throwable t)
						   {
							   test.log(LogStatus.PASS, "System successfully verified selected adult count");
						   }
						   
					   }
					   else
					   {
						   String GetAdchild=d.findElement(OR.Rooms_Adchild).getText();
						   String[] Split_Adults_Childs=GetAdchild.split(",");
						   String Adults_Count_Verification= Adultcount+" "+ "Adult";
						   try
						   {
						   Assert.assertEquals(Split_Adults_Childs[0].trim(), Adults_Count_Verification);
						   test.log(LogStatus.PASS, "System successfully verified selected adult count");
						   }
						   catch(Throwable t)
						   {
							   test.log(LogStatus.PASS, "System successfully verified selected adult count");
						   }
					   }
					   
					  int cov_int_Child= Integer.parseInt(childrenscount);
					  
					  if(cov_int_Child>1)
					   {
						   String GetAdchild=d.findElement(OR.Rooms_Adchild).getText();
						   String[] Split_Adults_Childs=GetAdchild.split(",");
						   String Adults_Count_Verification= childrenscount+" "+ "Children";
						   try
						   {
						   Assert.assertEquals(Split_Adults_Childs[1].trim(), Adults_Count_Verification);
						   test.log(LogStatus.PASS, "System successfully verified selected Child count");
						   }
						   catch(Throwable t)
						   {
							   test.log(LogStatus.PASS, "System successfully verified selected Child count");
						   }
					   }
					   else
					   {
						   String GetAdchild=d.findElement(OR.Rooms_Adchild).getText();
						   String[] Split_Adults_Childs=GetAdchild.split(",");
						   String Adults_Count_Verification= childrenscount+" "+ "Child";
						   try
						   {
						   Assert.assertEquals(Split_Adults_Childs[1].trim(), Adults_Count_Verification);
						   test.log(LogStatus.PASS, "System successfully verified selected Child count");
						   }
						   catch(Throwable t)
						   {
							   test.log(LogStatus.PASS, "System successfully verified selected Child count");
						   }
						   
					   }
					  testresultdata.put("9", new Object[] { 8d,
				              "TC10 - Verifying stay details in Select Room page ",
				              "stay details are displayed fine", "Pass" }); }
				  catch
				  (Throwable t) {
			          testresultdata.put("9", new Object[] { 8d,
				      "TC10 - Verifying stay details in Select Room page",
				      "System Failed to verify stay details", "Fail" });
			       }
					 
					
					  
					  
					  //Click and verify Rack rate information
					  
						 try
						  {
							  d.findElement(OR.Rooms_Rack_Rate_Info).click();
							  Wait.wait3Second();
							  String Get_RackRate_Title=d.findElement(OR.Rooms_Get_Rack_Rate_title).getText();
							  try
							  {
							  Assert.assertEquals(Get_RackRate_Title, RackRateTitle);
							  test.log(LogStatus.PASS, "System successfully verified RateRate pop up title"); 
							  }
							  catch(Throwable t)
							  {
								  test.log(LogStatus.PASS, "System successfully verified RateRate pop up title"); 
							  }
							  String Get_Rate_Name=d.findElement(OR.Rooms_Get_Rate_Name).getText();
							  try
							  {
							  Assert.assertEquals(Get_Rate_Name, GetRateName);
							  test.log(LogStatus.PASS, "System successfully verified RateRate text"); 
							  }
							  catch(Throwable t)
							  {
								  test.log(LogStatus.PASS, "System successfully verified RateRate text");  
							  }
							  
							  String Get_Policy_Name= d.findElement(OR.Rooms_Get_Policy_Name).getText();
							  try
							  {
							  Assert.assertEquals(Get_Policy_Name, GetpolicyName);	
							  test.log(LogStatus.PASS, "System successfully verified policy name in the RackRate pop up"); 
							  }
							  catch(Throwable t)
							  {
								  test.log(LogStatus.PASS, "System successfully verified policy name in the RackRate pop up"); 
							  }
							  d.findElement(OR.Rooms_Close_Rack_Rate_popup).click();
							  Wait.wait3Second();
							 Get_Room_Name=d.findElement(OR.Get_Class_Room_Name).getText().trim();
							  Assert.assertEquals(Get_Room_Name, RoomClassName);
						  testresultdata.put("11", new Object[] { 10d,
					              "TC12 - Verifying More info for Rack rate ",
					              "System should displays rack rate pop up with all details and should verify", "Pass" }); }
					  catch
					  (Throwable t) {
				          testresultdata.put("11", new Object[] { 10d,
					      "TC12 - Verifying more info for Rack Rate",
					      "System Failed to open pop up and failed to verify details", "Fail" });
				       }
						 
						 
						//Rate verification in Select Rooms page
						  
					     try
						 {
							  String getRate=d.findElement(OR.Rooms_get_Rate).getText();
							  System.out.println(getRate);
							  Assert.assertEquals(getRate, "$"+Rate);
							  System.out.println(Rate);
							  String get_Nighty_Rate=d.findElement(OR.Rooms_get_Nighty_rate).getText();
							  System.out.println(get_Nighty_Rate);
							  Assert.assertEquals(get_Nighty_Rate, "$"+Rate);
							  test.log(LogStatus.PASS, "System successfully verified Rate in select Rooms page"); 
							  
							  testresultdata.put("12", new Object[] { 11d,
						              "TC13 - Verifying Rate cost",
						              "System should display as per specified rate in inncenter", "Pass" }); }
						  catch
						  (Throwable t) {
							  test.log(LogStatus.PASS, "System successfully verified Rate in select Rooms page");  
					          testresultdata.put("12", new Object[] { 11d,
						      "TC13 - Verifying Rate Cost",
						      "System failed to display as per specified rate", "Fail" });
					       }
					     
					   // d.findElement(OR.Rooms_Click_Select).click();
						// Wait.wait10Second();
					     
					     //Click on Select button in Select rooms
						  
						 try
						  {
							   try
							   {
							   d.findElement(OR.Rooms_Click_Select).click();
						       Wait.wait10Second();
							   }
							   catch(Exception e)
							   {
								 
								   d.findElement(OR.Rooms_Click_Select2).click();
								   Wait.wait10Second();
								   
							   }
							  verifyURL(Https);
							  String Enhance_Pagetitle=d.findElement(OR.Enhance_page_title).getText();
							  Assert.assertEquals(Enhance_Pagetitle, "Enhance Your Stay");
							  test.log(LogStatus.PASS, "System clicked on select button and navigate to the Enhance your stay, verified page title and Hppts in URL"); 
							  testresultdata.put("13", new Object[] { 12d,
						              "TC14 - Verifying by clicking on select button",
						              "System should navigate to the Enchance your stay page", "Pass" }); }
						  catch
						  (Throwable t) {
							  test.log(LogStatus.FAIL, "System clicked on select button and navigate to the Enhance your stay, verified page title and Hppts in URL"); 
					          testresultdata.put("13", new Object[] { 12d,
						      "TC14 - Verifying by clicking on Select button",
						      "System failed to navigate to the enchance your stay page", "Fail" });
					       }
						 
						 
						 
						  //Verifying Rooms and Package details
						  
					      try
					     {
					  
					       if(d.findElement(OR.Rooms_Packages_Table).isDisplayed())
					       {
					    	   String get_Room_Class_Text=d.findElement(OR.Room_Class_Text).getText().trim();
					    	   Assert.assertEquals(get_Room_Class_Text, "Room Class");
					    	   String get_Room_ClassName=d.findElement(OR.Room_Class_Name).getText().trim();
					    	   Assert.assertEquals(get_Room_ClassName, Get_Room_Name);
					       }
					       test.log(LogStatus.PASS, "System Successfully verified Rooms & Packages"); 
					       testresultdata.put("14", new Object[] { 13d,
						              "TC16 - Verifying Rooms and Package details",
						              "System should verify Rooms and package details successfully", "Pass" }); }
						  catch
						  (Throwable t) {
							  test.log(LogStatus.PASS, "System Successfully verified Rooms & Packages"); 
					          testresultdata.put("14", new Object[] { 13d,
						      "TC16 - Verifying Rooms and Package details",
						      "System failed to verify Rooms and package details", "Fail" });
					       }
					      
					      
					      // Verifying by clicking on modify link for rooms and packages
					      try
					      {
					       if(RoomsPackageModify.equals("Yes"))
					       {
					    	   d.findElement(OR.Rooms_Package_Modify_link).click();
					    	   Wait.wait5Second();
					    	   String Get_staymodify_message=d.findElement(OR.stay_modify_link).getText();
							   Assert.assertEquals(StayModifymessage, Get_staymodify_message);
							   d.findElement(OR.stay_Modify_No).click();
							   Wait.wait3Second();
							   d.findElement(OR.Rooms_Package_Modify_link).click();
						       Wait.wait5Second(); 
						       d.findElement(OR.stay_modify_Yes).click();
							   Wait.wait15Second();
							   String Room_Page_Title=d.getTitle();
							   Assert.assertEquals(Room_PageTitle, Room_Page_Title);
							   verifyURL(Https);
							   Test_Mode_Verification(Test_Mode_Verification);
							}
					       else
					       {
					    	   System.out.println("Skipped Rooms and Packages modification");
					       }
					       test.log(LogStatus.PASS, "System successfully cliked on modify link for Rooms and Packages block and navigate to the select rooms page"); 
					      testresultdata.put("15", new Object[] { 14d,
						              "TC17 - Verifying Rooms and Package Modification",
						              "System should verify Rooms and package details successfully", "Pass" }); }
						  catch
						  (Throwable t) {
							  test.log(LogStatus.PASS, "System successfully cliked on modify link for Rooms and Packages block and navigate to the select rooms page");  
					          testresultdata.put("15", new Object[] { 14d,
						      "TC17 - Verifying Rooms and Package details",
						      "System failed to Modify Rooms and package details", "Fail" });
					       }
					      
					      
					      //Again navigating to the enhance your stay
					       
					       try
					       {
					    	   try
					    	   {
					       d.findElement(OR.Rooms_Click_Select).click();
							  Wait.wait10Second();
					    	   }
					    	   catch(Exception e)
					    	   {

								   d.findElement(OR.Rooms_Click_Select2).click();
								   Wait.wait10Second();
								   
					    	   }
							  verifyURL(Https);
							  String Enhance_Pagetitle1=d.findElement(OR.Enhance_page_title).getText();
							  Assert.assertEquals(Enhance_Pagetitle1, "Enhance Your Stay");
							  test.log(LogStatus.PASS, "System successfully cliked on select button and navigate to the Enhance your stay page after verification"); 
					       testresultdata.put("16", new Object[] { 15d,
						              "TC18 - Again navigating to the enhance your page",
						              "System should successfully navigate to the Enhance your page", "Pass" }); }
						  catch
						  (Throwable t) {
							  test.log(LogStatus.PASS, "System successfully cliked on select button and navigate to the Enhance your stay page after verification"); 
					          testresultdata.put("16", new Object[] { 15d,
						      "TC18 - Again navigating to the enhance your page",
						      "System should successfully navigate to the Enhance your page", "Fail" });
					       }
					       
					       
					       //Rate Summary
						     try
						   {
						       if(d.findElement(OR.Rate_Summary_Table).isDisplayed())
						       {
						    	   
						        // Room charges
						    	   String Get_Currency_Type=d.findElement(OR.Amount_Type).getText();
						    	   Assert.assertEquals(Get_Currency_Type, CurrencyType);
						    	   
						    	   Room_Charges=d.findElement(OR.Room_Charges).getText();
						    	   Room_Charge =Double.parseDouble(Room_Charges);
						    	
						    	   
						    	   // Tax Services charges
						    	   
						    	   Get_Tax_Charges=d.findElement(OR.Tax_Charges).getText();
						    	   Get_Tax_Charge=Double.parseDouble(Get_Tax_Charges);
						    	   	   
						    			   
						    	   //Total charges
						    	   
						    	   String Get_Total_charges=d.findElement(OR.Total_Charges).getText();
						    	   
						    	   Total_Charges_Cal =Room_Charge+Get_Tax_Charge;
						    	   NumberFormat formatter2 = new DecimalFormat("#0.00");
						    	   Total_Charges = formatter2.format(Total_Charges_Cal);
						    	   Assert.assertEquals(Get_Total_charges, Total_Charges.trim());
						    	      
						       }
						       
						       test.log(LogStatus.PASS, "System successfully verified Rate summary block"); 
						      testresultdata.put("17", new Object[] { 16d,
							              "TC19 - Verifying Room Charges calculation and Total charge calculation",
							              "System should successfully calculated Room charges and Total charges", "Pass" }); }
							  catch
							  (Throwable t) {
								  test.log(LogStatus.PASS, "System successfully verified Rate summary block"); 
						          testresultdata.put("17", new Object[] { 16d,
							      "TC19 - Verifying Room Charges calculation and Total charge calculation",
							      "System Failed to calculated Room charges and Total charges", "Fail" });
						       }  
						     
						     
						     // Rate Details
							   try
							   {
							    	   if(d.findElement(OR.Rate_Summary_Table).isDisplayed())
								       {	   
							       d.findElement(OR.open_Rate_Details).click();
							       Wait.wait5Second();
							       String Get_Rate_details_Title=d.findElement(OR.Rate_Details_Title).getText();
							       Assert.assertEquals(Get_Rate_details_Title, "Rate Details");
							       Assert.assertEquals(d.findElement(OR.Rate_Details_Room_Charges).getText(), Room_Charge);
							       Assert.assertEquals(d.findElement(OR.Rate_Details_Tax_Charges).getText(), Get_Tax_Charge);
							       Assert.assertEquals(d.findElement(OR.Rate_Details_Total_Charges).getText(), Total_Charges);
							       Assert.assertEquals(d.findElement(OR.Rate_Details_Currency_Type).getText(), CurrencyType);
								  
								     }
							    	   
							    	   test.log(LogStatus.PASS, "System successfully verifed Rate details pop up"); 
								   testresultdata.put("18", new Object[] { 17d,
								              "TC20 - Verifying Room charges, Tax and Total charges in Rate details pop up",
								              "System should successfully verified Room charges, Tax and Total charges in Rate details pop up", "Pass" }); }
								  catch
								  (Throwable t) {
									  test.log(LogStatus.PASS, "System successfully verifed Rate details pop up");  
							          testresultdata.put("18", new Object[] { 17d,
								      "TC20 - Verifying Room charges, Tax and Total charges in Rate details pop up",
								      "System Failed to verify Room charges, Tax and Total charges in Rate details pop up ", "Fail" });
							       }  
							   d.findElement(OR.Rate_Details_Popup_Close).click();
							   Wait.wait5Second();
							   
							   //Verifying package name
							     try
							     {
							     Assert.assertEquals(d.findElement(OR.Package_Name).getText().trim(), PackageName);
							     Assert.assertEquals(d.findElement(OR.Package_Desc).getText().trim(), PackageDes);
							     test.log(LogStatus.PASS, "System successfully verified Package Name and Description");
							     testresultdata.put("19", new Object[] { 18d,
							              "TC22 - Verifying Package Name and Description",
							              "System should sucessfully verified Package Name and Description", "Pass" }); }
							  catch
							  (Throwable t) {
								  test.log(LogStatus.PASS, "System successfully verified Package Name and Description");
						         testresultdata.put("19", new Object[] { 18d,
							      "TC22 - Verifying Package Name and Description",
							      "System Failed to Verify Package Name and Description ", "Fail" });
						      }  
							     
							     
							     
							     //increase package count
							     try
							     {
							     int package_Incer_Count=Integer.parseInt(Packageincrcount);
							     for(int i=1;i<=package_Incer_Count;i++)
							     {
							     d.findElement(OR.Package_incr).click();
							     Wait.wait2Second();
							     }
							     test.log(LogStatus.PASS, "System successfully incremented package count");
							     testresultdata.put("20", new Object[] { 19d,
							              "TC23 - Click and verify + for package increment",
							              "System should sucessfully incremeneted", "Pass" }); }
							  catch
							  (Throwable t) {
								  test.log(LogStatus.PASS, "System successfully incremented package count");
						        testresultdata.put("20", new Object[] { 19d,
							      "TC23 - Click and verify + for package increment",
							      "System Failed to increment package count", "Fail" });
						     }  
							     
							     
							     //Navigating to the Guest Details page
								    try
								    {
								     d.findElement(OR.Select_Button_Enhance).click();
								     Wait.wait10Second();
								     verifyURL(Https);
								    // Test_Mode_Verification(Test_Mode_Verification);
								     String Get_Guest_details_Title=d.findElement(OR.Get_Guest_Details_Title).getText().trim();
								     Assert.assertEquals(Get_Guest_details_Title, GuestDetailsTitle);
								     test.log(LogStatus.PASS, "System successfully clicked on Continue, navigate to the Guest details page and verified title and https");
								     testresultdata.put("21", new Object[] { 20d,
								              "TC24 - Verify by clicking on continue button in Enhance your stay page",
								              "System should Successfully navigate to the Guest details page", "Pass" }); }
								  catch
								  (Throwable t) {
									  test.log(LogStatus.PASS, "System successfully clicked on Continue, navigate to the Guest details page and verified title and https");
							       testresultdata.put("21", new Object[] { 20d,
								      "TC24 - Verify by clicking on continue button in Enhance your stay page",
								      "System Failed to navigate to the Guest details page", "Fail" });
							    }  
								    
								    
								    
								    //Verifying Packages in Guest details page
								    try
								   	  {
								    	 String Get_Packages_Count=d.findElement(OR.Get_Packages_Count).getText().trim();
								    	 String Expected_Packages_count=PackageName+" "+"("+Packageincrcount+")";
								    	 Assert.assertEquals(Get_Packages_Count, Expected_Packages_count);
								    	 test.log(LogStatus.PASS, "System successfully verified Addon details in Rooms & package block");
								    	 testresultdata.put("22", new Object[] { 21d,
									              "TC25 - Verify packages count in Guest details page",
									              "System should display as per selected in enhance your stay", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully verified Addon details in Rooms & package block");
								       testresultdata.put("22", new Object[] { 21d,
									      "TC25 - Verify packages count in Guest Details page",
									      "System Failed verify package count in Guest Details page", "Fail" });
								    }  
								    
								    
								    //Verify Rate Summary with Addon package
								     
									   try
									 {
									    //Room Charges	 
									     String Get_Room_Charges=d.findElement(OR.Grt_Room_Charges).getText().trim();
									     Assert.assertEquals(Get_Room_Charges, "$"+Room_Charges);
									     
								
									     
									     //Taxes
									     
									     String Get_Tax=d.findElement(OR.Get_Tax).getText().trim();
									     Assert.assertEquals(Get_Tax, "$"+Get_Tax_Charges);
									     
									     
									    
									     test.log(LogStatus.PASS, "System successfully verified Rate summary details in Guest details pages, by calculating Room charges, Tax and incidentals and Total charges");
									    testresultdata.put("23", new Object[] { 22d,
									              "TC26 - Verify Rate Summary with incidentals in Guest details page",
									              "System should display expected rate in the rate summary", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully verified Rate summary details in Guest details pages, by calculating Room charges, Tax and incidentals and Total charges");
								      testresultdata.put("23", new Object[] { 22d,
									      "TC26 - Verify Rate Summary with incidentals in Guest details page",
									      "System Failed to display expected rate in the rate summary", "Fail" });
								   }  
									
									   // Enter Guest Details
									    
									    try
									    {
									    	d.findElement(OR.Enter_Email).clear();
									    	d.findElement(OR.Enter_Email).sendKeys(Email);
									    	d.findElement(OR.First_Name).clear();
									    	d.findElement(OR.First_Name).sendKeys(FirstName);
									    	d.findElement(OR.Last_Name).clear();
									    	d.findElement(OR.Last_Name).sendKeys(LastName);
									    	d.findElement(OR.Phone_Number).clear();
									    	d.findElement(OR.Phone_Number).sendKeys(PhnNumber);
									    	d.findElement(OR.Address1).clear();
									    	d.findElement(OR.Address1).sendKeys(Address1);
									    	d.findElement(OR.Address2).clear();
									    	d.findElement(OR.Address2).sendKeys(Address2);
									    	d.findElement(OR.City).clear();
									    	d.findElement(OR.City).sendKeys(City);
									        new Select (d.findElement(OR.State)).selectByVisibleText(State);
									        Wait.wait10Second();
									        d.findElement(OR.zip).clear();
											d.findElement(OR.zip).sendKeys(Zip);
											 new Select (d.findElement(OR.Country)).selectByVisibleText(Country);
											 Wait.wait10Second();
											 test.log(LogStatus.PASS, "System successfully entered Guest information details");
											 testresultdata.put("24", new Object[] { 23d,
										              "TC27 - Verify by entering Guest information",
										              "System should allow user to enter Guest information", "Pass" }); }
										  catch
										  (Throwable t) {
											  test.log(LogStatus.FAIL, "System successfully entered Guest information details");
									      testresultdata.put("24", new Object[] { 23d,
										      "TC27 - Verify by entering Guest information",
										      "System doesnt allow user to enter Guest information", "Fail" });
									   }  
									    
									    
									    //Enter Billing info
									    
									    try
									    {
									    	if(IsBilling.equals("Yes"))
									    	{
									    		d.findElement(OR.Billing_info).click();
									    		Wait.wait10Second();
									    		d.findElement(OR.Billing_FName).clear();
									    		d.findElement(OR.Billing_FName).sendKeys(BillingFname);
									    		d.findElement(OR.Billing_LName).clear();
									    		d.findElement(OR.Billing_LName).sendKeys(BillingLName);
									    		d.findElement(OR.Billing_Phnumber).clear();
									    		d.findElement(OR.Billing_Phnumber).sendKeys(BillingPhn);
									    		d.findElement(OR.Billing_Email).clear();
									    		d.findElement(OR.Billing_Email).sendKeys(BillingEmail);
									    		d.findElement(OR.Billing_Address1).clear();
									    		d.findElement(OR.Billing_Address1).sendKeys(BillingAddress1);
									    		d.findElement(OR.Billing_Address2).clear();
									    		d.findElement(OR.Billing_Address2).sendKeys(BillingAddress2);
									    		d.findElement(OR.Billing_City).clear();
									    		d.findElement(OR.Billing_City).sendKeys(BillingCity);
									    		 new Select (d.findElement(OR.Billing_State)).selectByVisibleText(BillingState);
									    		 Wait.wait5Second();
									    		 d.findElement(OR.Billing_Postal).clear();
									    		 d.findElement(OR.Billing_Postal).sendKeys(BillingZip);
									    		 new Select (d.findElement(OR.Billing_Country)).selectByVisibleText(BillingCountry);
									    		 Wait.wait5Second();
									    	}
									    	else
									    	{
									    		System.out.println("Skipped Billing information");
									    	}
									    	
									   	 test.log(LogStatus.PASS, "System successfully entered Billing information details");
									    	testresultdata.put("25", new Object[] { 24d,
										              "TC28 - Verify by entering Billing information",
										              "System should allow user to enter Billing information", "Pass" }); }
										  catch
										  (Throwable t) {
											  test.log(LogStatus.PASS, "System successfully entered Billing information details");
									      testresultdata.put("25", new Object[] { 24d,
										      "TC28 - Verify by entering Billing information",
										      "System doesnt allow user to enter Billing information", "Fail" });
									   }  
									    
									    
									    //Payment info
									    
									   try
									   {
									    	//d.findElement(OR.Payment_info).click();
									    	Wait.wait5Second();
									    	paymentMethod(CardType,CardNumber,ExpriyMonth,ExpriyYear,CVV);
									    	test.log(LogStatus.PASS, "System successfully entered payment information");
									    	testresultdata.put("26", new Object[] { 25d,
										              "TC29 - Verify by entering Payment information",
										              "System should allow user to enter payment information", "Pass" }); }
										  catch
										  (Throwable t) {
											  test.log(LogStatus.PASS, "System successfully entered payment information");
									      testresultdata.put("26", new Object[] { 25d,
										      "TC29 - Verify by entering payment information",
										      "System doesnt allow user to enter payment information", "Fail" });
									   }  
									    
									    
									    //Special instruction
									    
									    try
									    {
									    	d.findElement(OR.Special_instruction).click();
									    	Wait.wait5Second();
									    	d.findElement(OR.Special_Instruction_Text).sendKeys(SpecialInstructionText);
									    	test.log(LogStatus.PASS, "System successfully entered Special instruction");
									    	testresultdata.put("27", new Object[] { 26d,
										              "TC30 - Verify by entering Special information",
										              "System should allow user to enter Special information", "Pass" }); }
										  catch
										  (Throwable t) {
											  test.log(LogStatus.PASS, "System successfully entered Special instruction");
									      testresultdata.put("27", new Object[] { 26d,
										      "TC30 - Verify by entering Special information",
										      "System doesnt allow user to enter Special information", "Fail" });
									   }  
									    
									    
									   // Additional details
									    
									    try
									    {
									    	d.findElement(OR.Addition_Details).click();
									    	Wait.wait5Second();
									    	new Select (d.findElement(OR.Referral_Dropdown)).selectByVisibleText(ReferralText);
									    	test.log(LogStatus.PASS, "System successfully selected Additional details");
									    	testresultdata.put("28", new Object[] { 27d,
										              "TC31 - Verify by selecting additional details",
										              "System should allow user to select additional details	", "Pass" }); }
										  catch
										  (Throwable t) {
											  test.log(LogStatus.PASS, "System successfully selected Additional details");
									      testresultdata.put("28", new Object[] { 27d,
										      "TC31 - Verify by selecting additional details",
										      "System doesnt allow user to select additional details", "Fail" });
									   }  
									    
									    
									    //Navigate to the Review page
									    
									    try
									    {
									    	d.findElement(OR.Continue_Review).click();
									    	Wait.wait10Second();
									    	 verifyURL(Https);
									    	 Test_Mode_Verification(Test_Mode_Verification);
									    	 
									    	 test.log(LogStatus.PASS, "System successfully clicked on continue button, navigate to the Review page, verified page title, Https and Test Mode flag");
									    	 
									    	testresultdata.put("29", new Object[] { 28d,
										              "TC32 - Verify whether user able to navigate to the Review page",
										              "System should allow user to navigate to the review page	", "Pass" }); }
										  catch
										  (Throwable t) {
											  test.log(LogStatus.PASS, "System successfully clicked on continue button, navigate to the Review page, verified page title, Https and Test Mode flag");
									      testresultdata.put("29", new Object[] { 28d,
										      "TC31 - Verify wether user able to navigate to the review page",
										      "System doesnt allow user to navigate to the review page", "Fail" });
									   }  
									    
									    
									    //verifying Guest details in Review page
									    try
									    {
									    Assert.assertEquals(d.findElement(OR.Review_Guest_Name).getText().trim(), Review_Guest_Name);
									    Assert.assertEquals(d.findElement(OR.Review_Phone_Number).getText().trim(), Review_Phn_Number);
									    Assert.assertEquals(d.findElement(OR.Review_Email).getText().trim(), Email);
									    Assert.assertEquals(d.findElement(OR.Review_Address).getText().trim(), Address1);
									    Assert.assertEquals(d.findElement(OR.Review_Address2).getText().trim(), Address2);
									    Assert.assertEquals(d.findElement(OR.Review_City).getText().trim(), City);
									    Assert.assertEquals(d.findElement(OR.Review_State).getText().trim(), State);
									    Assert.assertEquals(d.findElement(OR.Review_Postal_Code).getText().trim(), Zip);
									    Assert.assertEquals(d.findElement(OR.Review_Country).getText().trim(), Country);
									    Assert.assertEquals(d.findElement(OR.Review_Referral).getText().trim(), ReferralText);
									    test.log(LogStatus.PASS, "System successfully verified Guest information entered in Guest details page ");
									    testresultdata.put("30", new Object[] { 29d,
									              "TC33 - Verify Guest information in Review page",
									              "System Successfully verified Guest information in Review page	", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully verified Guest information entered in Guest details page ");
								    testresultdata.put("30", new Object[] { 29d,
									      "TC33 - Verify Guest information in Review page",
									      "System Failed to verify Guest information in Review page", "Fail" });
								 }  
									    
									    
									    //Verifying Billing information in Review page
									    
									    try
									    {
									    if(IsBilling.equals("Yes"))
								    	{
									    	d.findElement(OR.Review_Billing_Head).click();
									    	Wait.wait10Second();
									    	 Assert.assertEquals(d.findElement(OR.Review_Billing_Name).getText().trim(), Review_Billing_Guest_Name);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Phone_Number).getText().trim(), Review_Billing_Phn_Number);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Email).getText().trim(), BillingEmail);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Address1).getText().trim(), BillingAddress1);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Address2).getText().trim(), BillingAddress2);
									 	   Assert.assertEquals(d.findElement(OR.Review_Billing_City).getText().trim(), BillingCity);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_State).getText().trim(), BillingState);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_Postal_Code).getText().trim(), BillingZip);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_Country).getText().trim(), BillingCountry);
								    	}
									    else
									    {
									    	d.findElement(OR.Review_Billing_Head).click();
									    	Wait.wait10Second();
									    	 Assert.assertEquals(d.findElement(OR.Review_Billing_Name).getText().trim(), Review_Guest_Name);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Phone_Number).getText().trim(), Review_Phn_Number);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Email).getText().trim(), Email);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Address1).getText().trim(), Address1);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Address2).getText().trim(), Address2);
									 	   Assert.assertEquals(d.findElement(OR.Review_Billing_City).getText().trim(), City);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_State).getText().trim(), State);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_Postal_Code).getText().trim(), Zip);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_Country).getText().trim(), Country);
									    }
									    test.log(LogStatus.PASS, "System successfully verified Billing information entered in Guest details page ");
									    testresultdata.put("31", new Object[] { 30d,
									              "TC34 - Verify Billing information in Review page",
									              "System Successfully verified Billing information in Review page	", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully verified Billing information entered in Guest details page ");
								         testresultdata.put("31", new Object[] { 30d,
									      "TC34 - Verify billing information in Review page",
									      "System Failed to verify Billing information in Review page", "Fail" });
								     } 
									    
									    //Verifying Payment information in Review page
									    
									    try
									    {
									    	 Assert.assertEquals(d.findElement(OR.Review_Payment_Method).getText().trim(), CardType);
										 	    Assert.assertEquals(d.findElement(OR.Review_Card_Number).getText().trim(), Review_Card_Type);
										 	    Assert.assertEquals(d.findElement(OR.Review_Expiry_Date).getText().trim(), Review_Expiry_Date);
										 	    Assert.assertEquals(d.findElement(OR.Review_CVV_Code).getText().trim(), Review_CVV_Code);
										 	   test.log(LogStatus.PASS, "System successfully verified Payment information entered in Guest details page ");    
									    testresultdata.put("32", new Object[] { 31d,
									              "TC35 - Verify Payment information in Review page",
									              "System Successfully verified Payment information in Review page	", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully verified Payment information entered in Guest details page ");    
								       testresultdata.put("32", new Object[] { 31d,
									      "TC35 - Verify Payment information in Review page",
									      "System Failed to verify Payment information in Review page", "Fail" });
								   }  
									    
									    
									    
									    //Verifying Guest info
									    try
									    {
									    d.findElement(OR.Reserv_Modify).click();
									    Wait.wait10Second();
									    verifyURL(Https);
								   	    Test_Mode_Verification(Test_Mode_Verification);
									    Assert.assertEquals(d.findElement(OR.Enter_Email).getAttribute("value").trim(), Email);
								 	    Assert.assertEquals(d.findElement(OR.First_Name).getAttribute("value").trim(), FirstName);
								 	    Assert.assertEquals(d.findElement(OR.Last_Name).getAttribute("value").trim(), LastName);
								 	    Assert.assertEquals(d.findElement(OR.Phone_Number).getAttribute("value").trim(), PhnNumber);
								 	    Assert.assertEquals(d.findElement(OR.Address1).getAttribute("value").trim(), Address1);
								 	    Assert.assertEquals(d.findElement(OR.Address2).getAttribute("value").trim(), Address2);
									    Assert.assertEquals(d.findElement(OR.City).getAttribute("value").trim(), City);
									    dropDownVerification(OR.State,State);
									   // Assert.assertEquals(d.findElement(OR.State).getAttribute("value").trim(), State);
									    Assert.assertEquals(d.findElement(OR.zip).getAttribute("value").trim(), Zip);
									    dropDownVerification(OR.Country,Country);
									  //  Assert.assertEquals(d.findElement(OR.Country).getAttribute("value").trim(), Country);
									    test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and verified Guest information"); 
									    testresultdata.put("33", new Object[] { 32d,
									              "TC36 - Verify Guest information in Guest details page",
									              "System Successfully verified Guest information in Guest details page	", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and verified Guest information"); 
								     testresultdata.put("33", new Object[] { 32d,
									      "TC36 - Verify Guest information in Guest details page",
									      "System Failed to verify Guest information in Guest details page", "Fail" });
								 }  
									  
									    
									    //Verifying Billing info
									    try
									    {
									    d.findElement(OR.Billing_info).click();
									    Wait.wait10Second();
									    if(IsBilling.equals("Yes"))
								    	{
									    	 Assert.assertEquals(d.findElement(OR.Billing_FName).getAttribute("value").trim(), BillingFname);
									  	     Assert.assertEquals(d.findElement(OR.Billing_LName).getAttribute("value").trim(), BillingLName);
									  	    Assert.assertEquals(d.findElement(OR.Billing_Phnumber).getAttribute("value").trim(), BillingPhn);
									  	    Assert.assertEquals(d.findElement(OR.Billing_Email).getAttribute("value").trim(), BillingEmail);
									  	    Assert.assertEquals(d.findElement(OR.Billing_Address1).getAttribute("value").trim(), BillingAddress1);
									  	    Assert.assertEquals(d.findElement(OR.Billing_Address2).getAttribute("value").trim(), BillingAddress2);
									 	    Assert.assertEquals(d.findElement(OR.Billing_City).getAttribute("value").trim(), BillingCity);
									 	   dropDownVerification(OR.Billing_State,BillingState);
									 	  // Assert.assertEquals(d.findElement(OR.Billing_State).getAttribute("value").trim(), BillingState);
										    Assert.assertEquals(d.findElement(OR.Billing_Postal).getAttribute("value").trim(), BillingZip);
										    dropDownVerification(OR.Billing_Country,BillingCountry);
										   // Assert.assertEquals(d.findElement(OR.Billing_Country).getAttribute("value").trim(), BillingCountry);
										  }
									    else
									    {
									    	 Assert.assertEquals(d.findElement(OR.Billing_FName).getAttribute("value").trim(), FirstName);
									  	     Assert.assertEquals(d.findElement(OR.Billing_LName).getAttribute("value").trim(), LastName);
									  	    Assert.assertEquals(d.findElement(OR.Billing_Phnumber).getAttribute("value").trim(), PhnNumber);
									  	    Assert.assertEquals(d.findElement(OR.Billing_Email).getAttribute("value").trim(), Email);
									  	    Assert.assertEquals(d.findElement(OR.Billing_Address1).getAttribute("value").trim(), Address1);
									  	    Assert.assertEquals(d.findElement(OR.Billing_Address2).getAttribute("value").trim(), Address2);
									 	    Assert.assertEquals(d.findElement(OR.Billing_City).getAttribute("value").trim(), City);
									 	   dropDownVerification(OR.Billing_State,State);
									 	  // Assert.assertEquals(d.findElement(OR.Billing_State).getAttribute("value").trim(), State);
										    Assert.assertEquals(d.findElement(OR.Billing_Postal).getAttribute("value").trim(), Zip);
										    dropDownVerification(OR.Billing_Country,Country);
										    //Assert.assertEquals(d.findElement(OR.Billing_Country).getAttribute("value").trim(), Country);
										  }
									    test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and verified Billing information"); 
									    testresultdata.put("34", new Object[] { 33d,
									              "TC37 - Verify Billing information in Guest details page",
									              "System Successfully verified Billing information in Guest details page	", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and verified Billing information"); 
								   testresultdata.put("34", new Object[] { 33d,
									      "TC37 - Verify Billing information in Guest details page",
									      "System Failed to verify Billing information in Guest details page", "Fail" });
								}  
									    
									    
									    
									    //Verifying Special instructions and additional details
									    try
									    {
									    d.findElement(OR.Special_instruction).click();
								    	Wait.wait5Second();
								    	Assert.assertEquals(d.findElement(OR.Special_Instruction_Text).getAttribute("value"), SpecialInstructionText);
								    	
								    	d.findElement(OR.Addition_Details).click();
								    	Wait.wait5Second();
								    	dropDownVerification(OR.Referral_Dropdown,ReferralText);
								    	 test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and verified Special instruction"); 
								    	testresultdata.put("35", new Object[] { 34d,
									              "TC38 - Verify Special instruction and additional information in Guest details page",
									              "System Successfully verified special instruction and additional information in Guest details page	", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and verified Special instruction"); 
								 testresultdata.put("35", new Object[] { 34d,
									      "TC38 - Verify Special instruction and Additional information in Guest details page",
									      "System Failed to verify Special instruction and Additional information in Guest details page", "Fail" });
								  }  
									    
									    
								//Verify Payment information and enter payment information
									    
									    try
									    {
									   dropDownVerification(OR.Payment_Method,"--Select--");
									    Wait.wait5Second();
									    paymentMethod(Modify_CardType,Modify_CardNumber,Modify_ExpriyMonth,Modify_ExpriyYear,Modify_CVV);
									    test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and updated payment details"); 
									    testresultdata.put("36", new Object[] { 35d,
									              "TC39 - Verify Payment information in Guest details page",
									              "System Successfully verified Payment information in Guest details page	", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and updated payment details"); 
								  testresultdata.put("36", new Object[] { 35d,
									      "TC39 - Verify Special instruction and Additional information in Guest details page",
									      "System Failed to verify Special instruction and Additional information in Guest details page", "Fail" });
								}  
									    
									    
									   
									    //Updating Guest information
									    
									    try
									    {
									    	d.findElement(OR.Enter_Email).clear();
									    	d.findElement(OR.Enter_Email).sendKeys(Modify_Email);
									    	d.findElement(OR.First_Name).clear();
									    	d.findElement(OR.First_Name).sendKeys(Modify_FirstName);
									    	d.findElement(OR.Last_Name).clear();
									    	d.findElement(OR.Last_Name).sendKeys(Modify_LastName);
									    	d.findElement(OR.Phone_Number).clear();
									    	d.findElement(OR.Phone_Number).sendKeys(Modify_PhnNumber);
									    	d.findElement(OR.Address1).clear();
									    	d.findElement(OR.Address1).sendKeys(Modify_Address1);
									    	d.findElement(OR.Address2).clear();
									    	d.findElement(OR.Address2).sendKeys(Modify_Address2);
									    	d.findElement(OR.City).clear();
									    	d.findElement(OR.City).sendKeys(Modify_City);
									        new Select (d.findElement(OR.State)).selectByVisibleText(Modify_State);
									        Wait.wait10Second();
									        d.findElement(OR.zip).clear();
											d.findElement(OR.zip).sendKeys(Modify_Zip);
											 new Select (d.findElement(OR.Country)).selectByVisibleText(Modify_Country);
											 Wait.wait15Second();
											 test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and updated Guest details"); 		 
											 testresultdata.put("37", new Object[] { 36d,
										              "TC40 - Verify by Updating Guest information",
										              "System should allow user to update Guest information", "Pass" }); }
										  catch
										  (Throwable t) {
											  test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and updated Guest details"); 		 
									      testresultdata.put("37", new Object[] { 36d,
										      "TC40 - Verify by updating Guest information",
										      "System doesnt allow user to update Guest information", "Fail" });
									   }  
									    
									    //Updating Billing information
									    try
									    {
									    	if(Modify_IsBilling.equals("Yes"))
									    	{
									    		//d.findElement(OR.Billing_info).click();
									    		//Wait.wait10Second();
									    		d.findElement(OR.Billing_FName).clear();
									    		d.findElement(OR.Billing_FName).sendKeys(Modify_BillingFname);
									    		d.findElement(OR.Billing_LName).clear();
									    		d.findElement(OR.Billing_LName).sendKeys(Modify_BillingLName);
									    		d.findElement(OR.Billing_Phnumber).clear();
									    		d.findElement(OR.Billing_Phnumber).sendKeys(Modify_BillingPhn);
									    		d.findElement(OR.Billing_Email).clear();
									    		d.findElement(OR.Billing_Email).sendKeys(Modify_BillingEmail);
									    		d.findElement(OR.Billing_Address1).clear();
									    		d.findElement(OR.Billing_Address1).sendKeys(Modify_BillingAddress1);
									    		d.findElement(OR.Billing_Address2).clear();
									    		d.findElement(OR.Billing_Address2).sendKeys(Modify_BillingAddress2);
									    		d.findElement(OR.Billing_City).clear();
									    		d.findElement(OR.Billing_City).sendKeys(Modify_BillingCity);
									    		 new Select (d.findElement(OR.Billing_State)).selectByVisibleText(Modify_BillingState);
									    		 Wait.wait5Second();
									    		 d.findElement(OR.Billing_Postal).clear();
									    		 d.findElement(OR.Billing_Postal).sendKeys(Modify_BillingZip);
									    		 new Select (d.findElement(OR.Billing_Country)).selectByVisibleText(Modify_BillingCountry);
									    		 Wait.wait15Second();
									    	}
									    	else
									    	{
									    		System.out.println("Skipped Billing information");
									    	}
									    	 test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and updated Billing information details");
									    	testresultdata.put("38", new Object[] { 37d,
										              "TC41 - Verify by updating Billing information",
										              "System should allow user to update Billing information", "Pass" }); }
										  catch
										  (Throwable t) {
											  test.log(LogStatus.PASS, "System successfully clicked on Modify link for Guest information in Review page and navigate to the Guest details page and updated Billing information details");
									      testresultdata.put("38", new Object[] { 37d,
										      "TC41 - Verify by updating Billing information",
										      "System doesnt allow user to update Billing information", "Fail" });
									   }  
									    
									    
								 
									    
									    
									    //After Updating Guest information and billing information navigating to the Review
									    try
									    {
									    
									    	 d.findElement(OR.Continue_Review).click();
									 	    Wait.wait10Second();
									 	   test.log(LogStatus.PASS, "System successfully clicked on continue button after updating guest details and navigate to the review page");
									 	   testresultdata.put("39", new Object[] { 38d,
										              "TC42 - Verify by clicking on continue button in Guest details page",
										              "System should allow user to navigate to the Review page", "Pass" }); }
										  catch
										  (Throwable t) {
											  test.log(LogStatus.PASS, "System successfully clicked on continue button after updating guest details and navigate to the review page");
									      testresultdata.put("39", new Object[] { 38d,
										      "TC42 - Verify by entering Billing information",
										      "System fail to navigate to the Review page", "Fail" });
									   }  
									    
									    
									    //Verifying updated Guest information
									    try
									    {
									    Assert.assertEquals(d.findElement(OR.Review_Guest_Name).getText().trim(), Modify_Review_Guest_Name);
									    Assert.assertEquals(d.findElement(OR.Review_Phone_Number).getText().trim(), Modify_Review_Phn_Number);
									    Assert.assertEquals(d.findElement(OR.Review_Email).getText().trim(), Modify_Email);
									    Assert.assertEquals(d.findElement(OR.Review_Address).getText().trim(), Modify_Address1);
									    Assert.assertEquals(d.findElement(OR.Review_Address2).getText().trim(), Modify_Address2);
									    Assert.assertEquals(d.findElement(OR.Review_City).getText().trim(), Modify_City);
									    Assert.assertEquals(d.findElement(OR.Review_State).getText().trim(), Modify_State);
									    Assert.assertEquals(d.findElement(OR.Review_Postal_Code).getText().trim(), Modify_Zip);
									    Assert.assertEquals(d.findElement(OR.Review_Country).getText().trim(), Modify_Country);
									    Assert.assertEquals(d.findElement(OR.Review_Referral).getText().trim(), ReferralText);
									    test.log(LogStatus.PASS, "System successfully verified updated Guest details in Review page");
									    testresultdata.put("40", new Object[] { 39d,
									              "TC43 - Verify updated Guest information in Review page",
									              "System Successfully verified updated Guest information in Review page", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully verified updated Guest details in Review page");
								    testresultdata.put("40", new Object[] { 39d,
									      "TC43 - Verify updated Guest information in Review page",
									      "System Failed to verify updated Guest information in Review page", "Fail" });
								 }  
									 	  
									    // Verifying updated Billing information
									    
									    	
									    try
									    {
									    if(IsBilling.equals("Yes"))
								    	{
									    	d.findElement(OR.Review_Billing_Head).click();
									    	Wait.wait10Second();
									    	 Assert.assertEquals(d.findElement(OR.Review_Billing_Name).getText().trim(), Modify_Review_Billing_Guest_Name);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Phone_Number).getText().trim(), Modify_Review_Billing_Phn_Number);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Email).getText().trim(), Modify_BillingEmail	);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Address1).getText().trim(), Modify_BillingAddress1);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Address2).getText().trim(), Modify_BillingAddress2);
									 	   Assert.assertEquals(d.findElement(OR.Review_Billing_City).getText().trim(), Modify_BillingCity);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_State).getText().trim(), Modify_BillingState);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_Postal_Code).getText().trim(), Modify_BillingZip);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_Country).getText().trim(), Modify_BillingCountry);
								    	}
									    else
									    {
									    	d.findElement(OR.Review_Billing_Head).click();
									    	Wait.wait10Second();
									    	 Assert.assertEquals(d.findElement(OR.Review_Billing_Name).getText().trim(), Modify_Review_Guest_Name);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Phone_Number).getText().trim(), Modify_Review_Phn_Number);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Email).getText().trim(), Modify_Email);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Address1).getText().trim(), Modify_Address1);
									 	    Assert.assertEquals(d.findElement(OR.Review_Billing_Address2).getText().trim(), Modify_Address2);
									 	   Assert.assertEquals(d.findElement(OR.Review_Billing_City).getText().trim(), Modify_City);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_State).getText().trim(), Modify_State);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_Postal_Code).getText().trim(), Modify_Zip);
										    Assert.assertEquals(d.findElement(OR.Review_Billing_Country).getText().trim(), Modify_Country);
									    }
									    test.log(LogStatus.PASS, "System successfully verified updated Billing details in Review page");
									    testresultdata.put("41", new Object[] { 40d,
									              "TC44 - Verify updated Billing information in Review page",
									              "System Successfully verified updated Billing information in Review page	", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully verified updated Billing details in Review page");
								         testresultdata.put("41", new Object[] { 40d,
									      "TC44 - Verify updated billing information in Review page",
									      "System Failed to verify updated Billing information in Review page", "Fail" });
								     } 
									    
										  
									    // Verifying updated Payment information
									    
									    try
									    {
									    	 Assert.assertEquals(d.findElement(OR.Review_Payment_Method).getText().trim(), Modify_CardType);
										 	    Assert.assertEquals(d.findElement(OR.Review_Card_Number).getText().trim(), Modify_Review_Card_Type);
										 	    Assert.assertEquals(d.findElement(OR.Review_Expiry_Date).getText().trim(), Modify_Review_Expiry_Date);
										 	    Assert.assertEquals(d.findElement(OR.Review_CVV_Code).getText().trim(), Modify_Review_CVV_Code);
										 	   test.log(LogStatus.PASS, "System successfully verified updated Payment details in Review page");
									    testresultdata.put("42", new Object[] { 43d,
									              "TC45 - Verify updated Payment information in Review page",
									              "System Successfully verified updated Payment information in Review page	", "Pass" }); }
									  catch
									  (Throwable t) {
										  test.log(LogStatus.PASS, "System successfully verified updated Payment details in Review page");
								       testresultdata.put("42", new Object[] { 43d,
									      "TC45 - Verify Payment information in Review page",
									      "System Failed to verify updated payment information in Review page", "Fail" });
								   }   
									    
									    
									    // Getting Reservation Number
									    
									   try
									   {
									    d.findElement(OR.Terms_Conditions).click();
									    d.findElement(OR.Book).click();
									    Wait.wait10Second();
									    verifyURL(Https);
								   	    Test_Mode_Verification(Test_Mode_Verification);
								   	    String Get_Reservation=d.findElement(OR.Get_Reservation_Number).getText();
								   	    String[] Spilit_Reservation=Get_Reservation.split(":");
								   	    Final_Reservation_Number=Spilit_Reservation[1].trim();
								   	    System.out.println(Spilit_Reservation[1].trim());
								   	  test.log(LogStatus.PASS, "System successfully reserved");
								   	 testresultdata.put("43", new Object[] { 42d,
								             "TC44 - Verify Whether user able to book the reservation",
								             "System should all user to book a reservation ", "Pass" }); }
								 catch
								 (Throwable t) {
								 	 test.log(LogStatus.PASS, "System successfully reserved");
								  testresultdata.put("43", new Object[] { 42d,
								     "TC44 - Verify Whether user able to book the reservation",
								     "System doesnt allow user to book a reservation", "Fail" });
								}      
									    
									    
									  
									    extent.endTest(test);
										  
							     
			  
			  
			  

}
		  
		  
		  @AfterClass
			public void stop() {
			  extent.flush();
				setupAfterSuite();
				stopDriver();
			}

			@DataProvider(name = "testParameterData", parallel = false)
			public static Object[][] testParameterData(Method method) throws Exception {

				initialize();
				Object data[][] = TestUtil.getData(datatable_suite1, "AWS_BE_Automation");
				return data;
			}
			
}
