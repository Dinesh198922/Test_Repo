package innRoad.properties;

import org.openqa.selenium.By;

public class OR {
	
	static String x = ("Css/img/unavailable_day.png");

	public static By ClientCode = By.xpath("//*[@id='txtclientCode']");
	public static By UserId=By.xpath("//*[@id='txtLoginID']");
	public static By Password = By.xpath("//*[@id='txtUserPassword']");
	public static By Loginbtn = By.xpath("//*[@id='btnLogon']");
	
	
	public static By Get_Block_Dates=By.xpath("//div[@style='background-image: url("+x+");']/span");
	
	
	
	
	
	//Promotion code in BE
	public static By Promo_Code_link=By.xpath("//*[@id='divPromoCodehref']/a");
	public static By Promotioncodeobject = By.id("AvailabilitySearch1_txtPromoCode");
	
	
	// Selecting Year from calendar
	
	public static By Calendar_Header=By.className("calender_header");
	public static By Getting_Years=By.className("months_yearstrip");
	
	//Selecting Month from calendar
	
	public static By Getting_Months=By.className("small_big_container_strip");
	
	//Selecting Dates
	
	public static By Getcheckintext=By.xpath("//span[@class='widget_label_2']");
	public static By GetCheckinDates=By.xpath("//span[2]/span");
	public static By GetCheckoutDate=By.xpath("//div[3]/span[2]/span");
	public static By GetCheckouttext=By.xpath("//div[3]/span/span");

	
	//Test Mode
	
	public static By Test_Mode_Strip = By.id("MainContent_lblTestModeMsg");
	
	//Find My reservation
	
	public static By Find_Reservation_link=By.id("AvailabilitySearch1_lnkMyReservations");
	
	//Promotion code
	
	
	//Select Rooms
	
	public static By Rooms_Checkin_Date=By.id("AvailabilitySearch1_lbkChkInDate");
	public static By Rooms_Checkout_Date=By.id("AvailabilitySearch1_lbkChkOutDate");
	public static By Rooms_Checkin_Week=By.id("AvailabilitySearch1_lblChkInDayOfTheWeek");
	public static By Rooms_Checkout_Week=By.id("AvailabilitySearch1_lblChkOutDayOfTheWeek");
	public static By Rooms_Checkout_Mon_Year=By.id("AvailabilitySearch1_lblChkOutMonthAndYear");
	public static By Rooms_Checkin_Mon_Year=By.id("AvailabilitySearch1_lblChkInMonthAndYear");
	public static By Rooms_Checkin_Text=By.xpath("//div[@id='AvailabilitySearch1_chkInPanel']/fieldset/legend");
	public static By Rooms_Checkout_Text=By.xpath("//div[@id='AvailabilitySearch1_chkOutPanel']/fieldset/legend");
	public static By Rooms_Property_Name=By.id("AvailabilitySearch1_lblPropertyName");
	public static By Rooms_Num_of_Nights=By.xpath("//div[@class='nights summery_box_container_div1']");
	public static By Rooms_Adchild=By.xpath("//div[@class='guest_adchild summery_box_container_div1']");
	public static By Rooms_Verify_Promotion_Code=By.xpath("//*[@id='AvailabilitySearch1_promocode_summery_box_container_div1']/span");
	public static By Rooms_Rack_Rate_Info=By.xpath("//*[@id='lnkMoreInfo']");
	public static By Rooms_Get_Rack_Rate_title=By.xpath("//*[@id='TB_ajaxWindowTitle']");
	public static By Rooms_Get_Rate_Name=By.xpath("//*[@id='Div8']/table/tbody/tr[2]/td[2]");
	public static By Rooms_Get_Policy_Name=By.xpath("//*[@id='Div8']/table/tbody/tr[4]/td[2]");
	public static By Rooms_Close_Rack_Rate_popup=By.xpath("//*[@id='TB_closeWindowButton']");
	public static By Rooms_get_Rate=By.xpath("//*[@id='MainContent_rptrPropertyList_lblMinRate_0']");
	public static By Rooms_get_Nighty_rate=By.xpath("//*[@id='MainContent_rptrPropertyList_rptPropertyRooms_0_tdRateDescription_0']/span");
	public static By Rooms_Click_Select=By.xpath("//*[@id='MainContent_rptrPropertyList_rptPropertyRooms_0_btnSelect_0']");
	public static By Rooms_Click_Select2=By.xpath("//*[@id='MainContent_rptrPropertyList_rptPropertyRooms_2_btnSelect_0']");
	
