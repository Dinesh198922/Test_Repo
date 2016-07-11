package innRoad.suite;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import innRoad.config.BaseTest;
import innRoad.config.TestUtil;
import innRoad.config.Wait;
import innRoad.properties.OR;

public class MBE_Adults_Childs extends BaseTest {
	
	static final ExtentReports extent = new ExtentReports("C:\\reports\\reports.html", false);
	public WebDriver driver;
	
	public int Number_of_Nights;
	public double Tax_Services_Charges;
	public double Room_Charges;
	public double package_Cost_Calculation;
	public String Round_of_package2;
	public String Room_Chargess;
	
	
	
	@Test(dataProvider = "testParameterData")
	  public void testUntitled(String URL, String TCNAME, String Property_Name, String Adult, String Child, String start_date, String End_Date, String Arrival_Depature_Dates, String RoomClassName,
			  String Page_Title, String Test_Mode_Message, String Room_Price_Available_Rooms,String Package_Title, String Package_Name,String Room_Rate, String Tax_value,String PackageRate,String PackageCountvalue, String Rate_Display_Name,
			  String FirstName, String LastName, String PhnNumber, String Email, String Address1, String City, String Zip, String State, String Country, String CardType,
			  String CardNumber, String ExpriyMonth, String ExpriyYear, String CVV, String ReferralText, String SpecialInstructionText, String Review_Guest_Name,
			  String Review_Phn_Number, String Billing_Card_Number) throws Exception {
		
		 ExtentTest test = extent.startTest(TCNAME, "Creating Reservation with MBE Test clinet using Iphone");
		try
		{
		fillLogin(URL);
		test.log(LogStatus.PASS, "User Successfully logged in to the application");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User Failed to login to the application");
		}
		
		
		//Verify the Property Name
		
		String Get_Property_Name=d.findElement(OR.Property_Name).getText();
		if(Property_Name.equals(Get_Property_Name))
		{
			System.out.println("Property Name Matched");
			test.log(LogStatus.PASS, "User Successfully verified Property Name");
		}
		
		else
		{
			test.log(LogStatus.FAIL, "User failed to verified Property Name");
		}
		
		//Click on Book Now
		
		try
		{
		int AdultCount = Integer.parseInt(Adult);
		d.findElement(OR.Click_Book).click();
		Wait.wait2Second();
		for(int i=1; i<AdultCount;i++)
		{	
	    d.findElement(OR.Inc_Adults).click();
	    Wait.wait2Second();
		}
		test.log(LogStatus.PASS, "User Successfully clicked on Book Button");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User failed to click on Book Button");	
		}
		
		//Selecting Dates
		try
		{
		d.findElement(OR.Click_Date_picker).click();
		Wait.wait2Second();
		List<WebElement> Get_all_months=d.findElements(OR.Get_All_months);
		for(int i=0; i<Get_all_months.size();i++)
		{
			System.out.println(Get_all_months.get(i).getText());
		}
		
		List<WebElement> Get_Selectable_day=d.findElements(OR.Get_Selectable_Days);
		
		for(int i =0; i<Get_Selectable_day.size();i++)
		{
			//System.out.println(Get_Selectable_day.get(i).getAttribute("date"));
			//start Date
			if(Get_Selectable_day.get(i).getAttribute("date").equals(start_date))
			{
				d.findElement(By.xpath("//td[@date='"+start_date+"']")).click();
				
			}
			
			//End Date
			if(Get_Selectable_day.get(i).getAttribute("date").equals(start_date))
			{
				d.findElement(By.xpath("//td[@date='"+End_Date+"']")).click();
				
			}
			
			/*String Get_Arrival_Depature_Date=d.findElement(OR.Get_Arrival_Depature_dates).getText();
			
			System.out.println("Get_Arrival_Depature_Date:"+Get_Arrival_Depature_Date);
			
			if((Arrival_Depature_Dates).equals(Get_Arrival_Depature_Date))
			{
				System.out.println("Arrival and Depature Dates Matched");
			}*/
			
			
		}
		
		
		
		
		String Get_Child_Adult_Count=d.findElement(OR.Sticky_Header_Adultchild).getText();
		if(("Ad: "+Adult+"  Ch: 0").equals(Get_Child_Adult_Count))
		{
			System.out.println("Adults count Matched");
		}
		test.log(LogStatus.PASS, "User Successfully selected dates, adults and childrens");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User fail to selected dates, adults and childrens");
		}
		
		
		
		
		//checking Availability
		try
		{
		d.findElement(OR.Check_Availability).click();
		Wait.wait5Second();
		test.log(LogStatus.PASS, "User Successfully clicked on Availability button ");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User failed to clicked on Availability button");
		}
		
		
		//Verifying page Available Rooms
		
		String Get_Room_title=d.findElement(OR.Get_Room_Title).getText().trim();
		try
		{
		if(Page_Title.equals(Get_Room_title))
		{
			System.out.println("Available Room Title matched");
			test.log(LogStatus.PASS, "User Successfully verified page title of Available Rooms ");
		}
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User failed to verify page title of Available Rooms ");
		}
		
		
		
		//Room name verification
		try
		{
		String Get_Room_Name=d.findElement(OR.Get_Room_Class_Name).getText().trim();
		if(RoomClassName.equals(Get_Room_Name))
		{
			System.out.println("Room Name Matached");
			test.log(LogStatus.PASS, "User Successfully verified Room name verification");
		}
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User failed to verify Room name verification ");
		}
		
		/*//Test mode text verifictaion
		String Get_Test_Mode_Message=d.findElement(OR.Test_Mode_Message).getText();
		if(d.findElements(OR.Test_Mode_Message).size()!=0)
		 {
			if(Test_Mode_Message.equals(Get_Test_Mode_Message))
			{
				System.out.println("Test mode Message matched");
			}
			else
			{	
				System.out.println("Test mode text dint displayed");
			}
		 }*/
		
		
		//Arrival date and Depatures date
		try
		{
		String Get_Start_Date=d.findElement(OR.Get_start_Date).getText();
		String Get_End_Date=d.findElement(OR.Get_End_Date).getText();
		String Get_start_End_Date= Get_Start_Date+ "-" +Get_End_Date;
		if(Arrival_Depature_Dates.equals(Get_start_End_Date))
		{
			System.out.println("Arrival and Depature Dates matched");
		}
		test.log(LogStatus.PASS, "User Successfully verified Arrival date and Depatures date");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User failed verify Arrival date and Depatures date");
		}
		//Verifying Adult count
		
		try
		{
		String Get_Adult_Count =d.findElement(OR.Available_Rooms_Adult_Count).getText().trim();
		if(("Ad: "+Adult+"").equals(Get_Adult_Count))
		{
			System.out.println("Available Room Adult count matched");
		}
		test.log(LogStatus.PASS, "User Successfully verified Adult count");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User failed to verify Adult count");
		}
		//Verifying Price
		try
		{
		String Get_Room_Price=d.findElement(OR.Get_Room_Price).getText().trim();
				if(("$"+Room_Price_Available_Rooms).equals("$"+Get_Room_Price))
				{
					System.out.println("Room Price matched");
				}	
				test.log(LogStatus.PASS, "User Successfully verified Price");
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User failed to verify Price");
		}
				
			try
			{
		//Next page_details page
				
		d.findElement(OR.Next_Page).click();
		Wait.wait5Second();
		
		//Add Package
		
		String Get_AddPackage_Title =d.findElement(OR.Add_Package_title).getText();
		
		if(Package_Title.equals(Get_AddPackage_Title))
		{
			System.out.println("Package Name is Matched in Package");
		}
		
		String Get_Test_Mode_Package=d.findElement(OR.Test_Mode_in_Package).getText();
		
		if(Test_Mode_Message.equals(Get_Test_Mode_Package))
		{
			System.out.println("Test Modes is Matched in Package");
		}
		
		String Get_Room_Class_Name_Package=d.findElement(OR.Room_Name_in_Package).getText();
		if(RoomClassName.equals(Get_Room_Class_Name_Package))
		{
			System.out.println("Room class Name is Matched in Package page");
		}
		
		String Get_Adult_Package=d.findElement(OR.Adult_Count_in_Package).getText().trim();
		if(("Ad: "+Adult).equalsIgnoreCase(Get_Adult_Package))
		{
			System.out.println("Available Room Adult count matched in package");
		}
		
		String Get_Package_Name=d.findElement(OR.MbePackage_Name).getText();
		
		if(Package_Name.equals(Get_Package_Name))
		{
			System.out.println("Package name is Matched in Package page");
		}
		
		String Get_Package_desc=d.findElement(OR.MbePackage_Desc).getText();
		
		if(Package_Name.equals(Get_Package_desc))
		{
			System.out.println("Package Description is Matched in Package page");
		}
		
		String Get_Room_Charges_Package=d.findElement(OR.Room_Charges_in_Package).getText();
		String[] Get_only_startDate=start_date.split("/");
		String[] Get_only_EndDay=End_Date.split("/");
		int Number_of_Nights=Integer.parseInt(Get_only_EndDay[2])-Integer.parseInt(Get_only_startDate[2]);
		Room_Charges=Number_of_Nights*Double.parseDouble(Room_Rate);
		double Tax_Calculation =Math.round(Double.parseDouble(Room_Rate)*Double.parseDouble(Tax_value));
		Tax_Services_Charges=Tax_Calculation/100*Number_of_Nights;
		double Tax= Tax_Services_Charges+Room_Charges;
		if((Tax+"").equals(Get_Room_Charges_Package))
		{
			System.out.println("Room charges is Matched in Package page");
		}
		
		String Get_Package_Counts =d.findElement(OR.Get_package_Cost).getText().trim();
		package_Cost_Calculation=Math.round(Number_of_Nights*Double.parseDouble(Adult)*Double.parseDouble(PackageRate));
		 DecimalFormat f = new DecimalFormat("##");
		if(("$"+f.format(package_Cost_Calculation)).equalsIgnoreCase(Get_Package_Counts))
		{
			System.out.println("Package cost is Matched in Package page");
		}
		test.log(LogStatus.PASS, "User Successfully verified package page");
			}
			catch(Exception e){
				test.log(LogStatus.PASS, "User failed verify package page");
				
			}
			
		   int package_Incer_Count=Integer.parseInt(PackageCountvalue);
		   for(int i=0;i<package_Incer_Count;i++)
		   {
			   d.findElement(OR.Click_quantity_plus).click();
				Wait.wait5Second();
		   }
		   
		
		 try{
		//*******************stay info ***********************//
		try
		{
		d.findElement(OR.Click_stay_info).click();
		Wait.wait5Second();
		
		//Room Name Verification
		String Get_RoomName_details_page=d.findElement(OR.Room_Name_Details_Page).getText();
		if(RoomClassName.equals(Get_RoomName_details_page))
		{
			System.out.println("Room Name Matched in Details page");
		}
		
		//verifying Arrive and Depart
		
		String Get_arrive_Date=d.findElement(OR.Get_arrive_Date).getText().trim();
		String Get_Depart_Date=d.findElement(OR.Get_Depart_Date).getText().trim();
		String Get_arrive_Depart_Dates = Get_arrive_Date+ "-" +Get_Depart_Date;
		
		
		if(Arrival_Depature_Dates.equals(Get_arrive_Depart_Dates))
		{
			System.out.println("Arrival and Depature Dates matched in details page");
		}
		
		
		//Number of Nights
		
		String Get_Number_Nights=d.findElement(OR.Get_Number_Nights).getText();
		String[] Get_only_startDate=start_date.split("/");
		String[] Get_only_EndDay=End_Date.split("/");
		int Number_of_Nights=Integer.parseInt(Get_only_EndDay[2])-Integer.parseInt(Get_only_startDate[2]);
		String Nights = Number_of_Nights+"";
		if(Nights.equals(Get_Number_Nights))
		{
			System.out.println("Number of Nights Macthes");
		}
		
		//verifying adults/childern
		
		String Get_Adult_Count_Details_page=d.findElement(OR.Get_Number_Adults).getText();
		String Get_Child_Count_Details_Page=d.findElement(OR.Get_Number_Children).getText();
		String Get_adult_Child_Count=Get_Adult_Count_Details_page+"/"+Get_Child_Count_Details_Page;
		
		String Num_Adult_Child= Adult+"/"+Child;
		
		if(Num_Adult_Child.equals(Get_adult_Child_Count))
		{
			System.out.println("Number of Childs and Adults Matched in Details page");
		}
		test.log(LogStatus.PASS, "User Successfully verified stay page");
		}
		catch(Exception e)
		{
			test.log(LogStatus.PASS, "User failed to  verify stay page");
		}
		
		//*******************Rate info ***********************//
		
		//Verifying Taxes and Surcharges
		
		String Get_Tax=d.findElement(OR.Get_Tax_surcharge).getText().trim();
		System.out.println("Get_Tax: "+Get_Tax);
		double Round_of_Room = Math.round(Double.parseDouble(Room_Rate)*Double.parseDouble(Tax_value));
		double Tax_Calculation_with_Rooms=Number_of_Nights*Round_of_Room/100;
		double Tax_calculation_with_package=Number_of_Nights*Double.parseDouble(Adult)*Double.parseDouble(PackageRate)*(Double.parseDouble(Tax_value));

		double Round_of_package =Tax_calculation_with_package*(Double.parseDouble(PackageCountvalue))/100;
		double Round_off_value= Tax_Calculation_with_Rooms+Round_of_package;
		Round_of_package2= String.format("%,.2f", Round_off_value);
		System.out.println("Round_off_value: "+Round_off_value+"");
		if((Round_of_package2).equals(Get_Tax))
		{
			System.out.println("Tax Calculation Matched");
		}
		
		
		//Verifying Room Charges
		
		String Get_Room_chargess=d.findElement(OR.Get_Room_Charges).getText().trim();
		double Calculate_Room_Charges = Number_of_Nights*(Double.parseDouble(Room_Rate))+(Number_of_Nights*Double.parseDouble(Adult)*Double.parseDouble(PackageRate)*(Double.parseDouble(PackageCountvalue)));
		Room_Chargess = String.format("%,.2f", Calculate_Room_Charges);;
		if((Room_Chargess).equals(Get_Room_chargess))
		{
			System.out.println("Room Charge Calculation Matched");
		}
		
		
		//Verifying Room Balance
		
		String Get_Total_Balance=d.findElement(OR.Get_Balance).getText().trim();
		double Total_Balance_Charges = Double.parseDouble(Room_Chargess)+Double.parseDouble(Round_of_package2);
		String Total_Balance=Total_Balance_Charges+"";
		if(Total_Balance.equals(Get_Total_Balance))
		{
			System.out.println("Total Balance Calculation Matched");
		}
		
		
		//Verifying Total charges
		
		String Get_Total_charges=d.findElement(OR.Get_Total_charge).getText().trim();
		double Set_Total_Charges = Double.parseDouble(Room_Chargess)+Double.parseDouble(Round_of_package2);
		String Total_Charges=Set_Total_Charges+"";
		System.out.println("Total_Charges: "+Total_Charges);
		
		if(Total_Charges.equals(Get_Total_charges))
		{
			System.out.println("Total Charges Calculation Matched");
		}
		
		//Verifying Deposit
		
		String Get_Deposit=d.findElement(OR.Deposit).getText();
		
		if(("0.00").equals(Get_Deposit))
		{
			System.out.println("Deposit Calculation Matched");
		}
		
		//Verifying Incidentals
		
		String Get_Incidentails=d.findElement(OR.Incidentals).getText();
		
		if(("0.00").equals(Get_Incidentails))
		{
			System.out.println("Incidentals Calculation Matched");
		}
		test.log(LogStatus.PASS, "User Successfully verified rateinfo page");
		
		//*******************Summary info ***********************//*
		
		//verifying Rate Description
		
		List<WebElement> Number_Line_items = d.findElements(OR.Get_Number_of_line_items);
	    String Number = Number_Line_items.size()+"";
		
		/*if(Nights.equals(Number_Line_items.size()))
		{
			System.out.println("Number of line items matched");
		}*/
		
		//Amount
		
		for(int i=0;i<Number_Line_items.size();i++)
		{
			try
			{
			if(d.findElement(OR.Get_Day_one_Rate).getText().trim().equals(Room_Rate));
			double Package_cost_stay_info=Double.parseDouble(PackageRate)*Double.parseDouble(Adult)*Number_of_Nights;
			DecimalFormat f = new DecimalFormat("##.00");
		     System.out.println(f.format(Package_cost_stay_info));
			if(d.findElement(OR.Get_Day_two_Rate).getText().trim().equals(f.format(Package_cost_stay_info)));
			if(d.findElement(OR.Get_Day_Three_Rate).getText().trim().equals(Room_Rate));
			if(d.findElement(OR.Get_Day_Four_Rate).getText().trim().equals(Room_Rate));
			
			if(d.findElement(OR.Get_Des_1).getText().trim().equals(Rate_Display_Name));
			if(d.findElement(OR.Get_Des_2).getText().trim().equals(Package_Name));
			if(d.findElement(OR.Get_Des_3).getText().trim().equals(Rate_Display_Name));
			if(d.findElement(OR.Get_Des_3).getText().trim().equals(Rate_Display_Name));
			}
			catch(Exception e)
			{
				
					System.out.println("Failed");
				
			}
			
			
		}
		test.log(LogStatus.PASS, "User Successfully verified stay info page");
		 }
		 catch(Exception e)
		 {
			 test.log(LogStatus.FAIL, "User failed to verify stay info page");
		 }
		   
		
		
		
		try
		{
		//Guest Details or Guest info
		d.findElement(OR.Guest_Continue).click();
		Wait.wait5Second();
		d.findElement(OR.MbeFirstName).sendKeys(FirstName);
		d.findElement(OR.MbeLastName).sendKeys(LastName);
		d.findElement(OR.MbePhone).sendKeys(PhnNumber);
		d.findElement(OR.MbeEmail).sendKeys(Email);
		d.findElement(OR.MbeAddress).sendKeys(Address1);
		d.findElement(OR.MbeCity).sendKeys(City);
		d.findElement(OR.Mbepostal).sendKeys(Zip);
		new Select (d.findElement(OR.MbeState)).selectByVisibleText(State);
		Wait.wait2Second();
		new Select (d.findElement(OR.MbeCountry)).selectByVisibleText(Country);
		Wait.wait2Second();
		test.log(LogStatus.PASS, "User Successfully entered and verified Guest details");
		 }
		 catch(Exception e)
		 {
			 test.log(LogStatus.FAIL, "User failed to enter and verify Guest details");
		 }
		//Payment info
		try
		{
		new Select (d.findElement(OR.MbePaymentMethod)).selectByVisibleText(CardType);
		Wait.wait2Second();
		d.findElement(OR.MbeCardNumber).sendKeys(CardNumber);
		new Select (d.findElement(OR.MbeExp_Month)).selectByVisibleText(ExpriyMonth);
		Wait.wait2Second();
		new Select (d.findElement(OR.MebExp_Year)).selectByVisibleText(ExpriyYear);
		Wait.wait2Second();
		new Select (d.findElement(OR.MbeReferral)).selectByVisibleText(ReferralText);
		Wait.wait2Second();
		/* if(d.findElements(OR.MbeCvv).size()!=0)
		 {
			 d.findElement(OR.MbeCvv).sendKeys(CVV);
		 }
		 else
		 {
			 System.out.println("CVV number is displayed");
		 }*/
		test.log(LogStatus.PASS, "User Successfully entered and verified payment details");
		 }
		 catch(Exception e)
		 {
			 test.log(LogStatus.FAIL, "User fail to enter and verify payment details");
		 }
		 
		 //Special instruction
		 
		 d.findElement(OR.Expand_Special_Instruction).click();
		 Wait.wait2Second();
		 d.findElement(OR.Expand_Special_Instruction_text).sendKeys(SpecialInstructionText);
		
		 //Click on Review button 
		d.findElement(OR.Click_Review).click();
		Wait.wait5Second();
		
		//Stay info
		
		
	
		String Get_RoomName_details_page_Review=d.findElement(OR.Room_Name_Details_Page).getText();
		if(RoomClassName.equals(Get_RoomName_details_page_Review))
		{
			System.out.println("Room Name Matched in Details page");
		}
		
		//verifying Arrive and Depart
		
		String Get_arrive_Date_Review=d.findElement(OR.Get_arrive_Date).getText().trim();
		String Get_Depart_Date_Review=d.findElement(OR.Get_Depart_Date).getText().trim();
		String Get_arrive_Depart_Dates_Review = Get_arrive_Date_Review+ "-" +Get_Depart_Date_Review;
		if(Arrival_Depature_Dates.equals(Get_arrive_Depart_Dates_Review))
		{
		System.out.println("Arrival and Depature Dates matched in details page");
		}
		
		//Number of Nights
		
		String Get_Number_Nights_Review=d.findElement(OR.Get_Number_Nights).getText();
		String[] Get_only_startDate_Review=start_date.split("/");
		String[] Get_only_EndDay_Review=End_Date.split("/");
		int Number_of_Nights_Review=Integer.parseInt(Get_only_EndDay_Review[2])-Integer.parseInt(Get_only_startDate_Review[2]);
		String Nights_Review = Number_of_Nights_Review+"";
		if(Nights_Review.equals(Get_Number_Nights_Review))
		{
		System.out.println("Number of Nights Macthes");
		}
				
		//verifying adults/childern
				
		String Get_Adult_Count_Details_page_Review=d.findElement(OR.Get_Number_Adults).getText();
		String Get_Child_Count_Details_Page_Review=d.findElement(OR.Get_Number_Children).getText();
		String Get_adult_Child_Count_Review=Get_Adult_Count_Details_page_Review+"/"+Get_Child_Count_Details_Page_Review;
		String Num_Adult_Child_Review= Adult+"/"+Child;
		if(Num_Adult_Child_Review.equals(Get_adult_Child_Count_Review))
		{
		System.out.println("Number of Childs and Adults Matched in Details page");
		}
		
		
		//Rate info
		
		d.findElement(OR.Rate_info_Review).click();
		Wait.wait2Second();
		try
		{
		if(d.findElement(OR.Get_Day_one_Rate).getText().trim().equals(Room_Rate));
		double Package_cost_stay_info=Double.parseDouble(PackageRate)*Double.parseDouble(Adult)*Number_of_Nights;
		DecimalFormat f = new DecimalFormat("##.00");
	     System.out.println(f.format(Package_cost_stay_info));
		if(d.findElement(OR.Get_Day_two_Rate).getText().trim().equals(f.format(Package_cost_stay_info)));
		if(d.findElement(OR.Get_Day_Three_Rate).getText().trim().equals(Room_Rate));
		if(d.findElement(OR.Get_Day_Four_Rate).getText().trim().equals(Room_Rate));
		
		if(d.findElement(OR.Get_Des_1).getText().trim().equals(Rate_Display_Name));
		if(d.findElement(OR.Get_Des_2).getText().trim().equals(Package_Name));
		if(d.findElement(OR.Get_Des_3).getText().trim().equals(Rate_Display_Name));
		if(d.findElement(OR.Get_Des_3).getText().trim().equals(Rate_Display_Name));
		}
		catch(Exception e)
		{
			
				System.out.println("Failed");
			
		}
		
		//Verify Taxes in review
		
		String Get_Tax=d.findElement(OR.Get_Tax_surcharge).getText().trim();
		System.out.println("Get_Tax: "+Get_Tax);
		if((Round_of_package2).equals(Get_Tax))
		{
			System.out.println("Tax Calculation Matched in review");
		}
		
		//Verifying Room Charges
		
				String Get_Room_chargess=d.findElement(OR.Get_Room_Charges).getText().trim();
				if((Room_Chargess).equals(Get_Room_chargess))
				{
					System.out.println("Room Charge Calculation Matched in review");
				}
				//Verifying Room Balance
				
				String Get_Total_Balance=d.findElement(OR.Get_Balance).getText().trim();
				double Total_Balance_Charges = Double.parseDouble(Room_Chargess)+Double.parseDouble(Round_of_package2);
				String Total_Balance=Total_Balance_Charges+"";
				if(Total_Balance.equals(Get_Total_Balance))
				{
					System.out.println("Total Balance Calculation Matched in review");
				}
				
				
				//Verifying Total charges
				
				String Get_Total_charges=d.findElement(OR.Get_Total_charge).getText().trim();
				double Set_Total_Charges = Double.parseDouble(Room_Chargess)+Double.parseDouble(Round_of_package2);
				String Total_Charges=Set_Total_Charges+"";
				System.out.println("Total_Charges: "+Total_Charges);
				
				if(Total_Charges.equals(Get_Total_charges))
				{
					System.out.println("Total Charges Calculation Matched in review");
				}
				
				//Verifying Deposit
				
				String Get_Deposit=d.findElement(OR.Deposit).getText();
				
				if(("0.00").equals(Get_Deposit))
				{
					System.out.println("Deposit Calculation Matched in review");
				}
				
				//Verifying Incidentals
				
				String Get_Incidentails=d.findElement(OR.Incidentals).getText();
				
				if(("0.00").equals(Get_Incidentails))
				{
					System.out.println("Incidentals Calculation Matched in review");
				}
					
				
				
		//Guest info in review
				
				d.findElement(OR.click_Guest_info).click();
				Wait.wait2Second();
				
				String Get_Guest_Name=d.findElement(OR.Guest_Name).getText().trim();
				if(Review_Guest_Name.equals(Get_Guest_Name))
				{
					System.out.println("Guest Name Matched in review");
				}
				
				
				String Get_Phone_number=d.findElement(OR.Phone_number).getText();
				if(Review_Phn_Number.equals(Get_Phone_number))
				{
					System.out.println("Phone number Matched in review");
				}
				
				String Get_Email =d.findElement(OR.mbeReview_Email).getText().trim();
				if(Email.equals(Get_Email))
				{
					System.out.println("Email Matched in review");
				}
				
				String Get_Address =d.findElement(OR.Meb_Address1).getText().trim();
				if(Address1.equals(Get_Address))
				{
					System.out.println("Address Matched in review");
				}
				
				String Get_City =d.findElement(OR.Mbe_City).getText().trim();
				if(City.equals(Get_City))
				{
					System.out.println("City Matched in review");
				}
				
				String Get_state =d.findElement(OR.Mbe_State).getText().trim();
				if(State.equals(Get_state))
				{
					System.out.println("State Matched in review");
				}
				
				String Get_Zipcode =d.findElement(OR.Mbe_zipcode).getText().trim();
				if(Zip.equals(Get_Zipcode))
				{
					System.out.println("Zipcode Matched in review");
				}
				
				String Get_Country =d.findElement(OR.Mbe_Country).getText().trim();
				if(Country.equals(Get_Country))
				{
					System.out.println("country Matched in review");
				}
				test.log(LogStatus.PASS, "User Successfully entered and verified guest info details in review");
				
				//Billing info
				
				JavascriptExecutor jse = (JavascriptExecutor)d;
				jse.executeScript("scroll(0, 2000);");
				d.findElement(OR.mbeBilling_info).click();
				Wait.wait2Second();
				
				String Get_Guest_Name_Billing=d.findElement(OR.Guest_Name_billing).getText().trim();
				if(Review_Guest_Name.equals(Get_Guest_Name_Billing))
				{
					System.out.println("Guest Name Matched in review_Billing");
				}
				
				String Get_Phone_number_Billing=d.findElement(OR.Phone_number_Billing).getText();
				if(Review_Phn_Number.equals(Get_Phone_number_Billing))
				{
					System.out.println("Phone number Matched in review_Billing");
				}
				
				String Get_Email_Billing =d.findElement(OR.Email_billing).getText().trim();
				if(Email.equals(Get_Email_Billing))
				{
					System.out.println("Email Matched in review_Billing");
				}
				
				String Get_Address_Billing =d.findElement(OR.Address_billing).getText().trim();
				if(Address1.equals(Get_Address_Billing))
				{
					System.out.println("Address Matched in review_Billing");
				}
				String Get_City_Billing =d.findElement(OR.city_Billing).getText().trim();
				if(City.equals(Get_City_Billing))
				{
					System.out.println("City Matched in review_Billing");
				}
				
				String Get_state_Billing =d.findElement(OR.state_Billing).getText().trim();
				if(State.equals(Get_state_Billing))
				{
					System.out.println("State Matched in review_Billing");
				}
				
				String Get_Zipcode_Billing =d.findElement(OR.Postal_Billing).getText().trim();
				if(Zip.equals(Get_Zipcode_Billing))
				{
					System.out.println("Zipcode Matched in review_Billing");
				}
				
				String Get_Country_Billing =d.findElement(OR.Country_Billing).getText().trim();
				if(Country.equals(Get_Country_Billing))
				{
					System.out.println("Country Matched in review_Billing");
				}
				
				String Get_Bill_Type =d.findElement(OR.Bill_Type).getText().trim();
				if(CardType.equals(Get_Bill_Type))
				{
					System.out.println("Billing type Matched in review_Billing");
				}
				
				String Get_Billing_card=d.findElement(OR.Bill_Account_Number).getText().trim();
				if(Billing_Card_Number.equals(Get_Billing_card))
				{
					System.out.println("Billing card Matched in review_Billing");
				}		
				test.log(LogStatus.PASS, "User Successfully entered and verified Billing info details in review");
				
				//Special Instruction
				//JavascriptExecutor jse = (JavascriptExecutor)d;
				jse.executeScript("scroll(0, 2000);");
				d.findElement(OR.Click_Special_Instruction).click();
				Wait.wait2Second();
				
				String Get_Special_Text=d.findElement(OR.MbeSpecial_Instruction_Text).getText().trim();
				if(SpecialInstructionText.equals(Get_Special_Text))
				{
					System.out.println("Special Text Matched in review");
				}	
				
				d.findElement(OR.Check_agree).click();
				Wait.wait2Second();
				
				d.findElement(OR.MbeBook).click();
				Wait.wait5Second();
				
				//Book page
				
				try
				{
					String Get_Booking_Confirmation =d.findElement(OR.Booking_Confirmation).getText();
					if(("An email with your reservation details has been sent to the email address provided.").equals(Get_Booking_Confirmation))
					{
						System.out.println("Special Text Matched in review");
					}	
					
					
					d.findElement(OR.stay_info_Bookingpage).click();
					Wait.wait2Second();
					
					
					
					String Get_RoomName_details_page_Bookingpage=d.findElement(OR.Room_Name_Details_Page).getText();
					if(RoomClassName.equals(Get_RoomName_details_page_Bookingpage))
					{
						System.out.println("Room Name Matched in Details page");
					}
					
					//verifying Arrive and Depart
					
					String Get_arrive_Date_Booking=d.findElement(OR.Get_arrive_Date).getText().trim();
					String Get_Depart_Date_Booking=d.findElement(OR.Get_Depart_Date).getText().trim();
					String Get_arrive_Depart_Dates_Booking = Get_arrive_Date_Booking+ "-" +Get_Depart_Date_Booking;
					if(Arrival_Depature_Dates.equals(Get_arrive_Depart_Dates_Booking))
					{
					System.out.println("Arrival and Depature Dates matched in details page");
					}
					
					//Number of Nights
					
					String Get_Number_Nights_Booking=d.findElement(OR.Get_Number_Nights).getText();
					String[] Get_only_startDate_Booking=start_date.split("/");
					String[] Get_only_EndDay_Booking=End_Date.split("/");
					int Number_of_Nights_Booking=Integer.parseInt(Get_only_EndDay_Booking[2])-Integer.parseInt(Get_only_startDate_Booking[2]);
					String Nights_Booking = Number_of_Nights_Booking+"";
					if(Nights_Booking.equals(Get_Number_Nights_Booking))
					{
					System.out.println("Number of Nights Macthes");
					}
							
					//verifying adults/childern
							
					String Get_Adult_Count_Details_page_Booking=d.findElement(OR.Get_Number_Adults).getText();
					String Get_Child_Count_Details_Page_Booking=d.findElement(OR.Get_Number_Children).getText();
					String Get_adult_Child_Count_Booking=Get_Adult_Count_Details_page_Booking+"/"+Get_Child_Count_Details_Page_Booking;
					String Num_Adult_Child_Booking= Adult+"/"+Child;
					if(Num_Adult_Child_Booking.equals(Get_adult_Child_Count_Booking))
					{
					System.out.println("Number of Childs and Adults Matched in Details page");
					}
					
					
					//Rate info 
					
					jse.executeScript("scroll(0, 2000);");
					d.findElement(OR.Rate_info_Bookingpage).click();
					Wait.wait2Second();
					
					
					try
					{
					if(d.findElement(OR.Get_Day_one_Rate).getText().trim().equals(Room_Rate));
					double Package_cost_stay_info=Double.parseDouble(PackageRate)*Double.parseDouble(Adult)*Number_of_Nights;
					DecimalFormat f = new DecimalFormat("##.00");
				     System.out.println(f.format(Package_cost_stay_info));
					if(d.findElement(OR.Get_Day_two_Rate).getText().trim().equals(f.format(Package_cost_stay_info)));
					if(d.findElement(OR.Get_Day_Three_Rate).getText().trim().equals(Room_Rate));
					if(d.findElement(OR.Get_Day_Four_Rate).getText().trim().equals(Room_Rate));
					
					if(d.findElement(OR.Get_Des_1).getText().trim().equals(Rate_Display_Name));
					if(d.findElement(OR.Get_Des_2).getText().trim().equals(Package_Name));
					if(d.findElement(OR.Get_Des_3).getText().trim().equals(Rate_Display_Name));
					if(d.findElement(OR.Get_Des_3).getText().trim().equals(Rate_Display_Name));
					}
					catch(Exception e)
					{
						
							System.out.println("Failed");
						
					}
					
					//Verify Taxes in review
					
					String Get_Tax_Bookpage=d.findElement(OR.Get_Tax_surcharge).getText().trim();
					System.out.println("Get_Tax: "+Get_Tax);
					if((Round_of_package2).equals(Get_Tax_Bookpage))
					{
						System.out.println("Tax Calculation Matched in book page");
					}
					
					//Verifying Room Charges
					
							String Get_Room_chargess_Book=d.findElement(OR.Get_Room_Charges).getText().trim();
							if((Room_Chargess).equals(Get_Room_chargess_Book))
							{
								System.out.println("Room Charge Calculation Matched in Book page");
							}
							//Verifying Room Balance
							
							String Get_Total_Balance_Bookpage=d.findElement(OR.Get_Balance).getText().trim();
							double Total_Balance_Charges_Bookpage = Double.parseDouble(Room_Chargess)+Double.parseDouble(Round_of_package2);
							String Total_Balance_Bookpage=Total_Balance_Charges_Bookpage+"";
							if(Total_Balance_Bookpage.equals(Get_Total_Balance_Bookpage))
							{
								System.out.println("Total Balance Calculation Matched in Book page");
							}
							
							
							//Verifying Total charges
							
							String Get_Total_charges_Bookpage=d.findElement(OR.Get_Total_charge).getText().trim();
							double Set_Total_Charges_Bookpage = Double.parseDouble(Room_Chargess)+Double.parseDouble(Round_of_package2);
							String Total_Charges_Bookpage=Set_Total_Charges+"";
							System.out.println("Total_Charges_Bookpage: "+Total_Charges_Bookpage);
							
							if(Total_Charges_Bookpage.equals(Get_Total_charges_Bookpage))
							{
								System.out.println("Total Charges Calculation Matched in review");
							}
							
							//Verifying Deposit
							
							String Get_Deposit_Bookpage=d.findElement(OR.Deposit).getText();
							
							if(("0.00").equals(Get_Deposit_Bookpage))
							{
								System.out.println("Deposit Calculation Matched in review");
							}
							
							//Verifying Incidentals
							
							String Get_Incidentails_Bookpage=d.findElement(OR.Incidentals).getText();
							
							if(("0.00").equals(Get_Incidentails_Bookpage))
							{
								System.out.println("Incidentals Calculation Matched in review");
							}
								
							jse.executeScript("scroll(0, 2000);");
							d.findElement(OR.Guest_info_Bookingpage).click();
							Wait.wait2Second();
							String Get_Guest_Name_Book=d.findElement(OR.Guest_Name).getText().trim();
							if(Review_Guest_Name.equals(Get_Guest_Name_Book))
							{
								System.out.println("Guest Name Matched in review");
							}
							
							
							String Get_Phone_number_Book=d.findElement(OR.Phone_number).getText();
							if(Review_Phn_Number.equals(Get_Phone_number_Book))
							{
								System.out.println("Phone number Matched in review");
							}
							
							String Get_Email_Book =d.findElement(OR.mbeReview_Email).getText().trim();
							if(Email.equals(Get_Email_Book))
							{
								System.out.println("Email Matched in review");
							}
							
							String Get_Address_Book =d.findElement(OR.Meb_Address1).getText().trim();
							if(Address1.equals(Get_Address_Book))
							{
								System.out.println("Address Matched in review");
							}
							
							String Get_City_Book =d.findElement(OR.Mbe_City).getText().trim();
							if(City.equals(Get_City_Book))
							{
								System.out.println("City Matched in review");
							}
							
							String Get_state_Book =d.findElement(OR.Mbe_State).getText().trim();
							if(State.equals(Get_state_Book))
							{
								System.out.println("State Matched in review");
							}
							
							String Get_Zipcode_Book =d.findElement(OR.Mbe_zipcode).getText().trim();
							if(Zip.equals(Get_Zipcode_Book))
							{
								System.out.println("Zipcode Matched in review");
							}
							
							String Get_Country_Book =d.findElement(OR.Mbe_Country).getText().trim();
							if(Country.equals(Get_Country_Book))
							{
								System.out.println("country Matched in review");
							}
							jse.executeScript("scroll(0, 2000);");
							d.findElement(OR.Billing_info_Bookingpage).click();
							Wait.wait2Second();
							String Get_Guest_Name_Billing_Book=d.findElement(OR.Guest_Name_billing).getText().trim();
							if(Review_Guest_Name.equals(Get_Guest_Name_Billing_Book))
							{
								System.out.println("Guest Name Matched in review_Billing");
							}
							
							String Get_Phone_number_Billing_Book=d.findElement(OR.Phone_number_Billing).getText();
							if(Review_Phn_Number.equals(Get_Phone_number_Billing_Book))
							{
								System.out.println("Phone number Matched in review_Billing");
							}
							
							String Get_Email_Billing_Book =d.findElement(OR.Email_billing).getText().trim();
							if(Email.equals(Get_Email_Billing_Book))
							{
								System.out.println("Email Matched in review_Billing");
							}
							
							String Get_Address_Billing_Book =d.findElement(OR.Address_billing).getText().trim();
							if(Address1.equals(Get_Address_Billing_Book))
							{
								System.out.println("Address Matched in review_Billing");
							}
							String Get_City_Billing_Book =d.findElement(OR.city_Billing).getText().trim();
							if(City.equals(Get_City_Billing_Book))
							{
								System.out.println("City Matched in review_Billing");
							}
							
							String Get_state_Billing_Book =d.findElement(OR.state_Billing).getText().trim();
							if(State.equals(Get_state_Billing_Book))
							{
								System.out.println("State Matched in review_Billing");
							}
							
							String Get_Zipcode_Billing_Book =d.findElement(OR.Postal_Billing).getText().trim();
							if(Zip.equals(Get_Zipcode_Billing_Book))
							{
								System.out.println("Zipcode Matched in review_Billing");
							}
							
							String Get_Country_Billing_Book =d.findElement(OR.Country_Billing).getText().trim();
							if(Country.equals(Get_Country_Billing_Book))
							{
								System.out.println("Country Matched in review_Billing");
							}
							
							String Get_Bill_Type_Book =d.findElement(OR.Bill_Type).getText().trim();
							if(CardType.equals(Get_Bill_Type_Book))
							{
								System.out.println("Billing type Matched in review_Billing");
							}
							
							String Get_Billing_card_Book=d.findElement(OR.Bill_Account_Number).getText().trim();
							if(Billing_Card_Number.equals(Get_Billing_card_Book))
							{
								System.out.println("Billing card Matched in review_Billing");
							}		
							jse.executeScript("scroll(0, 2000);");
							d.findElement(OR.Special_Instruction_Bookingpage).click();
							Wait.wait2Second();
							String Get_Special_Text_Book=d.findElement(OR.MbeSpecial_Instruction_Text).getText().trim();
							if(SpecialInstructionText.equals(Get_Special_Text_Book))
							{
								System.out.println("Special Text Matched in review");
							}	
							
					
					
							test.log(LogStatus.PASS, "User Successfully entered and verified Billing info details in review");
					
				}
				catch(Exception e)
				{
					
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
				Object data[][] = TestUtil.getData(datatable_suite1, "MBE_Adults_Childs");
				return data;
			}
	
	

}
