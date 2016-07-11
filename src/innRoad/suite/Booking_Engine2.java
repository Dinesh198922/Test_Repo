package innRoad.suite;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import innRoad.config.BaseTest;
import innRoad.config.TestUtil;

public class Booking_Engine2 extends BaseTest {

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
		  
		  
		  
		  booking_Engine(URL, Https, TCN, PageTitle, Month, ArrivalDate, DepartureDate, Adultcount, childrenscount, Promocode, Promotionvalue, Room_PageTitle, Test_Mode_Verification, StayDetailsmodify, StayModifymessage, month2, ModifyAdult, ModifyChild, propertyName, RackRateTitle, GetRateName, GetpolicyName, RoomClassName, Rate, RoomsPackageModify, CurrencyType, RoomRate, PackageRate, PackageName, PackageDes, Packageincrcount, TaxValue, GuestDetailsTitle, Email, FirstName, LastName, PhnNumber, Address1, Address2, City, State, Zip, Country, IsBilling, BillingFname, BillingLName, BillingPhn, BillingEmail, BillingAddress1, BillingAddress2, BillingCity, BillingState, BillingZip, BillingCountry, CardType, CardNumber, ExpriyMonth, ExpriyYear, CVV, SpecialInstructionText, ReferralText, Review_Guest_Name, Review_Phn_Number, Review_Billing_Guest_Name, Review_Billing_Phn_Number, Review_Card_Type, Review_Expiry_Date, Review_CVV_Code, Modify_Email, Modify_FirstName, Modify_LastName, Modify_PhnNumber, Modify_Address1, Modify_Address2, Modify_City, Modify_State, Modify_Zip, Modify_Country, Modify_IsBilling, Modify_BillingFname, Modify_BillingLName, Modify_BillingPhn, Modify_BillingEmail, Modify_BillingAddress1, Modify_BillingAddress2, Modify_BillingCity, Modify_BillingState, Modify_BillingZip, Modify_BillingCountry, Modify_CardType, Modify_CardNumber, Modify_ExpriyMonth, Modify_ExpriyYear, Modify_CVV, Modify_Review_Guest_Name, Modify_Review_Phn_Number, Modify_Review_Billing_Guest_Name, Modify_Review_Billing_Phn_Number, Modify_Review_Card_Type, Modify_Review_Expiry_Date, Modify_Review_CVV_Code);
		  
		  
	  }
	  
	  
	  @AfterClass
		public void stop() {
			setupAfterSuite();
			stopDriver();
		}

		@DataProvider(name = "testParameterData", parallel = false)
		public static Object[][] testParameterData(Method method) throws Exception {

			initialize();
			Object data[][] = TestUtil.getData(datatable_suite1, "Booking_Engine2");
			return data;
		}
	

	
	

}

	