	public static By stay_modify_link=By.xpath("//div[@id='divModifyDatesDialog']/div");
	public static By stay_modify_Yes=By.xpath("//div[@class='ui-dialog-buttonset']/button[1]");
	public static By stay_Modify_No=By.xpath("//div[@class='ui-dialog-buttonset']/button[2]");
	public static By Get_Class_Room_Name=By.xpath("//tr[@id='MainContent_rptrPropertyList_trContent_0']/td/table/tbody/tr/td[2]/table/tbody/tr/td/div");
	
	
	//Inventory Rates
	
	public static By Inventory=By.xpath("//*[@id='rptrMenu_btnMenuItem_3']");
	public static By Rates=By.xpath("//*[@id='rptrMenu_lbtnMenuItem_2']");
	public static By Click_New_Rate=By.xpath("//*[@id='btnNew']");
	public static By Rate_Name=By.xpath("//*[@id='txRateName']");
	public static By Max_Adult=By.xpath("//*[@id='txtMaxAdults']");
	public static By Max_Person=By.xpath("//*[@id='txtMaxPersons']");
	public static By Base_Amount=By.xpath("//*[@id='txtAmount']");
	public static By Additional_Adult=By.xpath(".//*[@id='txtAddedAdultsAmt']");
	public static By Additional_Persons=By.xpath("//*[@id='txtAddedPersonAmt']");
	public static By Rate_Display_Name=By.xpath("//*[@id='txtDisplayName']");
	public static By Rate_Policy_Name=By.xpath("//*[@id='txtRatePolicy']");
	public static By Rate_Description=By.xpath("//*[@id='txtRateDescription']");
	public static By Associate_Seasons=By.xpath("//*[@id='btnEditSeasons']");
	public static By Get_Seasons=By.xpath("//select/option");
	public static By Pick_one=By.id("btnPickOne");
	public static By Done=By.id("btnSave");
	public static By Room_Class_Rates=By.id("btnEditRoomClasses");
	public static By Get_list_rooms=By.id("lstRooms");
	public static By Get_Source_list=By.id("btnAssociateSource");
	public static By Get_Source_Name=By.xpath("//tr[@class='dgItem']/td[2]");
	public static By Get_Source_Name2=By.xpath("//tr[@class='dgItemAlt']/td[2]");
	public static By select_Conditional_Rate=By.xpath("//input[@id='rbtnRackRateYes']");
	public static By Text_Promo_code=By.xpath("//input[@id='txtPromoCode']");
	public static By Rate_Floor=By.xpath("//input[@id='rbtnLowestRateYes']");
	public static By Interval_Rate=By.xpath("//input[@id='txtInterval']");
	public static By Done_Rooms =By.id("btnDone");
	
	//Seasons
	
	public static By Seasons=By.id("rptrMenu_lbtnAltMenuItem_1");
	public static By Select_Seasons_Property=By.xpath("//select[starts-with(@data-bind,'options: PropertiesList')]");
	public static By EG_Select_Seasons_Property=By.id("drpPropertyList");
	public static By New_Seasons = By.xpath("//div[@class='footer_buttons']/button[1]");
	public static By EG_New_Seasons=By.id("btnNew");
	public static By EG_Season_Name=By.id("txtSeasonName");
	public static By Season_Name=By.xpath("//input[@placeholder='Season Name']");
	public static By EG_Season_start_Date=By.xpath("//td[@class='day today']");
	public static By Season_start_Date=By.xpath("//input[@placeholder='Start Date']");
	public static By Season_End_Date=By.xpath("//input[@placeholder='End Date']");
	public static By EG_Season_End_Date=By.id("txtDateEnd");
	public static By Season_Save=By.xpath("//button[contains(@data-bind, 'saveSeasonDetail')]");
	public static By EG_Season_Save=By.id("btnSave");
	public static By EG_start_Picker=By.xpath("//*[@id='ContentArea']/tbody/tr/td[2]/table[2]/tbody/tr[6]/td[2]/a");
	public static By EG_End_picker=By.xpath("//*[@id='ContentArea']/tbody/tr/td[2]/table[2]/tbody/tr[7]/td[2]/a/img");
	
	
	
