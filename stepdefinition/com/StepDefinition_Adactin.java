package com.stepdefinition.com;
import org.openqa.selenium.WebDriver;
import com.MavenProject.Base_Class;
import com.PoManagerBase.Adactin_PoManager_Base;
import com.Reader_Class.FileReaderManager;
import com.testrunnercucum.com.Adactin_cucumRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDefinition_Adactin extends Base_Class{
public static WebDriver driver = Adactin_cucumRunner.driver;
Adactin_PoManager_Base pom = new Adactin_PoManager_Base(driver);
@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
	    get(FileReaderManager.getInstanceFR().getInstanceCR().getUrl());
	 }
@When("^user Enters The Username In the InputBox$")
	public void user_Enters_The_Username_In_the_InputBox() throws Throwable {
	   sendkeys(pom.getInstancePomlogin().getUser(),"Dhivya1204");
	 }
@When("^user Enters The Password In The InputBox$")
	public void user_Enters_The_Password_In_The_InputBox() throws Throwable {
	  sendkeys(pom.getInstancePomlogin().getPass(),"3WB138");  
}
//@When("^user Enters The Username In the InputBox$")
//public void user_Enters_The_Username_In_the_InputBox(String username) throws Throwable {
//   sendkeys(pom.getInstancePomlogin().getUser(),username);
// }
//@When("^user Enters The Password In The InputBox$")
//public void user_Enters_The_Password_In_The_InputBox(String password) throws Throwable {
//  sendkeys(pom.getInstancePomlogin().getPass(),password); 
//}
@Then("^user Clicks The Login Button And The Page Gets Navigated To Search_Hotel Page$")
	public void user_Clicks_The_Login_Button_And_The_Page_Gets_Navigated_To_Search_Hotel_Page() throws Throwable {
	    click(pom.getInstancePomlogin().getLoginbtn()); 
	}
@When("^user Selects The Location From The Dropdown$")
	public void user_Selects_The_Location_From_The_Dropdown() throws Throwable {
		single_dropdown(pom.getInstancePomsearch().getLoc(), "Sydney", "value");
	}
@When("^user Selects The Hotels From The Dropdown$")
	public void user_Selects_The_Hotels_From_The_Dropdown() throws Throwable {
	   single_dropdown(pom.getInstancePomsearch().getHotels(), "Hotel Creek", "value"); 
	   }
@When("^user Selects The Roomtype From The Dropdown$")
	public void user_Selects_The_Roomtype_From_The_Dropdown() throws Throwable {
		single_dropdown(pom.getInstancePomsearch().getRoomtype(), "Standard", "value");
	    }
@When("^user Selects The Roomnos From The Dropdown$")
	public void user_Selects_The_Roomnos_From_The_Dropdown() throws Throwable {
		single_dropdown(pom.getInstancePomsearch().getRoomnos(), "1", "value");  
	    	}
@When("^user Selects The Adultroom From The Dropdown$")
	public void user_Selects_The_Adultroom_From_The_Dropdown() throws Throwable {
		single_dropdown(pom.getInstancePomsearch().getAdultroom(), "1", "value");
	    }
@When("^user Selects The Childroom From The Dropdown$")
	public void user_Selects_The_Childroom_From_The_Dropdown() throws Throwable {
		single_dropdown(pom.getInstancePomsearch().getChildroom(), "1", "value"); 
	    }
@Then("^user Clicks The Submit Button And The Page Gets Navigated To Select_Hotel Page$")
	public void user_Clicks_The_Submit_Button_And_The_Page_Gets_Navigated_To_Select_Hotel_Page() throws Throwable {
	    click(pom.getInstancePomsearch().getSubmit());
	    }
@When("^user Clicks The Radio Button To Select The Hotel$")
	public void user_Clicks_The_Radio_Button_To_Select_The_Hotel() throws Throwable {
	   click(pom.getInstancePomcontinue().getRadio()); 
		
	    }
@Then("^user Clicks The Continue Button And The Page Gets Navigated To Book_Now Page$")
	public void user_Clicks_The_Continue_Button_And_The_Page_Gets_Navigated_To_Book_Now_Page() throws Throwable {
	    click(pom.getInstancePomcontinue().getContinu());
	    }
@When("^user Enters The Firstname In The Inputbox$")
	public void user_Enters_The_Firstname_In_The_Inputbox() throws Throwable {
	    sendkeys(pom.getInstancePombooknow().getFirstname(),"Dhivya");
	    }
@When("^user Enters The Lastname In The Inputbox$")
	public void user_Enters_The_Lastname_In_The_Inputbox() throws Throwable {
		sendkeys(pom.getInstancePombooknow().getLastname(),"Kumar");
	    }
@When("^user Enters The Address In The Inputbox$")
	public void user_Enters_The_Address_In_The_Inputbox() throws Throwable {
		sendkeys(pom.getInstancePombooknow().getAddr(),"Melbourne"); 
	   }
@When("^user Enters The CreditCardnumber In The Inputbox$")
	public void user_Enters_The_CreditCardnumber_In_The_Inputbox() throws Throwable {
		sendkeys(pom.getInstancePombooknow().getCcnum(),"1234567890123456");
	    }
@When("^user Selects The CreditCardtype From The Dropdown$")
	public void user_Selects_The_CreditCardtype_From_The_Dropdown() throws Throwable {
	    single_dropdown(pom.getInstancePombooknow().getCctype(), "AMEX", "value");
	    }
@When("^user Selects The ExpiryMonth Of The CreditCard From The Dropdown$")
	public void user_Selects_The_ExpiryMonth_Of_The_CreditCard_From_The_Dropdown() throws Throwable {
		single_dropdown(pom.getInstancePombooknow().getExpmonth(), "1", "value");
	   }
@When("^user Selects The ExpiryYear Of The CreditCard From The Dropdown$")
	public void user_Selects_The_ExpiryYear_Of_The_CreditCard_From_The_Dropdown() throws Throwable {
		single_dropdown(pom.getInstancePombooknow().getExpyear(), "2022", "value"); 
	   }
@When("^user Enters The CVV Of The CreditCard In The Inputbox$")
	public void user_Enters_The_CVV_Of_The_CreditCard_In_The_Inputbox() throws Throwable {
	    sendkeys(pom.getInstancePombooknow().getCvv(),"1234");
	    }
@Then("^user Clicks The Booknow Button And The Page Gets Navigated To Myiternary_Page$")
	public void user_Clicks_The_Booknow_Button_And_The_Page_Gets_Navigated_To_Myiternary_Page() throws Throwable {
	    click(pom.getInstancePombooknow().getBooknow());
	    Impwait(2000);
	}
@Then("^user Clicks The Myiternary Button$")
	public void user_Clicks_The_Myiternary_Button() throws Throwable {
	    click(pom.getInstancePommyiter().getMyiter());
	    Impwait(2000);
	}
@Then("^user Clicks The Logout Button And Displays The Loggedout Successfully$")
	public void user_Clicks_The_Logout_Button_And_Displays_The_Loggedout_Successfully() throws Throwable {
	    click(pom.getInstancePomlogout().getLogout());
}
}