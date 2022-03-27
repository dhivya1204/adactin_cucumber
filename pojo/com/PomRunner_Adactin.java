package com.pojo.com;
import org.openqa.selenium.WebDriver;
import com.MavenProject.Base_Class;
import com.PojoBaseClass.PomBase_Booknow;
import com.PojoBaseClass.PomBase_Continue;
import com.PojoBaseClass.PomBase_Login;
import com.PojoBaseClass.PomBase_Logout;
import com.PojoBaseClass.PomBase_Search;
import com.PojoBaseClass.PomBase_myiter;
public class PomRunner_Adactin extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = browserlaunch("chrome");
		get("https://adactinhotelapp.com/");
		PomBase_Login pomlogin = new PomBase_Login(driver);
		sendkeys(pomlogin.getUser(),"Dhivya1204");
		sendkeys(pomlogin.getPass(),"Dhivya@121");
		click(pomlogin.getLoginbtn());//login
		PomBase_Search pomsearch = new PomBase_Search(driver);
		single_dropdown(pomsearch.getLoc(), "Sydney", "value");
		single_dropdown(pomsearch.getHotels(), "Hotel Creek", "value");
		single_dropdown(pomsearch.getRoomtype(), "Standard", "value");
		single_dropdown(pomsearch.getRoomnos(), "1", "value");
		single_dropdown(pomsearch.getAdultroom(), "1", "value");
		single_dropdown(pomsearch.getChildroom(), "0", "value");
		click(pomsearch.getSubmit());	//submit
		PomBase_Continue pomcontinue = new PomBase_Continue(driver);
		click(pomcontinue.getRadio());
		click(pomcontinue.getContinu()); //continue
		PomBase_Booknow pombooknow = new PomBase_Booknow(driver);
		sendkeys(pombooknow.getFirstname(),"dhivya");
		sendkeys(pombooknow.getLastname(),"kumar");
		sendkeys(pombooknow.getAddr(),"Melbourne");
		sendkeys(pombooknow.getCcnum(),"1234567890123456");
		single_dropdown(pombooknow.getCctype(), "AMEX", "value");
		single_dropdown(pombooknow.getExpmonth(),"1","value");
		single_dropdown(pombooknow.getExpyear(),"2022","value");
		sendkeys(pombooknow.getCvv(),"1234");
		click(pombooknow.getBooknow()); //booknow
		Impwait(30);
		PomBase_myiter pommyiter = new PomBase_myiter(driver);
		click(pommyiter.getMyiter());
		PomBase_Logout pomlogout = new PomBase_Logout(driver);
		click(pomlogout.getLogout());
}
}