	//Taxes
	
	public static By Taxes=By.id("rptrMenu_lbtnMenuItem_2");
	public static By Select_Tax_Property=By.id("drpPropertyList");
	public static By Get_Num_items=By.xpath("//input[starts-with(@id,'dgTaxItemList_chkSelected')]");
	public static By Select_Items=By.id("dgTaxItemList_chkSelected_0");
	public static By Delete_Tax=By.id("btnDelete");
	public static By Tax_validation_Message=By.id("LblError");
	public static By New_item=By.id("btnNew");
	public static By Item_Name=By.id("txtTaxItemName");
	public static By Tax_Display_Name=By.id("txtTaxItemDisplayName");
	public static By Tax_Description_Name=By.id("txtTaxItemDescription");
	public static By Tax_value=By.id("txtTaxItemValue");
	public static By Tax_Percent=By.id("chkIsPercent");
	public static By Category_Dropdown=By.id("drpCategory");
	public static By Edit_Taxes=By.id("btnEditTaxes");
	public static By Pick_one_item=By.id("btnPickOne");
	public static By DoneButton=By.id("Button1");
	public static By DoneButton2=By.id("btnDone");
	
	//Packages
	
	public static By Package=By.id("btnPackages");
	public static By validation_message=By.xpath("//span[@id='LblError']");
	public static By New_Package=By.xpath("//input[@id='btnNew']");
	public static By package_Name=By.id("txRateName");
	public static By Packageradio=By.id("rblstRateTypes_2");
	public static By Package_Dsiplay_text=By.id("txtDisplayName");
	public static By Package_Rate_policy=By.id("txtRatePolicy");
	public static By Package_Description=By.id("txtRateDescription");
	public static By select_Rate=By.id("drpRatePlan");
	public static By Select_Addon=By.id("rdblPackageAvail_1");
	public static By Add_Compenents=By.id("btnAddComponents");
	public static By Select_Category=By.id("dgRateComponents_drpCategory_0");
	public static By Calculation_Method=By.id("dgRateComponents_drpCalculationMethod_0");
	public static By Calculation_amount=By.id("dgRateComponents_txtComponentAmount_0");
	public static By always_Avaliable=By.id("chkAlwaysAvailable");
	public static By Associate_Rate=By.id("btnAssociateRate");
	public static By Rate_property=By.id("drpPropertyList");
	public static By Room_Classes_filter=By.id("drpRoomClassList");
	public static By Seasons_Filter=By.id("drpSeasonsList");
	public static By Rate_plan=By.id("drpRateplanList");
	public static By Go_button=By.id("btnGoSearch");
	public static By Get_Num_Packges=By.xpath("//span[@class='dgItem']/input");
	public static By Delete_Packages=By.id("btnDelete");
	public static By Select_Year=By.id("drpYear");
	public static By select_Rate_Package=By.id("dgRatesList_chkSelected_0");
	public static By Select_button_package=By.id("btnSelect");
	public static By Done_Rate_Package=By.id("btnDone");
	
	
	
	//Enhance your stay
	
	public static By Enhance_page_title=By.xpath("//*[@id='Div3']/div/div[3]/div/div[2]/div[2]/div[2]/div/span[1]");
	public static By Rooms_Packages_Table=By.xpath("//*[@id='divRoomsClass']/table");
	public static By Room_Class_Text=By.xpath("//div[@id='divRoomsClass']/table/tbody/tr[2]/td/table/tbody/tr/td");
	public static By Room_Class_Name=By.xpath("//*[@id='AvailabilitySearch1_lblRoomType']");
	public static By Rooms_Package_Modify_link=By.xpath("//*[@id='hrefModifyRoomClass']");
	public static By Rate_Summary_Table=By.xpath("//*[@id='trRateSummary']/td/table");
	public static By Amount_Type=By.xpath("//*[@id='divAllAmount2']");
	public static By Room_Charges=By.xpath("//*[@id='FolioSummary1_lblResRoomCharges']");
	public static By Tax_Charges=By.xpath("//*[@id='FolioSummary1_lblResTaxSurcharge']");
	public static By Room_Charges_with_$=By.xpath("//*[@id='trRoomCharges']/td[2]");
	public static By Total_Charges=By.xpath("//*[@id='FolioSummary1_lblResTotalCharges']");
	public static By open_Rate_Details=By.xpath("//*[@id='OpenRatesDialog']");
	public static By Rate_Details_Title=By.xpath("//*[@id='TB_ajaxWindowTitle']");
	public static By Rate_Details_Room_Charges =By.xpath("//*[@id='trlblResRoomCharges']/td[3]/span");
	public static By Rate_Details_Tax_Charges=By.xpath("//*[@id='trResTaxSurcharge']/td[3]/span");
	public static By Rate_Details_Total_Charges=By.xpath("//*[@id='trTotalCharges']/td[3]/span");
	public static By Rate_Details_Currency_Type=By.xpath("//*[@id='divAllAmount1']");
	public static By Rate_Details_Popup_Close=By.xpath("//*[@id='TB_closeWindowButton']");
	public static By Package_Rate=By.xpath("//div[@class='package_page_pricing_price']");
	public static By Package_Name=By.xpath("//*[@id='tblPropertyList']/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td");
	public static By Package_Desc=By.xpath("//div[@class='package_page_discription']");
	public static By Package_incr=By.xpath("//*[@id='btnPachageIncrease']");
	public static By Select_Button_Enhance=By.xpath("//*[@id='MainContent_imgbContinueReservation']");
	
	//Guest Details
	
	public static By Get_Guest_Details_Title=By.xpath("//div[@class='booking_pages_heading']");
	public static By Edit_Modify_link=By.xpath("//*[@id='hrefModifyPackage']");
	public static By Get_Packages_Count=By.xpath("//*[@id='tablePackages']/tbody/tr[2]/td");
	public static By Grt_Room_Charges=By.xpath("//*[@id='trRoomCharges']/td[2]");
	public static By Get_Incidentals=By.xpath("//*[@id='trIncidentals']/td[2]");
	public static By Get_Tax=By.xpath("//*[@id='trTaxes']/td[2]");
	public static By Get_Total_charges=By.xpath("//*[@id='trResTotalCharges']/td[2]/span");
	public static By Enter_Email=By.xpath("//*[@id='MainContent_txtMailingEmail']");
	public static By First_Name=By.xpath("//*[@id='MainContent_txtGuestFirstName']");
	public static By Last_Name=By.xpath("//*[@id='MainContent_txtGuestLastName']");
	public static By Phone_Number=By.xpath("//*[@id='MainContent_txtMailing_PhoneNumber']");
	public static By Address1=By.xpath("//*[@id='MainContent_txtMailing_address1']");
	public static By Address2=By.xpath("//*[@id='MainContent_txtMailing_address2']");
	public static By City=By.xpath("//*[@id='MainContent_txtMailing_city']");
	public static By State=By.xpath("//*[@id='MainContent_drpMailing_territoryID']");
	public static By zip=By.xpath("//*[@id='MainContent_txtMailing_postalCode']");
	public static By Country =By.xpath("//*[@id='MainContent_drpMailing_countryID']");
	
	//Billing details
	
	public static By Billing_info=By.xpath("//*[@id='reserve_billing_heading']");
	public static By Billing_FName=By.xpath("//*[@id='MainContent_txtBilling_FirstName']");
	public static By Billing_LName=By.xpath("//*[@id='MainContent_txtBilling_LastName']");
	public static By Billing_Phnumber=By.xpath("//*[@id='MainContent_txtBilling_phoneNumber']");
	public static By Billing_Email=By.xpath("//*[@id='MainContent_txtBillingEmail']");
	public static By Billing_Address1=By.xpath("//*[@id='MainContent_txtBilling_address1']");
	public static By Billing_Address2=By.xpath("//*[@id='MainContent_txtBilling_address2']");
	public static By Billing_City=By.xpath("//*[@id='MainContent_txtBilling_city']");
	public static By Billing_State=By.xpath("//*[@id='MainContent_drpBilling_territoryID']");
	public static By Billing_Postal=By.xpath("//*[@id='MainContent_txtBilling_postalCode']");
	public static By Billing_Country=By.xpath("//*[@id='MainContent_drpBilling_countryID']");
	
	//Payment details
	
	public static By Payment_info=By.xpath("//*[@id='MainContent_divPaymentInfo']/div[1]");
	
	//Special Instruction
	
	public static By Special_instruction=By.xpath("//*[@id='Div3']/div/div[3]/div/div[2]/div[2]/div[2]/div[6]");
	public static By Special_Instruction_Text=By.xpath("//*[@id='MainContent_txtSpecialInstructions']");
	
	//Aditional Details
	
	public static By Addition_Details=By.xpath("//*[@id='divAddDetailsHeader']");
	public static By Referral_Dropdown=By.xpath("//*[@id='MainContent_drpReferrals']");
	public static By Continue_Review=By.xpath("//*[@id='MainContent_imgbReview']");
	
	
	//Global search button
	
	public static By Search_Icon=By.id("ucNavShortcut_rptrMenu_btnMenuItem_0");
	public static By Client_Drop_Down=By.xpath("//*[@id='s2id_ucPanelSupport_drpClientList']/a/span[2]");
	public static By support_Panel=By.xpath("//*[@id='tblPanelSupport']/tbody/tr[1]/td/font");
	public static By Aut_Search=By.id("//input[@id='s2id_autogen1_search']");
	
	
	//Room_Classes_Setup
	
	public static By setup =By.xpath("//*[@id='rptrMenu_btnMenuItem_4']");
	public static By Room_Classes=By.xpath("//*[@id='rptrMenu_lbtnAltMenuItem_1']");
	
	
	//Rooms_Classes_Setup
	
	public static By Select_property=By.xpath("//div[@id='roomClassSearch']/div/div[2]/form/div/div/div/div/div/div/select");
	public static By New_Class_Room=By.xpath("//div[@class='footer_buttons']/button[1]");
	public static By Enter_Room_Class_Name=By.xpath("//input[@placeholder='Room Class Name']");
	public static By Room_Class_Abbreviation=By.xpath("//input[@placeholder='Room Class Abbreviation']");
	public static By Click_Rooms_Tab=By.xpath("//a[@data-bind='click: ShowCurrentDiv(1)']");
	public static By Enter_Max_Adult=By.xpath("//input[@placeholder='Max Adults']");
	public static By Enter_Room_quantity=By.xpath("//input[@placeholder='Room Quantity']");
	public static By create_Rooms=By.xpath("//button[@data-bind='click: createRooms']");
	public static By Enter_Room_Number=By.xpath("//input[starts-with(@data-bind, 'value: RoomNumber, enable:')]");
	public static By Enter_station_id=By.xpath("//input[starts-with(@data-bind, 'value: StationId, enable:')]");
	public static By Enter_sort_order=By.xpath("//input[starts-with(@data-bind, 'value: RoomSortOrder, enable:')]");
	public static By Click_Assign_Rooms=By.xpath("//button[starts-with(@data-bind,'click: assignRooms, enable:')]");
	public static By Click_Publish=By.xpath("//button[starts-with(@data-bind,'click: publishDetail')]");
	public static By Enter_Max_Person=By.xpath("//input[@placeholder='Max Persons']");
	
	//Review page_Guest information verification
	
	public static By Review_Guest_Name=By.xpath("//*[@id='MainContent_lbGuestName']");
	public static By Review_Phone_Number=By.xpath("//*[@id='MainContent_lblMailPhoneNumber']");
	public static By Review_Email=By.xpath("//*[@id='MainContent_lblMailEmail']");
	public static By Review_Address=By.xpath("//*[@id='MainContent_lbMailing_address1']");
	public static By Review_Address2=By.xpath("//*[@id='MainContent_lbMailing_address2']");
	public static By Review_City=By.xpath("//*[@id='MainContent_lbMailing_city']");
	public static By Review_State=By.xpath("//*[@id='MainContent_lbMailing_territoryID']");
	public static By Review_Postal_Code=By.xpath("//*[@id='MainContent_lbMailing_postalCode']");
	public static By Review_Country=By.xpath("//*[@id='MainContent_lbMailing_countryID']");
	public static By Review_Referral=By.xpath("//*[@id='MainContent_lblReferral']");
	
	//Review Page_Billing information
	
	public static By Review_Billing_Head=By.xpath("//div[@id='tbGuestInfo']/div[3]/div");
	public static By Review_Billing_Name=By.xpath("//*[@id='MainContent_lbBilling_Name']");
	public static By Review_Billing_Phone_Number=By.xpath("//*[@id='MainContent_lblBillPh']");
	public static By Review_Billing_Email=By.xpath("//*[@id='MainContent_lblBillEmail']");
	public static By Review_Billing_Address1=By.xpath("//*[@id='MainContent_lbBilling_address1']");
	public static By Review_Billing_Address2=By.xpath("//*[@id='MainContent_lbBilling_address2']");
	public static By Review_Billing_City=By.xpath("//*[@id='MainContent_lblBillCity']");
	public static By Review_Billing_State=By.xpath("//*[@id='MainContent_lbBilling_territoryID']");
	public static By Review_Billing_Postal_Code=By.xpath("//*[@id='MainContent_lbBilling_postalCode']");
	public static By Review_Billing_Country=By.xpath("//*[@id='MainContent_lbBilling_countryID']");
	
	//Review Page_Payment information
	
	public static By Review_Payment_Method=By.xpath("//*[@id='MainContent_lbBilling_TypeID']");
	public static By Review_Card_Number=By.xpath("//*[@id='MainContent_lbBilling_AccountNumber']");
	public static By Review_Expiry_Date=By.xpath("//*[@id='MainContent_lbBilling_CreditCardExpirationDate']");
	public static By Review_CVV_Code=By.xpath("//*[@id='MainContent_lblBilling_BillingNotes_Masked']");
	
	//modify Guest info
	
	public static By Reserv_Modify=By.xpath("//*[@id='MainContent_refReserveOne']");
	
	//Payment method
	
	public static By Payment_Method=By.xpath("//select[@id='MainContent_drpBilling_TypeID']");
	
	//Terms and Conditions
	
	public static By Terms_Conditions=By.xpath("//*[@id='MainContent_chkTermsAndCondition']");
	
	//Book
	
	public static By Book=By.xpath("//*[@id='MainContent_imgBookit']");
	
	public static By Get_Reservation_Number =By.xpath("//*[@id='MainContent_lbConfirmation']");
	
	//start new reservation 
	
	public static By Start_New_Reservation=By.xpath("//*[@id='MainContent_refStartOver']");
	public static By Find_My_Reservation=By.xpath("//*[@id='AvailabilitySearch1_lnkMyReservations']");
	public static By Confirmation_Number=By.xpath("//*[@id='MainContent_txtReservationID']");
	public static By Email_Address=By.xpath("//*[@id='MainContent_txtEmail']");
	public static By Find_Reservation=By.xpath("//*[@id='MainContent_btnSubmit']");
	
	//Reservation details page
	
	
	public static By Reservation_Details_Email=By.xpath("//*[@id='MainContent_lbEmail']");
	public static By Reservation_Details_Billingcity=By.xpath("//*[@id='MainContent_lbBilling_city']");
	
	
	//MBE
	
	public static By Property_Name=By.xpath("//h1[@class='ui-title singleproperty_heading']/span");
	public static By Click_Book=By.xpath("//a[@id='desc_button']");
	public static By Inc_Adults=By.xpath("//span[@id='adults_plus']");
	public static By Click_Date_picker=By.xpath("//span[@class='period_picker_label']");
	public static By Check_Availability=By.id("check_availBtn");
	public static By Get_All_months=By.xpath("//th[@class='monthName']");
	public static By Sticky_Header_Adultchild=By.xpath("//*[@id='stickyheader']/ul/li[2]");
	public static By Get_Selectable_Days=By.xpath("//td[@class='selectable_day']");
	public static By Get_Arrival_Depature_dates=By.xpath("//*[@id='stickyheader']/ul/li[1]");
	public static By Get_Room_Class_Name=By.xpath("//*[@id='rptrPropertyList_trcontent_0']/div/h3");
	public static By Get_Room_Title=By.xpath("//*[@id='available_rooms_title']");
	public static By Test_Mode_Message=By.xpath("//*[@id='lblTestModeMsg']");
	public static By Get_start_Date=By.xpath("//span[@id='lblstartDate']");
	public static By Get_End_Date=By.xpath("//span[@id='lblendDate']");	
	
	public static By Available_Rooms_Adult_Count = By.xpath("//*[@id='search_criteria']/li/div/div[3]");
	
	public static By Get_Room_Price=By.xpath("//*[@id='rptrPropertyList_bestratelbl_0']");
	public static By Next_Page=By.xpath("//*[@id='rptrPropertyList_trcontent_0']//span[2]/span");
	public static By Room_Name_Details_Page=By.xpath("//*[@id='lbRoomClassName']"); 
	public static By Get_arrive_Date=By.xpath("//span[@id='lbArrive']");
	public static By Get_Depart_Date=By.xpath("//span[@id='lbDepart']");
	public static By Get_Number_Nights=By.xpath("//span[@id='lblNights']");
	public static By Get_Number_Adults=By.xpath("//span[@id='lbAdults']");
	public static By Get_Number_Children=By.xpath("//span[@id='lbChildren']");
	public static By Get_Tax_surcharge=By.xpath("//*[@id='FolioSummary1_lblResTaxSurcharge']");
	public static By Get_Room_Charges = By.xpath("//*[@id='FolioSummary1_lblResRoomCharges']");
	public static By Get_Balance=By.xpath("//*[@id='FolioSummary1_lblResBalance']");
	public static By Get_Total_charge=By.xpath("//*[@id='FolioSummary1_lblResTotalCharges']");
	public static By Deposit=By.xpath("//*[@id='FolioSummary1_lblResPayments']");
	public static By Incidentals=By.xpath("//*[@id='FolioSummary1_lblResIncidentals']");
	public static By Get_Number_of_line_items=By.xpath("//span[starts-with(@id,'dgLineItems_lbldateeffective_')]");
	public static By Get_Day_one_Rate=By.xpath("//*[@id='dgLineItems_lblAmount_0']");
	public static By Get_Day_two_Rate=By.xpath("//*[@id='dgLineItems_lblAmount_1']");
	public static By Get_Day_Three_Rate=By.xpath("//*[@id='dgLineItems_lblAmount_2']");
	public static By Get_Day_Four_Rate=By.xpath("//*[@id='dgLineItems_lblAmount_3']");
	public static By Get_Des_1=By.xpath("//*[@id='dgLineItems']/tbody/tr[2]/td[2]");
	public static By Get_Des_2=By.xpath("//*[@id='dgLineItems']/tbody/tr[3]/td[2]");
	public static By Get_Des_3=By.xpath("//*[@id='dgLineItems']/tbody/tr[4]/td[2]");
	public static By Get_Des_4=By.xpath("//*[@id='dgLineItems']/tbody/tr[5]/td[2]");
	
	//Add Package
	
	public static By Add_Package_title=By.xpath("//*[@id='pnlPackages']/ul/li[1]");
	public static By Test_Mode_in_Package=By.xpath("//*[@id='Span1']");
	public static By Room_Name_in_Package=By.id("lbRoomClassName");
	public static By Adult_Count_in_Package=By.xpath("//*[@id='Form1']/div[3]/div[6]/div[4]");
	public static By MbePackage_Name=By.xpath("//*[@id='pnlPackages']/ul/li[2]/div/div[1]/div/h3");
	public static By MbePackage_Desc=By.xpath("//*[@id='pnlPackages']/ul/li[2]/div/div[1]/div/p");
	public static By Room_Charges_in_Package=By.xpath("//*[@id='lblResRoomCharges']");
	public static By Get_package_Cost=By.xpath("//*[@id='pnlPackages']/ul/li[2]/div/div[1]/div/table/tbody/tr[1]/td[2]/span");
	public static By Click_quantity_plus=By.id("quantity_plus");
	
	//stay info
	
	public static By Click_stay_info=By.id("imgbContinueReservation");
	
	//Guest Details
	public static By Guest_Continue=By.xpath("//*[@id='nextBtn_stayinfo']/span[3]");
	public static By MbeFirstName=By.id("txtGuestFirstName");
	public static By MbeLastName=By.id("txtGuestLastName");
	public static By MbePhone=By.id("txtMailing_PhoneNumber");
	public static By MbeEmail=By.id("txtMailingEmail");
	public static By MbeAddress=By.id("txtMailing_address1");
	public static By MbeCity=By.id("txtMailing_city");
	public static By Mbepostal=By.id("txtMailing_postalCode");
	public static By MbeState=By.id("drpMailing_territoryID");
	public static By MbeCountry=By.id("drpMailing_countryID");
	
	public static By MbePaymentMethod=By.id("drpBilling_TypeID");
	public static By MbeCardNumber=By.id("txtBilling_AccountNumber");
	public static By MbeCvv=By.id("cvvPlaceholder");
	public static By MbeExp_Month=By.id("exp_month");
	public static By MebExp_Year=By.id("exp_year");
	public static By MbeReferral=By.id("drpReferrals");
	
	public static By Expand_Special_Instruction=By.xpath("//*[@id='guest_info']/div[2]/div[5]/div/h3/a/span/span[2]");
	public static By Expand_Special_Instruction_text=By.id("txtSpecialInstructions");
	
	//Review
	
	public static By Click_Review=By.id("imgbReview");
	
	//Rate_info
	
	public static By Rate_info_Review =By.xpath("//*[@id='frmReserveOne']/div[3]/div[8]/div[2]/div/h3/a/span/span[2]");
	
	//Guest_info
	
	public static By click_Guest_info=By.xpath("//*[@id='frmReserveOne']/div[3]/div[8]/div[3]/div/h3/a/span/span[2]");
	public static By Guest_Name=By.xpath("//*[@id='lbGuestName']");
	public static By Phone_number=By.xpath("//*[@id='lblMailPhoneNumber']");
	public static By mbeReview_Email=By.xpath("//*[@id='lblMailEmail']");
	public static By Meb_Address1=By.xpath("//*[@id='lbMailing_address1']");
	public static By Mbe_City=By.xpath("//*[@id='lbMailing_city']");
	public static By Mbe_State=By.xpath("//*[@id='lbMailing_territoryID']");
	public static By Mbe_zipcode=By.xpath("//*[@id='lbMailing_postalCode']");
	public static By Mbe_Country=By.xpath("//*[@id='lbMailing_countryID']");
	
	//Billing_info
	
	public static By mbeBilling_info=By.xpath("//*[@id='frmReserveOne']/div[3]/div[8]/div[4]/div/h3/a/span/span[2]");
	//*[@id='frmReserveOne']/div[3]/div[8]/div[4]/div/h3/a/span
	public static By Guest_Name_billing = By.xpath("//*[@id='lbBilling_Name']");
	public static By Phone_number_Billing=By.xpath("//*[@id='lblBillPh']");
	public static By Email_billing =By.xpath("//*[@id='lblBillEmail']");
	public static By Address_billing=By.xpath("//*[@id='lbBilling_address1']");
	public static By city_Billing=By.xpath("//*[@id='lblBillCity']");
	public static By state_Billing=By.xpath("//*[@id='lbBilling_territoryID']");
	public static By Postal_Billing=By.xpath("//*[@id='lbBilling_postalCode']");
	public static By Country_Billing=By.xpath("//*[@id='lbBilling_countryID']");
	public static By Bill_Type=By.xpath("//*[@id='lbBilling_TypeID']");
	public static By Bill_Account_Number=By.xpath("//*[@id='lbBilling_AccountNumber']");
	
	//Special Instruction
	
	public static By Click_Special_Instruction=By.xpath("//*[@id='frmReserveOne']/div[3]/div[8]/div[5]/div/h3/a/span/span[2]");
	public static By MbeSpecial_Instruction_Text=By.xpath("//*[@id='lbSpecialInstructions']");
	public static By Check_agree=By.xpath("//*[@id='frmReserveOne']/div[3]/div[9]/div[1]/span/div/label/span/span[2]");
	
	//Book
	
	public static By MbeBook=By.xpath("//*[@id='imgBookit']");
	public static By Booking_Confirmation=By.id("tdConfirmation");
	public static By Booking_Number=By.id("lbConfirmation");
	public static By stay_info_Bookingpage=By.xpath("//*[@id='main']/div/table/tbody/tr[2]/td/div[1]/div/h3/a/span/span[2]");
	public static By Rate_info_Bookingpage=By.xpath("//*[@id='main']/div/table/tbody/tr[2]/td/div[2]/div/h3/a/span/span[2]");
	public static By Guest_info_Bookingpage=By.xpath("//*[@id='main']/div/table/tbody/tr[2]/td/div[3]/div/h3/a/span/span[2]");
	public static By Billing_info_Bookingpage=By.xpath("//*[@id='page']/div[1]/div[3]/div/h3/a/span/span[2]");
	public static By Special_Instruction_Bookingpage=By.xpath("//*[@id='page']/div[1]/div[4]/div/h3/a/span/span[2]");
	
	
	
}
